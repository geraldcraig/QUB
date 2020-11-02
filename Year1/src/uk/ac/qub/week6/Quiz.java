/**
 * 
 */
package uk.ac.qub.week6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Quiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
	
		//declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ?", "Worse song ever ?", "Capital of Peru ?",
				"Roman god of War  ?" };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars"};
		int num;
		String answer;
		String input;
		
		num = rand.nextInt(4);
		
		System.out.println(jokeQuestions[num]);
		
		answer = jokeAnswers[num];
		System.out.println(answer);
		 
		input = scan.nextLine();
		
		if (input.equalsIgnoreCase(answer)) {
			System.out.println("Well done");
		}
		
		
	
		
		}


}
