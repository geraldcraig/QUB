/**
 * 
 */
package uk.ac.qub.filestuff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class NumberList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = getList(5);
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		writeListToFile(list,"MyList.txt");

	}
	
	public static void writeListToFile(int[] output, String filename ) {
		
		try {
			File targetFile = new File(filename);
			FileWriter fr = new FileWriter(targetFile);
			BufferedWriter buffw = new BufferedWriter(fr);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static int[] getList(int target) {
		int[] theList = new int[target];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < target; i++) {
			System.out.println("Enter next int : ");
			theList[i] = sc.nextInt();
		}
		return theList;
	}

}
