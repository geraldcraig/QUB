package uk.ac.qub.week4.solutions;

import java.util.Calendar;
import java.util.Random;

/**
 * Solutions from practical part 1 on Methods.
 * 
 * @author Aidan McGowan QUB
 */
public class MethodsSolutionsPart1 {

	/**
	 * When passed any given integer, will determine whether it is odd or even.
	 * Outputs to the screen “odd” or “even”.
	 * 
	 * @param number
	 *            - passed as a parameter. Checked for odd or even.
	 */
	public static void oddOrEven(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	/**
	 * Method that when passed any upper-case letter will convert it to a lower
	 * case letter. (Checks first to be sure that it is not lower case already.)
	 * 
	 * @param letter
	 */
	public static void convertFromUpperToLower(char letter) {
		// check if upper case
		if (Character.isUpperCase(letter)) {
			// convert to Lower
			System.out.println("Converted to " + Character.toLowerCase(letter));
		} else {
			// otherwise no action required
			System.out.println("Already in Lower case");
		}
	}

	/**
	 * When passed a pair of integers, will determine if the second is a
	 * multiple of the first.
	 * 
	 * @param num1
	 *            base number
	 * @param num2
	 *            number to check if is multiple of base number
	 */
	public static void isMultiple(int num1, int num2) {

		if (num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d", num1, num2);
		} else {
			System.out.printf("%d is not a multiple of %d", num1, num2);
		}
	}

	/**
	 * Generate a set of 10 random numbers between 1 and 100 (inclusive)
	 */
	public static void randonNumberGenerator() {

		Random rand = new Random();
		int number = 0;
		System.out.println("Generating 10 random integers in range 1..100");
		for (int loop = 1; loop <= 10; loop++) {
			// don't want zero as a possible random number so add on 1
			number = rand.nextInt(100) + 1;
			System.out.println("Generated : " + number);
		}
	}

	/**
	 * Prompt the user for a number (between 5 and 50 (inclusive)). Then output
	 * to screen a countdown of the numbers starting with the given number and
	 * include on the same line the same number of asterisks.
	 */
	public static void printStars() {

		// simulated input from user is 5 - if input was from a user then
		// validation should be included.
		int count = 5;

		// print the number
		for (int outerLoop = count; outerLoop > 0; outerLoop--) {
			System.out.print(outerLoop + " ");

			// print the required number of stars
			for (int innerLoop = 1; innerLoop <= outerLoop; innerLoop++) {
				System.out.print("*");
			}
			// create line break
			System.out.println();
		}
	}

	/**
	 * prints "ONE", "TWO",... , "NINE", or "OTHER" if an int variable (passed
	 * as a parameter) is 1, 2,... , 9, or other, respectively. Coded here using
	 * an if else ...
	 */
	public static void printNumberInWord(int input) {

		if (input == 1) {
			System.out.println("ONE");
		} else if (input == 2) {
			System.out.println("TWO");
		} else if (input == 3) {
			System.out.println("THREE");
		} else {
			System.out.println("UNKNOWN");
		}
	}

	/**
	 * Prints the sum of 1+2+3, ..., to an upper bound determined by user input
	 * (e.g. 100). The method should computes and displays the average of these
	 * numbers.
	 * 
	 * @param upperLimit
	 */
	public static void counter(int upperLimit) {

		// var declaration
		int total = 0;
		double average = 0;
		for (int loop = 1; loop <= upperLimit; loop++) {
			total += loop;
		}
		System.out.println("Total is : " + total);
		// cast the total and upperlimit to double to ensure accurate answer
		average = (double) total / (double) upperLimit;
		System.out.printf("Average is : %.2f", average);
	}

	/**
	 * Determines if it is currently AM or PM. If AM then it output is “Good
	 * morning” and if PM then “I hope the morning went well for you. Enjoy the
	 * rest of your day.”
	 */
	public static void currentTime() {

		// create the calendar object
		Calendar now = Calendar.getInstance();

		// get the current hour
		int hour = now.get(Calendar.HOUR_OF_DAY);
		// now output appropriate message
		if (hour <= 11) {
			System.out.println("Good morning");
		} else {
			System.out
					.println("I hope the morning went well for you. Enjoy the rest of your day");
		}
	}

	
	

	public static void main(String[] args) {

		// test odd or even
		oddOrEven(2);
		oddOrEven(1);

		// test upper lower char
		convertFromUpperToLower('A');
		convertFromUpperToLower('f');

		// test isMultiple
		isMultiple(5, 20);
		System.out.println(); // line break
		isMultiple(3, 19);

		// test random number generator
		randonNumberGenerator();

		// test print stars
		printStars();

		// test printStars
		printNumberInWord(2);

		// test counter method
		counter(3);

		// test currentTime
		currentTime();

		
	}
}
