/**
 * 
 */
package uk.ac.qub.week5;

import java.util.Arrays;

/**
 * @author geraldcraig
 *
 */
public class SortingAndPrintingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] theArray = {"Zebra", "Giraffe", "Aardvark", "Cat", "Dog"};
		String toPrint = Arrays.toString(theArray);
		System.out.println("Unsorted " + toPrint);
		
		Arrays.sort(theArray);
		System.out.println("Sorted " + Arrays.toString(theArray));
		
		int[] numArray = {2, 1, 4, -5, 3};
		System.out.println("Unsorted " + Arrays.toString(numArray));
		
		Arrays.sort(numArray);
		System.out.println("Sorted " + Arrays.toString(numArray));
		
		// 2D array initialiser
		int[][] multi = {{3, 4, 5}, {6, 7, 8}, {55, 66, 77, 888, 22}, {12, 44}};
		
		// using the Arrays.toString to print rows
		for (int row = 0; row < multi.length; row++) {
			System.out.println(Arrays.toString(multi[row]));
		}
		
		// using for loop to print all numbers on one line
		for (int row = 0; row < multi.length; row++) {
			for (int col = 0; col < multi[row].length; col++) {
				System.out.printf("%d ", multi[row][col]);
			}
		}
	}

}
