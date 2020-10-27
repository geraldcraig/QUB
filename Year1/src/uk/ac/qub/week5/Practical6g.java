/**
 * 
 */
package uk.ac.qub.week5;

import java.util.Arrays;

/**
 * @author geraldcraig
 *
 */
public class Practical6g {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int element = 0;
		int[] evenNums = new int[50];
		int total = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNums[element] = i;
				element++;			
			}	
		
		}
		
		for (int i = 0; i < evenNums.length; i++) {
			total = total + evenNums[i];
			
		}
		System.out.println(Arrays.toString(evenNums));
		System.out.println("Total is : " + total);
	
	}

}
