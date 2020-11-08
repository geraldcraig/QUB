/**
 * 
 */
package uk.ac.qub.week6;

/**
 * @author geraldcraig
 *
 */
public class MaxNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int z = max(23,45);
		//System.out.println("max number is " + z);
		System.out.println("max number is : " + max(23,45));

	}

	public static int max(int a, int b) {
		int result;
		if (a > b) 
			result = a;
		else 
			result = b;
		return result;
	}

}
