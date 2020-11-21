/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Practical3a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double number;
		number = 0;
		
		System.out.println("Please enter a decimal point number");
		number = scanner.nextDouble();
		
		System.out.printf("Number rounded (two decimal places) : %.2f \n", number);
		System.out.printf("Number squared (three decimal places) : %.3f \n", Math.pow(number,2));
		System.out.printf("Number cubed to (three decimal places) : %.3f \n", Math.pow(number,3));
		System.out.printf("Square root (four decimal places) : %.4f \n", Math.sqrt(number));
		
		scanner.close();
	}

}
