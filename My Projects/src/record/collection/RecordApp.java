package record.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import uk.ac.qub.revision.p3.CountryCode;
import uk.ac.qub.revision.p3.Player;
import uk.ac.qub.revision.p3.Position;

public class RecordApp {
	
	public static List<Records> records = new ArrayList<Records>();

	public static void main(String[] args) {
		
		readData();
		showMenu();
		
	}

	public static void showMenu() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("File reading ");
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
				System.out.println("All players");
				displayAll(records);
				break;
			case 2:
				System.out.println("All players from Ireland");
				displayIre(records);
				break;
			case 3:
				System.out.println("The highest point scorer");
				highestPoints(records);
				break;
			case 4:
				System.out.println("All players by height and name");
				displayByHeight(records);
				break;
			case 5:
				System.out.println("Clubs and total points");
				displayByClub(records);
				break;
			case 6:
				System.out.println("Exporting to file");
				exportToFile(records);
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
	
	public static void readData() {
File file = new File("playerstats.csv");
		
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {

			String line = reader.readLine(); // discard header
			line = reader.readLine(); // read first line

			while (line != null) {

				// TODO Code to process current line
				String[] parts = line.split(",");
				
				String fullName = parts[0];
				String[] names = fullName.split(" ", 2);

				String firstName = names[0];
				String surname = names[1];
				String title = parts[2];
				String format = parts[3];
				/*Format format = Format.SINGLE;
				switch (format) {
				case 1:
					format = Format.SINGLE;
					break;
				case 2:
					format = Format.ALBUM;
					break;
				case 3:
					format = Format.CD;
					break;
				default:
					System.out.println("Error in country enum");
				}*/
				
				int year = Integer.parseInt(parts[4]);
				
				
				Records record = new Records(firstName, surname, title, format, year);
				// TODO and add to list
				records.add(record);

				line = reader.readLine();// attempt to read next line and loop again
			
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(records.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(records.size() + " lines read successfully");	
	}

}
