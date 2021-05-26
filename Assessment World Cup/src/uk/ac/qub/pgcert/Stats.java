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
				
				Match match = new Match(year, host, host, host, host, year, host, year, year, host, host, year, year, line, host);
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
