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
		int total = 0;
		for ( int i = 0; i < myArray.length; i++) {
			System.out.printf("%5d%8d\n", i, myArray[i]);	
			total += myArray[i];
			
			
		}
		double avg = (double) (total)/myArray.length;
		
		System.out.println("Avg of array values is " + avg);
		
	}
	
	

}
