/**
 * 
 */
package uk.ac.qub.msc.graduation.processor.solution2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author 3048013
 *
 */
public class MScDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Student st = new Student(111111, "Bob", "Jones", new int[] {12,80,36,67,99});
		//st.printStudentDetails();
		
		//double d = st.getAverageModuleScore();
		
//		Random rand = new Random();
//		double d = rand.nextDouble();
		
		ArrayList<Student> list = readStudentList("ModuleScoresMSc_withClass.csv");
		System.out.println();
		
		System.out.println(list.size());
		
		printOverAverage(list, 80);
		
		System.out.println("****\nClassifications\n****\n");
		classify(list);
		
		System.out.println("over average again");
		printOverAverage(list, 80);
		
		//Classification c =Classification.valueOf("DISTINCTION");
		
		//System.out.println(c);
		
//		for(Student stud: list) {
//			stud.printStudentDetails();
//		}
		
		
	}
	
	public static void classify(ArrayList<Student> list) {
		for(Student std : list) {
		//for(int i=0;i<list.size();i++) {
			//Student std = list.get(i);
			double avg = std.getAverageModuleScore();
			Classification c = Classification.ERROR;
			if(avg<0 || avg>100) {
				c = Classification.ERROR;
			}else if(avg>70) {
				c = Classification.DISTINCTION;
			}
			
			std.setClassification(c);
			
//			System.out.println(std.getFirstName());
//			System.out.println(std.getLastName());
//			System.out.println(std.getAverageModuleScore());
//			System.out.println("Class: "+c);
		}
	}
	
	
	/**
	 * print details of all students with an average over the threshold
	 * @param list
	 * @param threshold
	 */
	public static void printOverAverage(ArrayList<Student> list, double threshold) {
		System.out.println("Students with an avg of "+threshold +" or above: ");
		for(Student std: list) {
			if(std.getAverageModuleScore()>=threshold) {
				std.printStudentDetails();
			}
		}
	}
	
	public static ArrayList<Student> readStudentList(String filename){
		ArrayList<Student> students =  new ArrayList<Student>();
		
		File file = new File(filename);
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			line = br.readLine();
			while(line !=null) {
				String[] parts = line.split(",");
				int sNum = Integer.parseInt(parts[0]);
				String fName = parts[1];
				String sName = parts[2];
				int[] scores = new int[5];
				for(int i=3;i<8;i++) {
					int thisScore = Integer.parseInt(parts[i]);
					scores[i-3] = thisScore;
				}
				
				Student student;
				if(parts.length==9) {
					student = new Student(sNum, fName, sName, scores, Classification.valueOf(parts[8]));
				}else {
					student = new Student(sNum, fName, sName, scores);
				}

				students.add(student);
				
				line = br.readLine();
			}
			
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found error");
		} catch (IOException e) {
			System.out.println("IO Exception");
		} catch(Exception e) {
			System.out.println("General exception");
			System.out.println("No further students added");
		}
		
		
		return students;
	}

}
