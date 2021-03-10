package challengepackage;

import java.util.ArrayList;

public class QuestionMCQ extends Question {

	private ArrayList<String> alternatives;

	/**
	 * Constructor for MCQ type question 
	 * @param questionText
	 * @param correctAnswer
	 * @param score
	 * @param options - Array of Strings containing all answers which will be copied into a local ArrayList - should contain correctAnswer too
	 */
	public QuestionMCQ(String questionText, String correctAnswer, int score, String[] options) {
		super(questionText, correctAnswer, score);
		this.alternatives = new ArrayList<String>();
		for(String choice:options) {
			this.alternatives.add(choice);
		}
		
		if (!alternatives.contains(correctAnswer)) {
			System.out.println("Error. Specified Correct Answer not found in option list");
			System.out.println("Adding it as a fix rather than expection");
			alternatives.add(correctAnswer);
		}
	}
	
	/** 
	 * @param questionText
	 * @param correctAnswer
	 * @param score
	 * @param alternatives ArrayList of Strings containing all answers - should contain correctAnswer too
	 * 
	 * Constructor for MCQ type question with all fields
	 * note: if ArrayList created externally risk of side effect issues if same value reused due to reference type passed as parameter
	 */
	public QuestionMCQ(String questionText, String correctAnswer, int score, ArrayList<String> alternatives) {
		super(questionText, correctAnswer, score);
		this.alternatives = alternatives;
		
		if (!alternatives.contains(correctAnswer)) {
			System.out.println("Error. Specified Correct Answer not found in option list");
			System.out.println("Adding it as a fix rather than expection");
			alternatives.add(correctAnswer);
		}
	}

	/**
	 * @param answer
	 * 
	 * Expects A, B, C etc as answer (as MCQ)
	 * Compares to ensure a valid answer and checks if correct
	 * returns true/false but also prints for context, including invalid choices
	 */
	@Override
	public boolean checkAnswer(String answer) {
		int index = -1;
		boolean result = false;
		if (answer.trim().length()==1) {
			index = LetterToIndex(answer);
		}
		System.out.print("Your answer was: "+answer);
		if(index<0 || index >= alternatives.size()) {
			System.out.println();
			System.out.println("This was not a valid option!");
			result = false;
		}else {
			System.out.println(") "+alternatives.get(index));
			//valid index, so check for correct answer vs expected
			if (this.getCorrectAnswer().equals(alternatives.get(index))){
				System.out.println("Correct!");
				result = true;
			}else {
				System.out.println("Sorry this was incorrect!");
				System.out.println("The correct answer was: "+this.getCorrectAnswer());
				result = false;
			}
		}
		return result;
	}

	/**
	 * Print MCQ Question as prompt
	 * and list the Options (Append A, B, C etc to front)
	 */
	@Override
	public void askQuestion() {
		System.out.println(this.getQuestionText());
		System.out.println("Options:");
		// for(String alt: alternatives) {
		for (int i = 0; i < alternatives.size(); i++) {
			System.out.println(indexToLetter(i)+": " + alternatives.get(i));
		}
		System.out.println("<Multiple Choice, enter A,B,C etc.>");
	}

	/**
	 * Convert 0-25 to A-Z Return "ERR" if out of range
	 * 
	 * @param index
	 * @return
	 */
	private String indexToLetter(int index) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (index >= 0 && index <= 25) {
			//take char at given index in alphabet and add to empty string 
			return "" + alphabet.charAt(index);
		} else {
			return "ERR";
		}
	}
	
	/**
	 * Checks first letter of given string (expects single char, but handles if longer)
	 * Converts to numeric value to check from ArrayList
	 * @param choice
	 * @return
	 */
	private int LetterToIndex(String choice) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String firstChar = ""+choice.trim().toUpperCase().charAt(0);
		int index = alphabet.indexOf(firstChar);
		return index;
	}

}
