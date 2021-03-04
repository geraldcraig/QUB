/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class Practical1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		oddEven(1);
		oddEven(0);
		oddEven(2);
		oddEven(-2);
	}
	
		public static void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
