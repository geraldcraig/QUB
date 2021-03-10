package uk.ac.qub.week8.solutions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStuff {

	public static void main(String[] args) {
		
		String data = "Japan";
		char newLine = '\n';
		
		// file to access to write
		File file = new File("Teams.txt");
		
		// check to see if file exists
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Not able to create the file");
			}
		}
		
		try {
			// write to the file
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(newLine+data);
			
			// close resources
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
