/**
 * 
 */
package uk.ac.qub.week2;

/**
 * @author geraldcraig
 *
 */
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// output text
		int number;
		number = 1;
		
		switch (number + 2) {
		case 1: System.out.println("It's a one");
			System.out.println("And a nice one at that");
			break;
		case 2:
			System.out.println("twas a two");
			break;
		case 3:
			System.out.println("third times the charm");
			break;
		case 4:
			System.out.println("Go fourth");
			break;
		default:
			System.out.println("no idea");
		}
	}

}
