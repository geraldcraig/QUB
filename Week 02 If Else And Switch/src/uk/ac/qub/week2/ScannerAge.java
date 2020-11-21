/**
 * 
 */
package uk.ac.qub.week2;

//import for the Scanner class
import java.util.Scanner;

/**
 * Program reads in the user'e age and determines whether they are
 * old enough to vote
 * @author geraldcraig
 *
 */
public class ScannerAge {

	/**
	 * Method reads in the user'e age and determines whether they are
	 * old enough to vote
	 * @param args
	 */
	public static void main(String[] args) {

		// vars
		int age = 0;

		// scanner gets input from the keyboard.
		Scanner scanner = new Scanner(System.in);

		// Get user to input age
		System.out.println("Please enter your age ...");
		age = scanner.nextInt();

		// if statement to check if 18 or older
		if (age >= 18) {
			System.out.println("You can vote");
		}

		// if statement to check if under 18
		if (age < 18) {
			System.out.println("You cannot vote");
		}
		scanner.close();
	}

}
