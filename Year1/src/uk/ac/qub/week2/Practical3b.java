/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Practical3b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int score;
		score = 0;
		
		System.out.println("Please enter Masters score");
		score = scanner.nextInt();
		
		if (score >= 70 && score <= 100) {
			System.out.println("Classification : distinction");
		} 
		if (score >= 60 && score <= 69) {
			System.out.println("Classification : merit");
		} 
		if (score >= 50 && score <= 59) {
			System.out.println("Classification : pass");
		} 
		else if (score >= 0 && score <= 49){
			System.out.println("Classification : fail");
		}
		scanner.close();
	}

}
