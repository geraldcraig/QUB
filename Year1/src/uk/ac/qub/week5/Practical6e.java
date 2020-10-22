/**
 * 
 */
package uk.ac.qub.week5;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Practical6e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		System.out.println("Enter first name");
		name = scan.next().toLowerCase();

		for (int j = 0; j < name.length(); j++) {
			if (name.charAt(j) == 'a') {
				a = a + 1;
				System.out.println("Total for 'a' is : " + a);
			}
			if (name.charAt(j) == 'e') {
				e = e + 1;
				System.out.println("Total for 'e' is : " + e);
			}
			if (name.charAt(j) == 'i') {
				i = i + 1;
				System.out.println("Total for 'i' is : " + i);
			}
			if (name.charAt(j) == 'o') {
				o = o + 1;
				System.out.println("Total for 'o' is : " + o);
			}
			if (name.charAt(j) == 'u') {
				u = u + 1;
				System.out.println("Total for 'u' is : " + u);
			}
		}
		scan.close();
	}
}
