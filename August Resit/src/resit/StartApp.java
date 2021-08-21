package resit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		
		try {
			File file = new File("videogamesalesdata.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			line = br.readLine();
			
			while (line != null) {
				String[] parts = line.split(",");
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

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
