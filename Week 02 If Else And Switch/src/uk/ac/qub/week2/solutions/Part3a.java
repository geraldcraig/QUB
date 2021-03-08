package uk.ac.qub.week2.solutions;

import java.util.Scanner;

/**
 *  Part 3a Practical 3.
 * @author amcgowan
 */
public class Part3a {

	/**
	 * Main method checks the user's age and if over 17 prompts for name
	 * Otherwise the program quits.  Includes some basic validation for age 0 or less
	 * @param args
	 */
	public static void main(String[] args) {

		// set up scanner
		Scanner scanner = new Scanner(System.in);
		int age;
		String name;
		
		// get the age from user
		System.out.println("Enter your age ?");
		age = scanner.nextInt();
		
		// check the input age 
		if (age >= 18) {
			System.out.println("Enter your name ?");
			name = scanner.next();
			System.out.printf("Name entered %s and age entered %s",name, age);
		} else if ((age >= 1) && (age <= 17)){
			System.out.println("too young to continue");
		} else {
			System.out.println("sorry don�t recognise your input");
		}
		
		scanner.close();
	}

}
