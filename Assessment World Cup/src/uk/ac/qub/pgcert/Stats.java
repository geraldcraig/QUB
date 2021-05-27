package uk.ac.qub.pgcert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Stats {
	
	public static ArrayList<Match> matches = new  ArrayList<Match>();

	public static void main(String[] args) {
		readData();
		//displayAll(matches);
		System.out.println("hello");

	}

	public static void displayAll(ArrayList<Match> match) {
		for (Match m : match) {
			System.out.println(m);
		}	
	}

	public static void readData() {
		System.out.println("reading file");
		File file = new File("WorldCupMatches.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			line = br.readLine();
			
			while(line != null); {
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
				System.out.println("hello world");
				line = br.readLine();	
			}
			
			br.close();
			fr.close();	
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	

}
