package uk.ac.qub.msc.graduation.processor.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExamResultProcessor {
	
	public static void main(String[] args) {

		// container to hold the student details and scores etc
		ArrayList<MScStudent> students = new ArrayList<MScStudent>();

		// get the results from file
		readInStudentRecords(students);

		// now show all to screen
		showAllRecords(students);

		// classify the students
		classifyStudents(students);

		// now show all classified records to screen
		displayClassifications(students);

		// create the final classification record and write to a new file
		writeClassificationsToFile(students);
	}

	/**
	 * Reads in all student records
	 * 
	 * @param students
	 * @return
	 */
	private static void readInStudentRecords(ArrayList<MScStudent> students) {

		// get the results from file
		File file = new File("ModuleScoresMsc.csv");
		FileReader fr;
		BufferedReader br;
		String studentRecord;
		String[] studentDetails;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			// going to ignore the first line (as it is the header of the file)
			try {
				br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// now get each game details line by line
			studentRecord = br.readLine();

			// if we have a student record then in the loop we go ...
			while (studentRecord != null) {
				MScStudent student = new MScStudent();
				// parse the line (by each comma the line)
				studentDetails = studentRecord.split(",");

				// capturing the student details (need to parse some from a String to int
				student.setStudentNumber(Integer.parseInt(studentDetails[0]));
				student.setFirstName(studentDetails[1]);
				student.setLastName(studentDetails[2]);

				student.setProgramming(Integer.parseInt(studentDetails[3]));
				student.setComputingFoundations(Integer.parseInt(studentDetails[4]));
				student.setDb(Integer.parseInt(studentDetails[5]));
				student.setWeb(Integer.parseInt(studentDetails[6]));
				student.setSoftwareEngineering(Integer.parseInt(studentDetails[7]));

				// add the student to arraylist of students
				students.add(student);

				// get new student
				studentRecord = br.readLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println("Can't file module scores file");
		} catch (IOException e) {
			System.out.println("Connection problems");
		} catch (Exception e) {
			System.out.println("Problems. Contact your admin");
		}
	}

	/**
	 * Outputs all stored records to screen
	 * 
	 * @param students
	 */
	private static void showAllRecords(ArrayList<MScStudent> students) {
		for (MScStudent student : students) {
			student.displayStudentRecord();
		}
		System.out.println("Number of records : " + students.size());
	}

	/**
	 * Shows the students details with classifications and averages
	 * 
	 * @param students
	 */
	private static void displayClassifications(ArrayList<MScStudent> students) {
		for (MScStudent student : students) {
			student.displayStudentClassification();
		}
		System.out.println("Number of records : " + students.size());
	}

	/**
	 * runs the classifier for all students
	 * 
	 * @param students
	 */
	private static void classifyStudents(ArrayList<MScStudent> students) {
		for (MScStudent student : students) {
			student.classifyStudent();
		}
	}

	/**
	 * Write the classifications to file
	 * 
	 * @param students
	 */
	private static void writeClassificationsToFile(ArrayList<MScStudent> students) {
		File file = new File("ListForGraduation.txt");
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter(file, false);
			bw = new BufferedWriter(fw);
			// write all to file
			for (MScStudent student : students) {
				bw.write(student.getStudentNumber() + " " + student.getFirstName() + " " + student.getLastName() + " "
						+ student.getClassification() + "\n");
			}
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.out.println("Not able to write to file");
		}
	}

}
