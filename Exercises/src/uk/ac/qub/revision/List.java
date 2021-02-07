package uk.ac.qub.revision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class List {
	
	public static void main(String[] args) {
	ArrayList<Student> records = new ArrayList<Student>();
	
	String line;
	
	try {
		File file = new File("examSubmissionsSample2.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		line = br.readLine();
		
		Student stu = new Student();
		
		while (line != null) {
			String[] values = line.split(",");
			stu.setStuNum(Integer.parseInt(values[0]));
			stu.setName(values[1]);
			stu.setLab(values[2]);
			
			records.add(stu);
			
			line = br.readLine();
			
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
}
	
