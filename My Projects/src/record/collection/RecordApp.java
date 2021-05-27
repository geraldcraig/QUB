package record.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
			System.out.println("1. Display all records");
			System.out.println("2. Display all Bowie records");
			System.out.println("3. Display the most recent release ");
			System.out.println("4. Display all records by year and title");
			System.out.println("5. Display each artist (in alphabetical order with the cumulative number of releases ");			
			System.out.println("6. Capitalise the Last name and export/write to a new file in the format Lastname, first name, title and country ");
			System.out.println("7. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();

			switch (option) {
				
			case 1:
				System.out.println("All records");
				displayAll(records);
				break;
			case 2:
				System.out.println("All Bowie records");
				displayArtist(records);
				break;
			case 3:
				System.out.println("Most recent release");
				recentRelease(records);
				break;
			case 4:
				System.out.println("All records by year and title");
				yearTitle(records);
				break;
			case 5:
				System.out.println("Artists and number of releases");
				artistRealeases(records);
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
	
	public static void exportToFile(List<Records> list) {
		// TODO Auto-generated method stub
		
	}

	public static void artistRealeases(List<Records> list) {
		// TODO Auto-generated method stub
		
	}

	public static void yearTitle(List<Records> list) {
		// TODO Auto-generated method stub
		
	}

	public static void recentRelease(List<Records> list) {
		// TODO Auto-generated method stub
		
	}

	public static void displayArtist(List<Records> list) {
		// TODO Auto-generated method stub
		
	}

	public static void displayAll(List<Records> list) {
		for (Records r : list) {
			System.out.println(r);
		}
		
	}

	public static void readData() {
		File file = new File("cells.csv");
		
		try  {
			FileReader fr = new FileReader(file); 
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine(); // discard header
			line = br.readLine(); // read first line

			while (line != null) {

				// TODO Code to process current line
				String[] parts = line.split(",");
				
				//if (parts.length == 4) {
					/*String fullName = parts[0];
					String[] names = fullName.split(" ", 2);

					String firstName = names[0];
					String surname = names[1];
					String title = parts[1];
					int year = Integer.parseInt(parts[3]);
					
					Records record = new Records(firstName, surname, title, year);
					// TODO and add to list
					records.add(record);*/
					
				//} else {
					String fullName = parts[0];
					String[] names = fullName.split(" ", 2);

					String firstName = names[0];
					String surname = names[1];
					String title = parts[1];
					int formatNum = Integer.parseInt(parts[2]);
					Format format = Format.SINGLE;
					switch (formatNum) {
					case 1:
						format = Format.SINGLE;
						break;
					case 2:
						format = Format.ALBUM;
						break;
					case 3:
						format = Format.CDSINGLE;
						break;
					case 4:
						format = Format.CD;
						break;
					default:
						System.out.println("Error in format enum");
					}
					int year = Integer.parseInt(parts[3]);
					
					Records record = new Records(firstName, surname, title, format, year);
					// TODO and add to list
					records.add(record);
					
			//	}

				line = br.readLine();// attempt to read next line and loop again
			
			}
			br.close();
			fr.close();
			
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
