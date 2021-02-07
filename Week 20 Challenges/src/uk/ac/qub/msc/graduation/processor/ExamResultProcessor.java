/**
 * 
 */
package uk.ac.qub.msc.graduation.processor;

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
		
		MScStudent m1 = new MScStudent(2, 03, 04, 05, 07);
		m1.setfName("John");
		m1.setlName("Doe");
		m1.setStuNum(010101);
		
		System.out.println(m1.getfName());
		System.out.println(m1.getlName());
		System.out.println(m1.getcFound());
		
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
