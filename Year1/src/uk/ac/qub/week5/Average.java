/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] myArray = {34, 17, 45, 86, 15, 99};
		System.out.printf("%s%8s\n", "Index", "Value");
		
		for ( int i = 0; i < myArray.length; i++) {
			System.out.printf("%5d%8d\n", i, myArray[ i ]);	
		}
		
		System.out.println(Avg(9, 8.5, 10));

	}
	
	public static double Avg(double a, double b, double c) {
		return (a + b + c)/3;
		
	}

}
