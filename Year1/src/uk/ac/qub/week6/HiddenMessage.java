/**
 * 
 */
package uk.ac.qub.week6;

import java.util.Arrays;

/**
 * @author geraldcraig
 *
 */
public class HiddenMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 2D array of strings with hidden message
		String message[][] = { { "Buzz", "LightYear", "was" }, { "once", "apon", "a" }, { "time", "probably", "the " },
				{ "coolest", "character", "in", "Toy", "Story 2" }, { "but ", "Woody " },
				{ "was ", "always ", "Andy's ", "wow" }, { "toy.", "i" }, { "was", "never", "keen" },
				{ "because ", "I ", "don't " }, { "rate", "Tom", "Hanks.", "Woody ", "is", "quite", "dour" },
				{ "but", " Lightyear,", "could fly, sort of...", "Anyhow" }, { "the", "movies", "are", "classic" } };

		/*for (int i = 0; i < message.length; i++) {
			
		}*/
		for (String[] row : message) 
		System.out.println(Arrays.toString(row));
		
		
	}

}
