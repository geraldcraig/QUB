package challengepackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	
	private ArrayList<Question> questionList; 
	private int score;
	private int correctAnswerCount;
	private int qCount;

	public Quiz() {
		// TODO Auto-generated constructor stub
		this.questionList = new ArrayList<Question>();
		this.score = 0;
		this.correctAnswerCount=0;
	}
	
	/**
	 * Builds a quiz object of text match questions from 3 matching size input arrays
	 * @param qs
	 * @param as
	 * @param scores
	 */
	public Quiz(String[] qs, String[] as, int[] scores) {
		this.questionList = new ArrayList<Question>();
		this.score = 0;
		this.correctAnswerCount=0;
		if(qs.length != as.length && qs.length!= scores.length) {
			System.out.println("Error: input array sizes done match, no questions added!");
		}else {
			for(int i=0;i<qs.length;i++) {
				Question theQuestion = new TextMatchQuestion(qs[i],as[i],scores[i]);
				this.questionList.add(theQuestion);
			}
		}	
	}
	
	/**
	 * Constructor for Quiz object where questions are read from a file, 
	 * if file is properly formatted should be able to handle both TextMatch and MCQ type questions
	 * 
	 * @param filename
	 */
	public Quiz(String filename) {
		// if question list reads from file correctly, update instance variable, otherwise leave empty
		this.questionList = new ArrayList<Question>();
		this.score = 0;
		this.correctAnswerCount=0;
		
		ArrayList<Question> readFile = processQuestionFile(filename);
		if (readFile.size()>0) {
			System.out.println(readFile.size()+" questions read from file and added to Quiz object.");
			this.questionList = readFile;
		}else {
			System.out.println("Error: something went wrong with file handling functionality, no questions added!");
		}
	}
	
	/**
	 * Helper method to read questionList from preformatted csv file into ArrayList<Question>
	 * @param filename
	 * @return
	 */
	private ArrayList<Question> processQuestionFile(String filename){
		
		ArrayList<Question> qList = new ArrayList<Question>();
		
		File f = new File(filename);
		String line;

		// read and count
		try {
			FileReader rd = new FileReader(f);
			BufferedReader br = new BufferedReader(rd);

			// read expected first line (header data - not relevant to task - could check for errors)
			line = br.readLine();

			line = br.readLine();// read first actual line
			while (line != null) {
				String[] parts = line.split(",");
				if(parts[0].equals("0")) {
					//must be a regular textMatch Question
					//take the 3 relevant parts of the line and create a Question object
					//must convert score to an int, as it has been read as a String
					TextMatchQuestion q = new TextMatchQuestion(parts[1], parts[2], Integer.parseInt(parts[3]));
					qList.add(q);
				}else if(parts[0].equals("1")) {
					//must be MCQ
					//initial 3 parts same as text match, and any remaining parts will be option list
					String qText = parts[1];
					String aText = parts[2];
					int mcqScore = Integer.parseInt(parts[3]);
					ArrayList<String> mcqOptions = new ArrayList<String>();
					for(int i=4;i<parts.length;i++) {
						mcqOptions.add(parts[i]);
					}
					
					QuestionMCQ mcq = new QuestionMCQ(qText, aText, mcqScore, mcqOptions);
					qList.add(mcq);
					
					
				}else {
					System.out.println("Unrecognised type in file. Skipping to next line");
					continue;
				}
				
				//read next line of file
				line = br.readLine();
			}
			br.close();
			rd.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO error occured");
			//e.printStackTrace();
		}

		return qList;
		
	}
	
	/**
	 * add a given question object to the questionList arrayList
	 * Accepts all types of questions due to polymorphism
	 * @param q
	 */
	public void addQuestion(Question q) {
		questionList.add(q);
	}
	
	/**
	 * Simple version of running the Quiz
	 * Run through and ask all Questions in the list and keep a running score for correct answers
	 * Runtime polymorphism allows different question types in the same ArrayList to be called appropriately at run time
	 */
	public void runQuiz() {
		resetScore();
		qCount = this.questionList.size();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Quiz, there are "+ qCount + " questions");
		System.out.println("Good Luck!!");
		System.out.println("************");
		
		int count = 1;
		for (Question q:questionList) {
			System.out.print("Question "+count+ ") ");
			q.askQuestion();
			System.out.print("Enter your Answer: ");
			String response = sc.nextLine();
			System.out.println();
			
			boolean correct = q.checkAnswer(response);
			if(correct) {
				System.out.println("You got "+q.getScore()+ " point(s)");
				this.score += q.getScore();
				correctAnswerCount++;
			}
			System.out.println();
			count++;
		}
		
		outputStats();
				
		//sc.close();  
		//deliberately not closing scanner so it can be reused if required. 
		//Garbage collections should tidy it up anyway - https://stackoverflow.com/questions/26245468/what-does-scanner-close-do 
	}
	
	/**
	 * Reset score to zero eg if running Quiz again
	 */
	public void resetScore() {
		this.score = 0;
		this.correctAnswerCount = 0;
	}
	
	/**
	 * format score from most recent attempt at runing quiz
	 * qCount variable used in case there is a version that doesnt use all available questions (not currently implemented)
	 */
	public void outputStats() {
		System.out.println("*******************");
		System.out.println("You got "+this.correctAnswerCount+"/"+qCount+ " answer(s) correct");
		System.out.println("For a total score of "+this.score);
		System.out.println("*******************");
	}

}
