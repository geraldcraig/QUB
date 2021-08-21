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
		
		File file = new File("crimeUSA.csv");
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();// read header and discard
			line = br.readLine(); // read actual first line of data

			while (line != null) {
				// process current line
				String[] parts = line.split(",");

				try {
					// build a player object
					CityCrime cityCrime = constructCityCrime(parts);
					// add it to the list
					cityCrimes.add(cityCrime);
				} catch (IllegalArgumentException illegal) {
					System.out.println("Error creating object..on line..");
					System.out.println(illegal.getMessage());
					System.out.println("Skipping to next line");
				}

				line = br.readLine();// read next line (if exists)
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static CityCrime constructCityCrime(String[] parts) {
		String city = parts[0];
		
		String stateName = parts[1];
		State state = State.AL;
		switch (stateName) {
		case "ALABAMA":
			state = State.AL;
			break;
		case "ALASKA":
			state = State.AK;
			break;
		case "ARIZONA":
			state = State.AR;
			break;
		default:
			//System.out.println("Error in state enum");
			//throw new IllegalArgumentException("Invalid state in file");
		}
		
		int population = Integer.parseInt(parts[2]);
		int murder = Integer.parseInt(parts[3]);
		int robbery = Integer.parseInt(parts[4]);
		int assualt = Integer.parseInt(parts[5]);
		int burglary = Integer.parseInt(parts[6]);
		int larceny = Integer.parseInt(parts[7]);
		int motorTheft = Integer.parseInt(parts[8]);

		CityCrime result = new CityCrime(city, state, population, murder, robbery, assualt, burglary, larceny, motorTheft);
		System.out.println(result.toString());
		return result;
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
