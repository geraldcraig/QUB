/**
 * 
 */
package uk.ac.qub.week8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author geraldcraig
 *
 */
public class WriteData {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("Scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		
		// Create file
		PrintWriter output = new PrintWriter(file);
		
		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		
		// Close the file
		output.close();
	}

}
