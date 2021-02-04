/**
 * 
 */
package uk.ac.qub.filestuff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author geraldcraig
 *
 */
public class AppendToFileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String data = "\nSpurs";
			// create a file object
			File file = new File("Teams.txt");

			// if file doesn't exist, the create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// true = append to end of file
			FileWriter fileWriter = new FileWriter(file.getName(), true);
			// Note - using BufferWriter is more efficient with multiple writes to file
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(data);
			bufferWriter.close();
			fileWriter.close();
			System.out.println("Done - check the file !");

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
