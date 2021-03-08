package uk.ac.qub.week2.solutions;

// importing the scanner for user input collection
import java.util.Scanner;

/**
 * Part 1 of practical 3
 * @author amcgowan
 *
 */
public class Part1 {

	/**
	 * Main method. User is prompted for a decimal point number
	 * and then the number is output again in various formats.
	 * @param args
	 */
	public static void main(String[] args) {

		// set up scanner
		Scanner scanner = new Scanner(System.in);
		
		// var to store user input 
		double inputNumber;
		
		System.out.println("Please enter a decimal point number in the format xx.xxxx eg 12.3456");
		// get the number
		inputNumber =  scanner.nextDouble();
		
		// output the values to screen
		System.out.printf("Number rounded (two decimal places)    : %.2f %n",inputNumber);
		System.out.printf("Number squared (three decimal places)  : %.3f %n",Math.pow(inputNumber, 2));
		System.out.printf("Number cubed to (three decimal places) : %.3f %n",Math.pow(inputNumber, 3));
		System.out.printf("Square root (four decimal places)      : %.4f %n ",Math.sqrt(inputNumber));
		// close the resource
		scanner.close();

	}

}
