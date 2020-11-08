/**
 * 
 */
package uk.ac.qub.week4;

import java.util.Random;
/**
 * @author geraldcraig
 *
 */
public class Practical5a {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {

		oddEven(10);
		upperToLower('a');
		isMultiple(4, 15);
		randomNumbers();

	}

	public static void oddEven(int a) {

		if (a % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

	public static void upperToLower(char letter) {

		if (Character.isLowerCase(letter)) {
			System.out.println(("already lower case"));
		} else {

			System.out.println(Character.toLowerCase(letter));

		}
	}
	 public static void isMultiple(int num1, int num2) {
		 if (num2 % num1 == 0) {
			 System.out.println("num2 is a multiple of num1");
		 } else {
			 System.out.println("num2 is not a multiple of num1");
		 }
	 }

	 public static void randomNumbers() {
		 Random rand = new Random();
		 int num = 0;
		 for (int i = 0; i < 10; i++) {
			 num = rand.nextInt(100) + 1;
			 System.out.println(num);
		 }
	 }
}
