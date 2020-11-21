/**
 * 
 */
package uk.ac.qub.week4;

import java.util.Scanner;
import java.util.Random;

/**
 * @author geraldcraig
 *
 */
public class Practical5m {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String coinCall;
		
		int count = 0;
		System.out.println("Heads or Tails?");
		coinCall = scan.next();
		System.out.println(coinCall);
		
		if (coinCall.equalsIgnoreCase("Heads")) {
			count = 1;
			System.out.println(count);
		} else {
			count = 2;
			System.out.println(count);
		}
		
		coinToss();
		scan.close();
	}

	public static void coinToss() {
		Random rand = new Random();
		int toss = rand.nextInt(2) + 1;
		
		if (toss == 1) {
			System.out.println("Heads you win");
		} else {
			System.out.println("Tails you lose");
		}

	}

}
