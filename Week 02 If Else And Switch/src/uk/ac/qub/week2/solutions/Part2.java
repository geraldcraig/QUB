package uk.ac.qub.week2.solutions;

import java.util.Scanner;

/**
 * Part 3 Practical 3.
 * @author amcgowan
 *
 */
public class Part2 {

	/**
	 * Mark analyser program.
	 * @param args
	 */
	public static void main(String[] args) {

		// set up scanner
		Scanner scanner = new Scanner(System.in);
		int mark;
		
		System.out.println("Enter mark ...");
		// read in and store response
		mark = scanner.nextInt();
		
		// check the value range and output the appropriate message 
		if ((mark >= 0) && (mark <= 49)){
			System.out.println("Classification : fail");
		} else if ((mark >= 50) && (mark <= 59)) {
			System.out.println("Classification : pass");
		} else if ((mark >= 60) && (mark <= 69)) {
			System.out.println("Classification : merit");
		} else if ((mark >= 70) && (mark <= 100)) {
			System.out.println("Classification : distinction");
		} else {
			System.out.println("Error - please enter an nummber 0 -100");
		}

		// close the resource 
		scanner.close();
	}

}
