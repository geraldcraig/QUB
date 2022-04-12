package uk.ac.qub.three.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		// declaring the questions and answers
		String [] jokeQuestions = {"Largest planet?", "Worse song ever?", "Capital of Peru?", "Roman god of War?"};
		String [] jokeAnswers = {"Jupiter", "Castles in the Sky", "Lima", "Mars"};
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		String answer;
		String response;
		
		System.out.println("General Knowledge quiz...");
		
		do {
		
		int number = random.nextInt(4);
		System.out.println(jokeQuestions[number]);
		
		answer = scanner.next();
		
		if (answer.equalsIgnoreCase(jokeAnswers[number])) {
			System.out.println("Well done !");
		} else {
			System.out.println("Not a bad answer but it was " + jokeAnswers[number]);
		}
		
		System.out.println("Another question (Y or N)..");
		
		response = scanner.next();
		
		}
		
		while (response.equalsIgnoreCase("Y")); {
			
			 
			System.out.println("Thanks for playing");
		
		scanner.close();

	}
	
	}

}
