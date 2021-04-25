package assessment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * PUT YOUR NAME HERE AND YOUR STUDNT NUMBER
 * 
 *
 */
public class StartApp {

	

	public static void main(String[] args) {
		readData(); 
		showMenu();
		
	}

	public static void showMenu() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Book reading ");
		do {
			System.out.println("1. Display all players");
			System.out.println("2. Display all players from Ireland");
			System.out.println("3. Display the highest point scorer ");
			System.out.println("4. Display all players by height and name");
			System.out.println("5. Display each club (in alphabetical order with the cumulative number of games played in the six nations (Total Matches) by each player from that club ");			
			System.out.println("6. Capitalise the Last name and export/write to a new file in a new thread in the format Lastname, first name and country ");
			System.out.println("7. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();

			switch (option) {
				
			case 1:
				
				break;
			case 2:
				break;
			case 3:
			
				break;
			case 4:
			
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("Quitting");
				break;		
			default:
				System.out.println("Try options again...");
			}
		} while (option != 7);
		scanner.close();
	}

	/**
	 * Reads in the data from the csv and maps to the Player class 
	 */
	public static void readData() {
		String line;
		
		File file = new File("playerstats.csv");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			// skip header
			line = br.readLine();
			
			line = br.readLine();
			
			while (line != null) {
				String[] parts = line.split(",");
				String country = parts[0];
				String position = parts[1];
				line = br.readLine();
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

}
