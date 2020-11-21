/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare var
		double num;
		num = 0;
		
		// initialise the scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a whole number");
		
		// read from keyboard
		num = scanner.nextDouble();
		
		// output the value
		System.out.println("Square root of is :  " + Math.sqrt(num));
		
		scanner.close();

	}

}
