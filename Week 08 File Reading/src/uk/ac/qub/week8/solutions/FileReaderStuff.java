package uk.ac.qub.week8.solutions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderStuff {

	public static void main(String[] args) {
		
		String line;
		
		// get access to the file
		File file = new File("Teams.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			fr.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file !");
		} catch (IOException e) {
			System.out.println("Something bad happened when reading the file");
		}
		
		System.out.println("End");
		
	}

}
