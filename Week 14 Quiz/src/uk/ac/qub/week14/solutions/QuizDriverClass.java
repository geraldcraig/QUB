package challengepackage;

import java.util.ArrayList;

public class QuizDriverClass {
	public static void main(String[] args) {
		
		String[] questions = new String[] { "What colour should a banana be?", "Whats the Capital of France?", "Whats the  first name of the blue Sega hedgehog?" };
		String[] answers = new String[] { "Yellow", "Paris", "Sonic" };
		int[] scores = new int[] {1,1,1};
		
		Quiz myQuiz = new Quiz(questions,answers,scores);
		myQuiz.runQuiz();
		
		System.out.println("--------------");
		System.out.println("----Test 2----");
		System.out.println("--------------");
		
		
		Quiz myQuiz2 = new Quiz(questions,answers,scores);
		
		/*
		 		
		//demonstrating creating MCQ questions with externally created ArrayList. 
		//Issue with reuse of some options variable instead of creating a new one unique to the question (pass by reference)
		//could use .clone() method to rectify

		ArrayList<String> options = new ArrayList<String>();
		options.add("Mario");
		options.add("Luigi");
		options.add("Bowser");
		options.add("Peach");
		
		String[] choices = new String[] {"Mario","Luigi","Bowser","Peach"};
		
		QuestionMCQ mcq0 = new QuestionMCQ("Whats the skeleton Turtle called in Mario?", "Dry Bones", 1, options);
		QuestionMCQ mcq1 = new QuestionMCQ("What is Luigi's surname in the popular video game?", "Mario", 2, options);
		myQuiz2.addQuestion(mcq0);
		myQuiz2.addQuestion(mcq1);		
		
		*/
		
		//tidier code here using array as can be declared in one line easily
		QuestionMCQ mcq2 = new QuestionMCQ("Whats the little mushroom guy called in Mario?", "Toad", 5, new String[] {"Mario","Luigi","Bowser","Peach"});
		QuestionMCQ mcq3 = new QuestionMCQ("How many roads must a man walk down, before you can call him a man?", "Blowing in the Wind", 5, new String[] {"Seven","Blowing in the Wind","Eight","Retorical"});
		myQuiz2.addQuestion(mcq2);
		myQuiz2.addQuestion(mcq3);
		
		myQuiz2.runQuiz();
		
		System.out.println("--------------");
		System.out.println("----Test 3----");
		System.out.println("--------------");

		Quiz myQuiz3 = new Quiz("QList.csv");
		myQuiz3.runQuiz();
		

	}
}
