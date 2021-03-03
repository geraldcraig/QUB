/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class Practical3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		isMultiple(15, 3);
		isMultiple(3, 15);

	}
	
	static void isMultiple(int num1, int num2) {
		if (num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num1");
		} else {
			System.out.println("num2 is not a multiple of num1");
		}
	}

}
