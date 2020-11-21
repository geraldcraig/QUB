/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class MethodsReturns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		biggestNumber(3, 4);
		
	}

	
	public static int biggestNumber(int num1, int num2) {
		
		int biggestNum = num1;
		
		if (num1 > num2) {
			biggestNum = num1;
		} else {
			biggestNum = num2;
		}
		return biggestNum;
	}
}
