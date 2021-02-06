package uk.ac.qub.csv.video.request.solution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class VideoRequestSelector {
	
	/*
	 * A program is required to process the data relating to students who sat an
	 * exam, some of whom did that exam at home, and identify a sample of them to
	 * request that they submit a follow up video recording.
	 * 
	 * Write a program which will read a preformatted csv file containing the class
	 * list (who submitted) and an indicator of who was in lab (therefore don't have
	 * a video) / did an email submission after the official end time (thus
	 * volunteering their video).
	 * 
	 * Exclude in lab people - they have no video available Identify 2 types of
	 * other people from the overall list: 1. email submission people - those
	 * volunteering their video 2. a specified target number randomly selected from
	 * the remainder of people
	 * 
	 * Write out a list so it can be referred to later and the candidates can be
	 * contacted to send their video
	 */
	public static void main(String[] args) {

		String filename = "examSubmissionsSample.csv";
		String ouputFilename = "emailListSample.csv";
		int percentToSelect = 25;
		
		processFiles(filename, percentToSelect, ouputFilename);
	}
	
	/**
	 * combine the various helper functions into a neat call sequence to process the files
	 * based on the input parameters set in the main method
	 * @param inputFname
	 * @param target
	 * @param outputFname
	 */
	public static void processFiles(String inputFname, int target, String outputFname) {
		//call checkHeader on input file and only attempt to process if it returns true
		if(checkHeader(inputFname)) {
			// get list excluding lab people (with flag for email and standard)
			String[][] list = buildList(inputFname);
			// get list of indexes who should be asked for their video (true/false)
			// corresponding to inputList positions
			boolean[] inds = getIndexes(list, target);

//			int num = getTarget(list, 10);
//			System.out.println("Request count "+num);

			writeOutList(list, inds, outputFname);

//			System.out.println(Arrays.toString(inds));
//			print2DStrArray(list);
			System.out.println("Done, File Created");
		}
		else {
			System.out.println("Sorry, unexpected file contents. Please check your input file and try again");
		}
	}

	public static boolean checkHeader(String fname) {
		boolean ok = false;
		try {
			File f = new File(fname);
			FileReader fr = new FileReader(f);
			BufferedReader bw = new BufferedReader(fr);
			String header = bw.readLine();
			// System.out.println(header);
			if (header.equals("ID,Name,Indicator (Lab/Email)")) {
				// file header must match perfectly to have any confidence file is of the right format
				// this probably isnt even a strong enough check to guarantee, but its a start
				// and better than nothing
				ok = true;
			}
			bw.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ok;
	}

	/**
	 * read from the given file of known format create a 2D array of strings based
	 * on the file contents which can be more easily processed by other methods
	 * 
	 * @param fname
	 * @return
	 */
	public static String[][] buildList(String fname) {
		File f = new File(fname);
		String line;
		int rowCount = 0;
		int labCount = 0;

		// read and count
		try {
			FileReader rd = new FileReader(f);
			BufferedReader br = new BufferedReader(rd);

			// read expected first line (header data - not relevant to task - could check
			// for errors)
			line = br.readLine();
			// System.out.println(line);

			line = br.readLine();// read first actual line
			while (line != null) {
				// System.out.println("Line is: "+line);
				// String[] parts = line.split(",");
				// System.out.println(Arrays.toString(parts)+" Length: "+parts.length);

				// primary purpose of this loop to count number of rows so array can be declared
				// of appropriate size
				rowCount++;
//				if (line.contains("lab"))
//					labCount++; // Scunthorpe Problem

				// csv is a series of strings with comma delimiters, divide line into an array
				// at the commas
				String[] parts = line.split(",");
				// some lines will have only 2 parts, some will have 3 with an indicator in the
				// 3rd space (index 2)
				if (parts.length > 2) {
					// System.out.println(Arrays.toString(parts));
					if (parts[2].contains("lab")) {
						labCount++;
					}
				}
				line = br.readLine();// readnext line ready for looping again
			}
			// close the file, ready to open it again now we know how long it is
			br.close();

//			System.out.println("Total num of lines: " + rowCount);
//			System.out.println("Num of lab people: " + labCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// array to hold all the people except the lab people
		String[][] names = new String[rowCount - labCount][3];

		try {
			FileReader rd = new FileReader(f);
			BufferedReader br = new BufferedReader(rd);

			// read expected first line (header data - not relevant to task - could check
			// for errors)
			line = br.readLine();
			int row = 0;

			line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				if (parts.length > 2) {
					// System.out.println(Arrays.toString(parts));
					if (parts[2].contains("lab")) {
						// skip this iteration
						line = br.readLine();
						continue;
					}
					// if we didnt skip, this must be an email person so record it
					names[row][2] = "email";
				} else {
					// if we are in this branch, there was no indicator on this line, but easier if
					// we add one to our internal data
					names[row][2] = "standard";
				}

				// regardless of what indicator has been recorded, copy the id and name into the
				// array
				names[row][0] = parts[0];
				names[row][1] = parts[1];

				// read next line and update other variables ready for next loop
				line = br.readLine();
				row++;
			}
			br.close();
			// System.out.println("end of file");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// print2DStrArray(names);
		return names;
	}

	/**
	 * helper function to print contents of a 2D String array to screen for
	 * debugging
	 * 
	 * @param arr
	 */
	public static void print2DStrArray(String[][] arr) {
		System.out.println("Names:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	/**
	 * receive formatted candidate list and a target percentage Verifies percentage
	 * is between 0-100 Counts number of "standard" candidates and computes how many
	 * should be selected based on percentage Should be 0-num of standard (rounded
	 * to nearest int) returns -1 if error
	 * 
	 * @param list
	 * @param percentage
	 * @return targetVal or -1 for error
	 */
	public static int getTarget(String[][] list, int percentage) {
		int targetVal;
		if (percentage < 0 || percentage > 100) {
			return -1;
		}

		int count = 0;
		for (String[] row : list) {
			if (row[2].equalsIgnoreCase("Standard")) {
				count++;
			}
		}
		double subSet = count * (percentage / 100.0);
		targetVal = (int) Math.round(subSet);
		return targetVal;
	}

	/**
	 * return an array of true/false the same size as the input array where true at
	 * a position indicates that corresponding value from input array should be
	 * included Assumes email should automatically be true, and will then pick
	 * randomly targetPercent percent from the standard options
	 * 
	 * @param candidates
	 * @param targetPercent
	 * @return
	 */
	public static boolean[] getIndexes(String[][] candidates, int targetPercent) {
		Random rand = new Random();
		boolean[] indexes = new boolean[candidates.length];
		int numStanToPick = getTarget(candidates, targetPercent); // num to pick (-1 if error in which case pick none)

		// set all "email people to true
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i][2].equals("email")) {
				indexes[i] = true;
			}
		}

		while (numStanToPick > 0) {
			int pos = rand.nextInt(indexes.length); // get a potential index
			if (!indexes[pos]) {
				// if value at selected index is false, worth checking if its standard
				if (candidates[pos][2].equals("standard")) {
					indexes[pos] = true;
					numStanToPick--; // reduce target
					// System.out.println("flipped " + pos);
				}
			}
			// System.out.println("still in loop");
		}

		return indexes;
	}

	/**
	 * take formatted 2D array of strings, and corresponding sized boolean[] for
	 * indexes write out the rows corresponding to true in the inds array to a csv
	 * file of the specified filename (overwrite if it exists)
	 * 
	 * @param list
	 * @param inds
	 */
	public static void writeOutList(String[][] list, boolean[] inds, String filename) {

		try {
			File f = new File(filename);
			FileWriter fr = new FileWriter(f);
			BufferedWriter buffwr = new BufferedWriter(fr);
			String header = "Student Num, Student Name, Indicator";
			buffwr.write(header);
			buffwr.newLine();
			for (int i = 0; i < list.length; i++) {
				// candidate line (3 string values separated by commas in order to produce a
				// csv)
				String line = String.format("%s,%s,%s", list[i][0], list[i][1], list[i][2]);
				if (inds[i]) {
					// write line if true at that position in inds array (line will be ignored
					// otherwise)
					buffwr.write(line);
					buffwr.newLine();
				}
			}
			buffwr.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
