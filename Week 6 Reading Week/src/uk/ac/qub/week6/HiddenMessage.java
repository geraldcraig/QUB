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
		String hiddenMessage = "";
		for (int row = 0; row < message.length; row++) {
			for (int col = 0; col < message[row].length; col++) {
				System.out.println(message[row][col]);
			
		}
			int lastIndex = message[row].length - 1;
			//System.out.println(message[row][lastIndex]);
			String lastWord = message[row][lastIndex];
			lastWord = lastWord.toUpperCase();
			char lastChar = lastWord.charAt(lastWord.length()-1);
			hiddenMessage += lastChar;
		
			
		
		}
		System.out.print("Hidden message is : " + hiddenMessage);
		

}
}
