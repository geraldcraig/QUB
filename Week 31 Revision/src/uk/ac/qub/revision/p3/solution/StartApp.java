package uk.ac.qub.revision.p3.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Matthew Collins 12345678
 * 
 *
 */
public class StartApp {

	public static List<Player> players = new ArrayList<Player>();

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
			System.out.println(
					"5. Display each club (in alphabetical order with the cumulative number of games played in the six nations (Total Matches) by each player from that club ");
			System.out.println(
					"6. Capitalise the Last name and export/write to a new file in a new thread in the format Lastname, first name and country ");
			System.out.println("7. Quit");
			System.out.println("Enter option ...");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				displayAllPlayerDeets(players);
				break;
			case 2:
				displayPlayerNamesByCountry(players, Country.IRE);
				break;
			case 3:
				Player max=findMaxByPoints(players);
				System.out.printf("%s %s %s %s%n",max.getFirstName(),max.getSurname(),max.getCountry(),max.getPoints());
				break;
			case 4:
				displayByHeight(players);

				break;
			case 5:
				displayTotalMatchesByClub(players);
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

	private static void displayTotalMatchesByClub(List<Player> playerList) {
		
		Map<String, Integer> clubMap = new TreeMap<String, Integer>();
		
		for(Player p: playerList) {
			
			if(clubMap.containsKey(p.getClub())) {
				//Team seen before - update count
				int updatedCount = clubMap.get(p.getClub()) + p.getTotalMatches();
				
				clubMap.put(p.getClub(), updatedCount);
				
			}else {
				//new team - add to map fresh
				clubMap.put(p.getClub(), p.getTotalMatches());
			}
		}
		//map now populated 
		//System.out.println(clubMap);
		
		for(String team: clubMap.keySet()) {
			System.out.printf("%s: %s%n",team,clubMap.get(team));
		}
		
		
	}

	private static void displayByHeight(List<Player> playersList) {
		List<Player> listCopy = new ArrayList<Player>(playersList);
		
		Collections.sort(listCopy,new ComparePlayersBySurname());
		Collections.sort(listCopy,Collections.reverseOrder(new ComparePlayersHeight()));
		System.out.println("Players by Height \n");
		
		//Collections.reverse(listCopy);
		
		for(Player p: listCopy) {
			System.out.printf("%.2f\t%s %s%n",p.getHeight(),p.getFirstName(),p.getSurname());
		}
		
	}

	/**
	 * Find a player with the maximum point value in the given list
	 * @param players2
	 * @return
	 */
	private static Player findMaxByPoints(List<Player> playerList) {
		Player maxPointPlayer = Collections.max(playerList, new ComparePlayersByPoints());
		return maxPointPlayer;
	}

	/**
	 * print the names of all players in the input list who play for the specified country
	 * (in the current order of the list)
	 * @param players2
	 * @param ire
	 */
	private static void displayPlayerNamesByCountry(List<Player> playerList, Country countryCode) {
		System.out.println("Players playing for: "+countryCode);
		for(Player p: playerList) {
			if(p.getCountry()==countryCode) {
				System.out.println(p.getFirstName()+" "+p.getSurname());
			}	
		}
		if(playerList.size()==0) {
			System.out.println("No players for "+countryCode);
		}
		System.out.println();
	}

	private static void displayAllPlayerDeets(List<Player> playerList) {
		System.out.println("All Player Details in List: \n");
		for(Player play: playerList) {
			play.showAllDetails();
			System.out.println();
		}
	}

	/**
	 * Reads in the data from the csv and maps to the Player class
	 */
	public static void readData() {

		File file = new File("playerstats.csv");
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
					Player player = constructPlayer(parts);
					// add it to the list
					players.add(player);
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

	/**
	 * helper method that takes parts array from file read method and returns a Player object
	 * @param parts
	 * @return
	 */
	private static Player constructPlayer(String[] parts) {
		// TODO Auto-generated method stub
		// Country code Name Forward Or Back Total Matches Points scored Games Won Six
		// Nations Lost Six Nations Draw Height In Metres Club Influence
		int codeNum = Integer.parseInt(parts[0]);
		Country country=Country.SCO;
		switch (codeNum) {
		case 1:
			country = Country.ENG;
			break;
		case 2:
			country = Country.FRA;
			break;
		case 3:
			country = Country.IRE;
			break;
		case 4:
			country = Country.ITA;
			break;
		case 5:
			country = Country.SCO;
			break;
		case 6:
			country = Country.WAL;
			break;
		default:
			System.out.println("Error in country enum");
			throw new IllegalArgumentException("Invalid country num in file");
		}
		String fullName = parts[1];
		String[] names = fullName.split(" ", 2);

		String firstName = names[0];
		String surname = names[1];

		Position position = Position.valueOf(parts[2].toUpperCase());

		Player result = new Player(country, firstName, surname, position, Integer.parseInt(parts[3]),
				Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),
				Integer.parseInt(parts[7]), Double.parseDouble(parts[8]), parts[9], Integer.parseInt(parts[10]));

		return result;
	}
	
	public static List<Player> playerWithHighestPoints() {
		List<Player> highestScorers = new ArrayList<Player>(); // could be more than one
		int highest = -1;
		int playerScore = 0;

		for (Player player : players) {
			playerScore = player.getPoints();
			if (playerScore > highest) {
				// new highest total
				highest = playerScore;
				highestScorers.clear();
				highestScorers.add(player);

			} else if (playerScore == highest) {
				highestScorers.add(player);
			} else {
				// do nothing
			}
		}
		return highestScorers;
	}

}
