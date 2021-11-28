package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EuroWinners {

	public static void main(String[] args) {
		
		
		ArrayList<String> winners = new ArrayList<>();
				
		String line;

		File file = new File("ECWinners.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			while (line != null) {
				winners.add(line);
				
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
		int year = 1956;
		for (String w : winners) {
			
			System.out.println(year + " : " + w);
			year++;
		}
		
		ArrayList<String> noDuplicates = new ArrayList<>();
		
		for ( int i = 0; i < winners.size(); i++) {
			if (!noDuplicates.contains(winners.get(i))) {
				noDuplicates.add(winners.get(i));
			}
		}
		
		for (String n : noDuplicates) {
			System.out.println(n);
		}
				
	}

}
