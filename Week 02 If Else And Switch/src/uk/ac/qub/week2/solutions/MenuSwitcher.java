package uk.ac.qub.week2.solutions;

import java.util.Scanner;

/**
 * Menu example
 * @author 3048360
 *
 */
public class MenuSwitcher {

	/**
	 * Shows menu then output option (uses a switch)
	 * @param args
	 */
	public static void main(String[] args) {
		// vars
		int userOption;
		Scanner scanner = new Scanner(System.in);

		// show the menu
		System.out.println("Menu");
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Exit");

		// get the user option
		System.out.println("Enter option...");
		userOption = scanner.nextInt();

		// process input
		switch (userOption) {
		case 1:
			System.out.println("You selected File");
			break;
		case 2:
			System.out.println("You selected File");
			break;
		case 3:
			System.out.println("You selected File");
			break;
		default:
			System.out.println("Invalid option");
		}

		// tidy up resources
		scanner.close();

	}

}
