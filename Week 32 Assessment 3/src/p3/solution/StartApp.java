package p3.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * PUT YOUR NAME HERE AND YOUR STUDENT NUMBER
 * Sample Solution - Matthew Collins
 *
 */
public class StartApp {

	/**
	 * Entry point of program - no need to modify this method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		showMenu();
	}

	// TODO modify readData method to populate List appropriately - method partially
	// completed already
	// TODO add static methods to this class as required to achieve tasks outlined
	// in menu
	// TODO modify showMenu method to add calls to new methods you write to
	// accomplish the tasks outlined in the menu

	/**
	 * Launches menu system which in turn calls appropriate methods based on user
	 * choices Partially implemented already requires updating to add calls to other
	 * methods written to achieve the tasks described in tasks 3-10
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
				// System.out.println("Option currently disabled...");
				/*
				 * TODO Uncomment method call to enable this option (requires TopTrumpCard class
				 * to match expectations of Game Method to compile successfully) deliberately
				 * commented out initially to allow attempting other tasks
				 */
				CardGame.playDemo(mainDeck);
				break;
			case 3:
				System.out.println("Number of cards in current Deck: " + mainDeck.size());
				// TODO add required method call(s)
				break;
			case 4:
				System.out.println("Full Details...\n");
				for (TopTrumpCard card : mainDeck) {
					card.fullDetails();
					System.out.println();
				}
				break;
			case 5:
				System.out.println("Top 5 Strongest...");
				displaySummary(findStrongest(mainDeck, 5));
				// TODO add required method call(s)
				break;
			case 6:
				System.out.println("Villains agility of 75 or more...");
				// TODO add required method call(s)
				displaySummary(findAllSoAgile(mainDeck, Category.VILLAIN, 75));
				break;
			case 7:
				System.out.println("Longest Bio(s)...");
				TopTrumpCard longBio = Collections.max(mainDeck, new compareByBioLength());
				int maxLen = longBio.getBio().length();
				// could be more than one card with same length longest bio
				for (TopTrumpCard card : mainDeck) {
					if (card.getBio().length() == maxLen) {
						System.out.println("Name: " + longBio.getName());
						System.out.println("Bio: " + longBio.getBio());
						System.out.println();
					}
				}
				// TODO add required method call(s)
				break;
			case 8:
				System.out.println("Find swaps...");
				List<TopTrumpCard> dupes = findDupes(mainDeck);
				displaySummary(dupes);
				// TODO add required method call(s)
				break;
			case 9:
				System.out.println("Remove Duplicates...");
				// TODO add required method call(s)
				mainDeck = getUniqueList(mainDeck);
				break;
			case 10:
				System.out.println("Sort by average...");
				// TODO add required method call(s)
				Collections.sort(mainDeck, new CompareByAverageStat());
				displaySummarywithAvg(mainDeck);
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

	private static void displaySummarywithAvg(List<TopTrumpCard> cards) {
		// TODO Auto-generated method stub

		if (cards.size() == 0) {
			System.out.println("No cards to sumarise");
		} else {
			System.out.println("Summary Data");
			int count = 1;
			for (TopTrumpCard card : cards) {
				System.out.println(count + ")");

				card.printSummary();
				System.out.printf("Average Stat: %.2f%n", card.getAverageStat());
//						System.out.println(String.format(
//								"%s / %s (%s)%nsp: %s | st: %s | ag: %s | in: %s | Avg: %.2f",
//								card.getName(), card.getRealname(), card.getCategory(), card.getSpeed(), card.getStrength(), card.getAgility(), card.getIntelligence(),card.getAverageStat()));
//						
				System.out.println();
				count++;
			}
		}

	}

	private static Collection<TopTrumpCard> findAllSoAgile(List<TopTrumpCard> inputDeck, Category cat, int i) {
		List<TopTrumpCard> results = new ArrayList<TopTrumpCard>();
		for (TopTrumpCard card : inputDeck) {
			if (card.getCategory() == cat && card.getAgility() >= i) {
				results.add(card);
			}
		}
		return results;
	}

	private static Collection<TopTrumpCard> findStrongest(List<TopTrumpCard> inputDeck, int target) {
		List<TopTrumpCard> strongest = new ArrayList<TopTrumpCard>(inputDeck);
		Collections.sort(strongest, new CompareByStrength());
		List<TopTrumpCard> topStrong = new ArrayList<TopTrumpCard>();
		if (strongest.size() < target) {
			System.out.println("Only " + strongest.size() + " values in list. Unable to give full top " + target);
			topStrong.addAll(strongest);
		} else {
			for (int i = 0; i < target; i++) {
				topStrong.add(strongest.get(i));
			}
		}
		return topStrong;
	}

	/**
	 * this version creates a new List of unique values and returns it.
	 * Needs to be called in a way that will overwrite original list if intention is to replace
	 * @param mainDeck
	 * @return
	 */
	private static List<TopTrumpCard> getUniqueList(List<TopTrumpCard> mainDeck) {
		HashSet<TopTrumpCard> set = new HashSet<TopTrumpCard>(mainDeck);
		return new ArrayList<TopTrumpCard>(set);
	}
	
	/**
	 * This version of remove duplicates can be called without a return value
	 * input list is passed in by reference and so can be manipulated via clear/addAll 
	 * changes will be retained after method exits
	 * @param inputList
	 */
	private static void removeDupes(List<TopTrumpCard> inputList) {
		HashSet<TopTrumpCard> set = new HashSet<TopTrumpCard>(inputList);
		inputList.clear();
		inputList.addAll(set);
	}

	private static void displaySummary(Collection<TopTrumpCard> cards) {
		if (cards.size() == 0) {
			System.out.println("No cards to sumarise");
		} else {
			System.out.println("Summary Data");
			int count = 1;
			for (TopTrumpCard card : cards) {
				System.out.println(count + ")");
				card.printSummary();
				System.out.println();
				count++;
			}
		}

	}

	/**
	 * Build and return a list of any cards which occur more than once in the input list
	 * uses Set and the fact that the class has a .equals method which allows objects to be compared by value
	 * @param mainDeck
	 * @return
	 */
	private static List<TopTrumpCard> findDupes(List<TopTrumpCard> mainDeck) {
		List<TopTrumpCard> dupes = new ArrayList<TopTrumpCard>();
		HashSet<TopTrumpCard> mySet = new HashSet<TopTrumpCard>();
		for (TopTrumpCard card : mainDeck) {
			if (!mySet.add(card)) {
				//add operation on a set returns true/false if successful. 
				//False would mean card already there so duplicate - add to result list
				dupes.add(card);
			}
		}
		return dupes;
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

				// parsing or converting file data could throw exception, skip in that case
				try {
					Category cat = Category.valueOf(parts[3].toUpperCase());
					int sp = Integer.parseInt(parts[4]);
					int st = Integer.parseInt(parts[5]);
					int ag = Integer.parseInt(parts[6]);
					int intel = Integer.parseInt(parts[7]);

					// TODO instantiate TopTrumpCard object
					TopTrumpCard card = new TopTrumpCard(parts[0], parts[1], parts[2], cat, sp, st, ag, intel,
							parts[8]);
					// TODO and add to list
					listFromFile.add(card);
				} catch (IllegalArgumentException illegalArg) {
					System.out.println("Error creating object: " + parts[0]);
					System.out.println(illegalArg.getMessage());
					System.out.println("Skipping this line");
				}

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
