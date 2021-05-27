package uk.ac.qub.pgcert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stats {
	
	public static ArrayList<Match> matches = new  ArrayList<Match>();

	public static void main(String[] args) {
		readData();
		showMenu();

	}

	public static void showMenu() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.println("File reading ");
		do {
			System.out.println("1. Output to screen all details of all matches");
			System.out.println("2. Output to screen the total attendances of all matches and "
					+ "the average attendance (to two decimal points) for WC matches");
			System.out.println("3. Output to screen the results of any searched for WC year");
			System.out.println("4. Output to screen the results of any searched for country that has played in the WC");
			System.out.println("5. Output to screen the following details for all WC final matches");
			System.out.println("6. Output to screen the total number of goals scored in all WC matches "
					+ "and the average goals per game (to two decimal places)");
			System.out.println("7. Output the details for the matches with the smallest attendance and also the largest attendance");
			System.out.println("8. Output to screen the details of each match that went to extra time");
			System.out.println("9. Output to screen the details of each match that went to penalties");
			System.out.println("10. Output to screen the percentage of games won by the team that were leading at half time");
			System.out.println("11. Quit");
			System.out.println("Enter option ...");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				displayAll(matches);
				break;
			case 2:
				//display(matches);
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
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				System.out.println("Quitting");
				break;
			default:
				System.out.println("Try options again ...");
			}
		} while (option != 11);
		sc.close();
		
	}

	public static void displayAll(ArrayList<Match> match) {
		for (Match m : match) {
			System.out.println(m);
		}	
		System.out.println();
	}

	public static void readData() {
		System.out.println("reading file");
		File file = new File("WorldCupMatches.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			line = br.readLine();
			
			while(line != null) {
				String[] parts = line.split(",");
				int year = Integer.parseInt(parts[0]);
				String host = parts[1];
				String stage = parts[2];
				String stadium = parts[3];
				String city = parts[4];
				int attendance = Integer.parseInt(parts[5]);
				String homeTeam = parts[6];
				int homeGoals = Integer.parseInt(parts[7]);
				int awayGoals = Integer.parseInt(parts[8]);
				String awayTeam = parts[9];
				String winCondition = parts[10];
				int htHomeGoals = Integer.parseInt(parts[11]);
				int htAwayGoals = Integer.parseInt(parts[12]);
				String homeInitials = parts[13];
				String awayInitials = parts[14];
				
				Match match = new Match(year, host, stage, stadium, city, attendance, homeTeam, homeGoals, awayGoals, awayTeam, winCondition,
						htHomeGoals, htAwayGoals, homeInitials, awayInitials);
				matches.add(match);
				
				line = br.readLine();	
			}
			
			br.close();
			fr.close();	
					
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch (Exception e) {
			System.out.println("Exception occured");
			System.out.println(matches.size() + " lines read successfully");
			System.out.println(e.getMessage());
		}
		System.out.println(matches.size() + " lines read successfully");	
	}

}
