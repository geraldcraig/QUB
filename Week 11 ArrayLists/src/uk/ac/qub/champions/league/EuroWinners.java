/**
 * 
 */
package uk.ac.qub.champions.league;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Gerald
 *
 */
public class EuroWinners {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ArrayList< String > allWinners = addToWinnersList();
		
		if (allWinners.size() == 0) {
			System.out.println("No winners");
		} else {
			System.out.println("List of winners by year...");
			int year = 1956;
			for (String team : allWinners) {
				System.out.println(year++ + " : " + team);
			}
			ArrayList< String > winningClubs = new ArrayList<>();
			for (int i = 0; i < allWinners.size(); i++) {
				if (!winningClubs.contains(allWinners.get(i))) {
					winningClubs.add(allWinners.get(i));
				}
			}
			// Show winning clubs - no duplicates
			System.out.println(winningClubs.toString());
		}	
		
	}	
		
	public static ArrayList<String> addToWinnersList() {
			
		
		ArrayList< String > winners = new ArrayList< String >();
		
		
		try {
			// access and read the file
			File file = new File("ECWinners.txt");
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			// read the the first line (team)
			String team = br.readLine();
			
			while (team != null) {
				winners.add(team);
				team = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file ! ");
		} catch (Exception exception) {
			System.out.println("Other problem");
		}
		
		// return the list
		return winners;	
		
		
	}

}
