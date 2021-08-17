package resit;

import java.util.ArrayList;

public class StartApp {

	public static ArrayList<CityCrime> cityCrimes = new ArrayList<CityCrime>();

	/**
	 * Start point for app. Directs the reads from file and shows the menu 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			readCrimeData();
			System.out.println("Total cities read : " + cityCrimes.size());
			showMenu();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * Reads the crime data for each city from file
	 */
	public static void readCrimeData() {

	}

	/**
	 * Displays the menu
	 * 
	 */
	public static void showMenu() {

		System.out.println("1. Display all crime stats by city");
		System.out.println("2. Display all crime stats by selected city");
		System.out.println("3. Display the murder stats by selected state ");
		System.out.println("4. Display  highest crime city - all crimes");
		System.out.println("5. Display each state (in alphabetical order with the number of car thefts ");
		System.out.println("6. Write / export all cities in descending order of Robbery rate ");
		System.out.println("7. Quit");
		System.out.println("Enter option ...");

	}

}
