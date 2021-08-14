package p3Aug;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PUT YOUR NAME HERE AND YOUR STUDENT NUMBER
 * 
 *
 */
public class StartApp {
	
	/**
	 * Entry point of program - no need to modify this method
	 * @param args
	 */
	public static void main(String[] args) {
		showMenu();	
	}
	
	//TODO modify readData method to populate List appropriately - method partially completed already
	//TODO add static methods to this class as required to achieve tasks outlined in menu
	//TODO modify showMenu method to add calls to new methods you write to accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user choices
	 * Partially implemented already
	 * requires updating to add calls to other methods written to achieve the tasks described 
	 */
	public static void showMenu() {
		List<Game> gameSalesData = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Video Game Sales Data Processing");
		do {
			System.out.println("1. (Re)read Data From File (use to restore sales data for example)");
			System.out.println("2. Display the number of Games in the Current List");
			System.out.println("3. Display full details for all Games in the current List");
			System.out.println("4. Display summary details of the top 3 best selling Games in the European Region from the current List");
			System.out.println(
					"5. Display summary details of Platform Games in the List with total global sales of 0.2 million or more, sorted descending by total sales");
			System.out.println("6. Display the name, genre and publisher of the game/games with the longest name in the current List");
			System.out.println(
					"7. Multiplatform: Display summary details sorted by name of any games available for more than one platform");
			System.out.println("8. Display in descending sales order, summary details of any games which sold only in the Japanese market");
			System.out.println(
					"9. Update all Games in the list so platform is 'Any' and combine data for any duplicates into single objects");
			System.out.println("10. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();
			System.out.println();
			switch (option) {

			case 1:
				gameSalesData = readData();
				break;
			case 2:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 3:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 4:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 5:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 6:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 7:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 8:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 9:
				System.out.println("Not yet implemented...");
				// TODO add required method call(s)
				break;
			case 10:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 10);
		scanner.close();
	}

	/**
	 * Reads in the data from the provided csv and returns a list of Game
	 * objects for further processing - requires updating for full functionality
	 */
	public static List<Game> readData() {

		List<Game> listFromFile = new ArrayList<Game>();

		File file = new File("videogamesalesdata.csv"); // hard coded to specific file

		// try with resources - auto closes reader resources when finished/exception
		// occurs
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {

			String line = reader.readLine(); // discard header
			line = reader.readLine(); // read first line

			while (line != null) {

				// TODO Code to process current line
				// TODO instantiate Game object
				// TODO and add to list

				line = reader.readLine();// attempt to read next line and loop again
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(listFromFile.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(listFromFile.size() + " lines read successfully");
		return listFromFile;
	}

}
