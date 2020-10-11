/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class MinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		min(1, 2);
		max(3, 4);
		average(5, 6, 7, 8);
			

	}
	
	public static void min(int a, int b) {
		if (a < b) {
			System.out.println("Min value is : " + a);
			} else {
				System.out.println("Min value is : " + b);
			}
		
	}
	
	
	public static void max(int a, int b) {
		if (a > b) {
		System.out.println("Max value is : " + a);
		} else {
			System.out.println("Max value is : " + b);
		}
	}
	
	public static void average(int a, int b, int c, int d) {
		int total = a + b + c + d;
		double average = (double)total/4;
		System.out.println("Average value is : " + average);
		
	}
}
