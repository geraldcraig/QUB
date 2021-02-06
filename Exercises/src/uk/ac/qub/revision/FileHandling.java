package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandling {

	public static void main(String[] args) {
		
		String line;
		
		File file = new File("examSubmissionsSample2 .csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] values = line.split(",");
				System.out.println("ID: " + values[0] + " Name : " + values[1]);
				line = br.readLine();
			}
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("problem reading file");
		} catch (Exception e) {
			System.out.println("something else happened");
		}		
	}
}
