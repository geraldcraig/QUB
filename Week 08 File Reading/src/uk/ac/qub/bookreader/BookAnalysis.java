package uk.ac.qub.bookreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @param args
 */
public class BookAnalysis {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 
		// 1. Output the full text to screen
		// 2. Output the number of lines 
		// 3. Output the number of words 
		// 4. Output the number of characters 
		// 5. Output the number of times the main character's name (Yossarian) is referenced in the text.
		// 6. Output the number of times the letter a is used. 
		// 7. Redact the word Yossarian from the complete text and replace with ---------   
		// (output the redacted text to an new file Catch22Redacted.txt.
		// 8. Check if the redaction has been successful... check that Yossarian no longer appears in the new text.  

		String line;
		int lines = 0;
		
		try {
			
		File file = new File("Catch 1.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			lines ++;
			line = br.readLine();
			
		}
			System.out.println(lines);
			br.close();
			fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}


}
