package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ECWinners {

	public static void main(String[] args) {
	
		ArrayList<String> allWinners = showAllWinners();
		
		for (String win : allWinners) {
			System.out.println(win);
		}
		System.out.println(allWinners);
		
		int year = 1956;
		for(int i = 0; i < allWinners.size(); i++) {
			
			System.out.println("Year : " + year  + " : " + allWinners.get(i));
			year++;
		}
		
		
		

	}
	
	public static ArrayList<String> showAllWinners() {
		
		ArrayList<String> allwinners = new ArrayList<String>();
		
		
		try {
			File file = new File("ECWinners.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				allwinners.add(line);
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
		
		return allwinners;
	}

}
