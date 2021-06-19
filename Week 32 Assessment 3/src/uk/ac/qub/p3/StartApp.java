package uk.ac.qub.p3;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Gerald Craig 40278046
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
	 * requires updating to add calls to other methods written to achieve the tasks described in tasks 3-10
	 */
	public static void showMenu() {
		List<TopTrumpCard> mainDeck = readData();

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Hero Card Processing");
		do {
			System.out.println("1. (Re)read Data From File (use to restore removed card for example)");
			System.out.println("2. Play Demo Game with Current Deck");
			System.out.println("3. Display the number of Cards in the Current Deck");
			System.out.println("4. Display full details for all cards in the current Deck");
			System.out.println("5. Display summary details of the top 5 strongest Heroes in the Deck");
			System.out.println(
					"6. Display summary details of Villains in the Deck with an agility rating of 75 or more, sorted alphatically by name");
			System.out.println("7. Display the card name and bio of the card/cards with the longest bio in the Deck");
			System.out.println(
					"8. Find Swapsies: Identify and display summary details of any duplicate cards in the Deck");
			System.out.println("9. Remove any duplicate cards from the Deck.");
			System.out.println(
					"10. Sort the deck from highest to lowest determined by average of the 4 main stats. \n\tDisplay summary details of all cards and include the average as part of the summary.");
			System.out.println("11. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();
			System.out.println();
			switch (option) {

			case 1:
				mainDeck = readData();
				break;
			case 2:
				System.out.println("2. Playing Demo Game...");
				/* TODO Uncomment method call to enable this option 
				 * (requires TopTrumpCard class to match expectations of Game Method to compile successfully)
				 * deliberately commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				System.out.println("3. Number of Cards in Current Deck...");
				// TODO add required method call(s)
				numberOfCards(mainDeck);
				break;
			case 4:
				System.out.println("4. Display full details...");
				// TODO add required method call(s)
				fullDetails(mainDeck);
				break;
			case 5:
				System.out.println("5. Top 5 strongest Heroes...");
				// TODO add required method call(s)
				topFive(mainDeck);
				break;
			case 6:
				System.out.println("6. Villains with agility rating of 75 or more...");
				// TODO add required method call(s)
				displayVillains(mainDeck);
				break;
			case 7:
				System.out.println("7. Name and bio of card with longest bio...");
				// TODO add required method call(s)
				longestBio(mainDeck);
				break;
			case 8:
				System.out.println("8. Summary details of any duplicate cards...");
				// TODO add required method call(s)
				displayDoubles(mainDeck);
				break;
			case 9:
				System.out.println("9. Removing duplicates from the Deck...");
				// TODO add required method call(s)
				removeDuplicates(mainDeck);
				break;
			case 10:
				System.out.println("10. Sorted from highest to lowest by average of the 4 main stats...");
				// TODO add required method call(s)
				highLow(mainDeck);
				break;
			case 11:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Try options again...");
			}
		} while (option != 11);
		scanner.close();
	}


	/**
	 * Reads in the data from the provided csv and returns a list of TopTrumpCard
	 * objects for further processing - requires updating for full functionality
	 */
	public static List<TopTrumpCard> readData() {

		List<TopTrumpCard> listFromFile = new ArrayList<TopTrumpCard>();

		File file = new File("toptrumpscards.csv"); // hard coded to specific file

		// try with resources - auto closes reader resources when finished/exception
		// occurs
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {

			String line = reader.readLine(); // discard header
			line = reader.readLine(); // read first line

			while (line != null) {

				// TODO Code to process current line
				String[] parts = line.split(",");
				String name = parts[0];
				String realName = parts[1];
				String imageFileName = parts[2];
				Category category = Category.valueOf(parts[3].toUpperCase());
				int speed = Integer.parseInt(parts[4]);
				int strength = Integer.parseInt(parts[5]);
				int agility = Integer.parseInt(parts[6]);
				int intelligence = Integer.parseInt(parts[7]);
				String bio = parts[8];
				
				
				// TODO instantiate TopTrumpCard object
				TopTrumpCard card = new TopTrumpCard(name, realName, imageFileName, category, speed, strength, agility, intelligence, bio);
				// TODO and add to list
				listFromFile.add(card);

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

	public static void numberOfCards(List<TopTrumpCard> deck) {
		System.out.println("Number of cards in current deck : " + deck.size());
		
	}
	
	private static void fullDetails(List<TopTrumpCard> deck) {
		for (TopTrumpCard card : deck) {
			System.out.println("name: \t\t" + card.getName());
			System.out.println("realname: \t" + card.getRealName());
			System.out.println("filename: \t" + card.getImageFileName());
			System.out.println("category: \t" + card.getCategory());
			System.out.println("speed: \t\t" + card.getSpeed());
			System.out.println("strength: \t" + card.getStrength());
			System.out.println("agility: \t" + card.getAgility());
			System.out.println("intelligence: \t" + card.getIntelligence());
			System.out.println("bio: \t\t" + card.getBio());
			System.out.println();
		}
		
	}
	
	public static void displayDoubles(List<TopTrumpCard> deck) {
		/*Collections.sort(deck, new CompareByName());
		for (TopTrumpCard card : deck) {
			System.out.println(card);
			System.out.println();
		}*/
		Map<TopTrumpCard, Integer> myMap = new HashMap<TopTrumpCard, Integer>();
		for (TopTrumpCard card : deck) {
			if (myMap.containsKey(card)) {
				int count = myMap.get(card);
				myMap.put(card, count + 1);
			} else {
				myMap.put(card, 1);
			}	
		}
		
		for (TopTrumpCard key : myMap.keySet()) {
			if (myMap.get(key) == 2) {
				System.out.println(key);
				System.out.println();
			}
			//System.out.println(myMap.get(key));
		}
		
	}
	
	public static void longestBio(List<TopTrumpCard> deck) {
		System.out.println(Collections.max(deck, new CompareByLength()));
		
	}
	
	public static void displayVillains(List<TopTrumpCard> deck) {
		List<TopTrumpCard> deckCopy = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard card : deck)  {
			if (card.getCategory().equals(Category.VILLAIN) && card.getAgility() >= 75) {
				deckCopy.add(card);
			}
		}
		Collections.sort(deckCopy, new CompareByName());
		for (TopTrumpCard card : deckCopy) {
			System.out.println(card);
			System.out.println();
		}
	}
	
	public static void topFive(List<TopTrumpCard> deck) {
		List<TopTrumpCard> deckCopy = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard card : deck) {
			if (card.getCategory().equals(Category.HERO)) {
				deckCopy.add(card);
			}
		}
		Collections.sort(deckCopy, new CompareByStrength());
		Collections.sort(deckCopy, Collections.reverseOrder(new CompareByStrength()));
		List<TopTrumpCard> five = new ArrayList<TopTrumpCard>();
		
		for (TopTrumpCard card : deckCopy) {
			System.out.println(card.toString());
			System.out.println();
		}
		
	}
	
	public static void removeDuplicates(List<TopTrumpCard> deck) {
		Set<TopTrumpCard> set = new HashSet<TopTrumpCard>(deck);
		System.out.println(set.size());
		for (TopTrumpCard card : set) {
			System.out.println(card);
			System.out.println();
		}
		
	}
	
	public static void highLow(List<TopTrumpCard> deck) {
		Collections.sort(deck, new CompareByStat());
		for (TopTrumpCard card : deck) {
			System.out.println(card.toString());
			double average = (double) (card.getSpeed() + card.getStrength() 
			+card.getAgility() + card.getIntelligence())/4;
			System.out.println("Average Stat: " +  average);
			System.out.println();
		}
	}
	

}
