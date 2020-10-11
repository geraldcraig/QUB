/**
 * 
 */
package uk.ac.qub.week3;

import java.util.Scanner;
import java.util.Random;

/**
 * @author geraldcraig
 *
 */
public class GuessNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Random random = new Random();
		 
		 int number, guess;
		 //random between 0-9
		 number = random.nextInt(10); 
		 // increase by 1, so 1-10
		 number++;
		 System.out.println("Guess a number 1-10");
		 guess = scanner.nextInt();
		 
		 while(guess != number) {
			 System.out.println("Wrong!!");
			 System.out.println("Try again");
			 guess = scanner.nextInt();
			 
		 }
		 System.out.println("Well done, the number was " + number);
		 
		 scanner.close();
	}

}
