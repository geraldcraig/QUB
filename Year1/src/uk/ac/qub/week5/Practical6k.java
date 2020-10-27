/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6k {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] quote = { "Continuous", "effort", "not", "strength", "nor", "intelligence", "is", "the", "key", "for",
				"unlocking", "our", "potential" };
		
		String full = "";
		String smallest = quote[0];
		String largest = quote[0];
		int letters = 0;

		for (int i = 0; i < quote.length; i++) {
			full = full + quote[i] + " ";
			letters = letters + quote[i].length();

			if (quote[i].length() < smallest.length()) {
				smallest = quote[i];
			}
			if (quote[i].length() > largest.length()) {
				largest = quote[i];
			}

		}
		System.out.println(full);
		System.out.println("Words in quote : " + quote.length);
		System.out.println("Total letters in quote : " + letters);
		System.out.println("Smallest word is : " + smallest);
		System.out.println("Largest word is : " + largest);
	}

}
