/**
 * 
 */
package uk.ac.qub.week4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class CoinToss {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		// var used to convert from users call eg "Heads" to a number value eg 1
		int callConvert = 0;

		String call;
		Scanner scan = new Scanner(System.in);
		System.out.println("Heads or tails?");
		call = scan.next().toLowerCase();

		// map the call to a numeric value. 1 = heads and 2 = tails
		if (call == "heads") {
			callConvert = 1;
			System.out.println(callConvert);
		} else {
			callConvert = 2;
			System.out.println(callConvert);
		}
		// "toss the coin". Generate either a 1 or a 2
		Random rand = new Random();
		result = rand.nextInt(2) + 1;

		// show the result of the coin toss
		if (result == 1) {
			System.out.print("Heads ");
		} else {
			System.out.print("Tails ");
		}

		// check if user called it correctly
		if (callConvert == result) {
			System.out.print(" you win");
		} else {
			System.out.print(" you lose");
		}
		scan.close();
	}

}
