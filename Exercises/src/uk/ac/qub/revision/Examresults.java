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
		
		
		
		String line;
		
		File file = new File("ModuleScoresMSc.csv");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			line = br.readLine();
			
			line = br.readLine();
			
			
			while(line != null) {
				MScStudent student = new MScStudent();
				String[] values = line.split(",");
				student.setsNum(Integer.parseInt(values[0]));
				student.setFname(values[1]);
				student.setLname(values[2]);
				student.setProgram(Integer.parseInt(values[3]));
				student.setCf(Integer.parseInt(values[4]));
				student.setDbs(Integer.parseInt(values[5]));
				student.setWeb(Integer.parseInt(values[6]));
				student.setSoftEng(Integer.parseInt(values[7]));
				
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
		
		for (MScStudent student : students) {
			student.displayAll();
		}
		
		
	}	
	
	
}
