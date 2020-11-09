/**
 * 
 */
package uk.ac.qub.week3;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Practical4b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int option = 0;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Menu.........");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Select option...");

			option = scan.nextInt();

			if (option == 1) {
				System.out.println("Your option is : File");
			} else if (option == 2) {
				System.out.println("Your option is : Edit");
			} else if (option == 3) {
				System.out.println("Your option is : Save");
			} else if (option == 4) {
				System.out.println("Your option is : Delete");
			} else {
				System.out.println("Invalid option. Try again");
			}

		} while (option != 5);

		System.out.println("Exiting");
		
		scan.close();

	}

}
