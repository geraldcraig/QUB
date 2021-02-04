/**
 * 
 */
package uk.ac.gub.msc.graduation.processor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author geraldcraig
 *
 */
public class ExamResultProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String line;
		
		try {
			
		File file = new File("ModuleScoresMSc.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		
			br.close();
			fr.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
