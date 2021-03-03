/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class Practical2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		convertFromUpperToLower('a');
		convertFromUpperToLower('B');
		
	

	}
	
	public static void convertFromUpperToLower(char letter) {
		if (Character.isLowerCase(letter)) {
			System.out.println(letter);
		} else {
			System.out.println(Character.toLowerCase(letter));
		}
	}

}
