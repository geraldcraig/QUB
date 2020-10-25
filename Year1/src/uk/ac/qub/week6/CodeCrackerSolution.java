package uk.ac.qub.week6;

import java.util.Arrays;
/**
 * Programming challenge - needs awareness of arrays, loops, Strings, (ASCII), methods 
 * @author Aidan McG
 * 
 */

public class CodeCrackerSolution {
	
	/**
	 * Will code a number of characters (String) to ASCII and also has ability to decode an ascii numeric value
	 * @see http://www.asciitable.com/
	 * @param args
	 */
	public static void main(String[] args) {

		// challenge ... codify your name !
		String name = "Aidan McGowan";
		System.out.println("String to be coded ... "+name);
		int[] coded = code(name);
		System.out.println(Arrays.toString(coded));

		// uncoded
		char[] uncoded = decode(coded);
		System.out.println(Arrays.toString(uncoded));

	}
	
	/**
	 * Codes a string array char by char into ACSII numeric value
	 * @param name
	 * @return
	 */
	public static int[] code(String name) {
		int[] coded = new int[name.length()];
		// code up
		for (int loop = 0; loop < name.length(); loop++) {
			coded[loop] = (int) name.charAt(loop);
		}
		return coded;
	}
	

	/**
	 * Decodes an ACSII based array to a readable char array
	 * @param coded (ASCII number based array)
	 * @return (readable char array)
	 */
	public static char[] decode(int[] coded) {
		char[] uncoded = new char[coded.length];

		for (int loop = 0; loop < coded.length; loop++) {
			uncoded[loop] = (char) coded[loop];
		}
		
		return uncoded;
	}

}
