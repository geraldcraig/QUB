/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class EightBall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		int num;
		String question;

		System.out.println("What's your question");
		question = scan.nextLine();
		System.out.println("You want to know... " + question);

		num = rand.nextInt(8);
		num = num + 1;

		switch (num) {
		case 1:
			System.out.println("As I see it, yes");
			break;
		case 2:
			System.out.println("Ask again later");
			break;
		case 3:
			System.out.println("Better not tell you now");
			break;
		case 4:
			System.out.println("Cannot predict now");
			break;
		case 5:
			System.out.println("Concentrate and ask again");
			break;
		case 6:
			System.out.println("Don't count on it");
			break;
		case 7:
			System.out.println("It is certain");
			break;
		case 8:
			System.out.println("It is decidedly so");
			break;
		default:
			System.out.println("I don't know");
		}
		scan.close();

	}

}
