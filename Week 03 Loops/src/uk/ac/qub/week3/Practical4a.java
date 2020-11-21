/**
 * 
 */
package uk.ac.qub.week3;

/**
 * @author geraldcraig
 *
 */
public class Practical4a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		int sum, num;
		// assign values
		num = 1;
		sum = 0;
		// do some maths
		//sum = num + sum;
		
		while (num < 11) {
			sum += num;	
			num++;
		}// end of loop
		
		// output to screen
		System.out.println("The sum is: " + sum);
	}
}
