/**
 * 
 */
package uk.ac.qub.week9;

import java.util.Random;

/**
 * @author geraldcraig
 *
 */
public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean done = false;
		do {
			try {

				int rand = 0;
				String[] oneDirection = { "Niall", "Harry", "Liam", "Louis" };

				Random random = new Random();
				// get random number 1 - 4
				rand = random.nextInt(5);

				System.out.println(oneDirection[rand]);
				done = true;
			} catch (Exception ex) {
				// problem
				System.out.println("Trying again");
				done = false;
			}
		} while (!done);
	}
}
