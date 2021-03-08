/**
 * 
 */
package uk.ac.qub.week2.solutions;

/**
 * Class to return vowel or consonant
 * @author Aidan
 *
 */
public class LetterBetter {

	/**
	 * Method checks a letter and will output if it is a vowel or consonant
	 * @param args
	 */
	public static void main(String[] args) {

		char letter;
		letter = 'e';

		switch (letter) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			System.out.println("consonant");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
