/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Exercises2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in); 
		
		double length;
		length = 0;
		
			
		System.out.println("Please input length of one side");
		length = scanner.nextDouble();
		
		System.out.printf("The perimeter is %.2f \n", length * 4);
		System.out.printf("The area is %.2f ", Math.pow(length, 2));
		
		scanner.close();

	}

}
