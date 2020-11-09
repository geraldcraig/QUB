/**
 * 
 */
package uk.ac.qub.filestuff;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author geraldcraig
 *
 */
public class Practical1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// get access to a file
				File file = new File("Catch 22.txt");
				String line;
				
				// read the file
				try {
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
					line = br.readLine();

					// output to screen
					while (line != null) {
						System.out.println(line);
						line = br.readLine();			}
					

					// end of file

					// close any resources
					br.close();
					fr.close();

				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				} catch (IOException e) {
					System.out.println("Problem with reading the file");
				} catch (Exception e) {
					System.out.println("Had a problem...");
				}

	}

}
