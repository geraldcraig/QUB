/**
 * 
 */
package uk.ac.qub.week9;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int age = 0;
		Scanner scan = new Scanner(System.in);
		Boolean OK = false;

		do {
			try {
				System.out.println("Enter your age ");
				age = scan.nextInt();
				System.out.printf("%d That is quite old !", age);
				scan.close();
				OK = true;
			} catch (Exception ex) {
				System.out.println("Oops try again! ");
				OK = false;
				scan.next();
			}
		} while (!OK);
	}

}
