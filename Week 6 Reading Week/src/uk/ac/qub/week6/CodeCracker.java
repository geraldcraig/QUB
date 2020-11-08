/**
 * 
 */
package uk.ac.qub.week6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class CodeCracker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		
		System.out.println("Input name...");
		
		name = scan.nextLine();
		
		int[] code = new int[name.length()];
		
		for (int i = 0; i < name.length(); i++) {
			code [i]= (int) name.charAt(i);
		}
	
		System.out.println(Arrays.toString(code));
		
		scan.close();
		
		decode(code);
	}
		public static void decode(int []code) {
			char[] decode = new char[code.length];
			
			for (int i = 0; i < code.length; i++) {
				decode [i] = (char) code [i];
			}
			
			System.out.println(Arrays.toString(decode));
			
	
	}

}
