/**
 * 
 */
package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author geraldcraig
 *
 */
public class Examresults {
	
	public Examresults() {
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<MScStudent> students = new ArrayList<MScStudent>();
		
		getAll(students);
		
		showAll(students);
		
		
		
		
	}	
	
	public static void getAll(ArrayList<MScStudent> students) {
		
		File file = new File("ModuleScoresMSc.csv");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			line = br.readLine();
			
			while (line != null) {
				MScStudent student = new MScStudent();
				
				String[] values = line.split(",");
				student.setsNum(Integer.parseInt(values[0]));
				
				
				students.add(student);
				
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
		
			
		
	}
	
	public static void showAll(ArrayList<MScStudent> students) {
		for (MScStudent s : students) {
			System.out.println(students.size());
		}
			
	}
	
	
}
