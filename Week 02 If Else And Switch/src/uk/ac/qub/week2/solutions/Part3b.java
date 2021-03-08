 package uk.ac.qub.week2.solutions;

import java.util.Scanner;

/**
 *  Part 3b Practical 3.
 * @author amcgowan
 */
public class Part3b {

	/**
	 * Voting program. Prompts for vote party and then outputs confirmation
	 * @param args
	 */
	public static void main(String[] args) {

		// values to hold the party short version and party full version names 
		String partyVote, partyFullName;

		// set up scanner
		Scanner scanner = new Scanner(System.in);

        System.out.println("Voting...");
        System.out.println("Enter 'con' for Conservative and 'lab' for Labour");
        partyVote = scanner.next();

        // check the input - first for a valid return
        if (partyVote.equalsIgnoreCase("con") || partyVote.equalsIgnoreCase("lab")){
        	// recognised input - using conditional operator to map entry to full party name
        	partyFullName = partyVote.equalsIgnoreCase("con") ? "Conservative" : "Labour";
        	System.out.println("Voted registered for " + partyFullName);
        } else {
        	// unrecognised input
        	System.out.println("Sorry voting party unrecognised");
        }
        scanner.close();
	}

}
