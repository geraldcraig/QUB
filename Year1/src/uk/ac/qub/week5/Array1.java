/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double total = 0;
		double avg = 0;
		double[] shoeSize = { 11, 10, 10, 9, 11, 9, 11, 8.5 };
		
		System.out.printf("%s%18s\n", "Shoe Size", "Current Avg");
		for (int i = 0; i < shoeSize.length; i++) {
			
			total = total + shoeSize[i];
			avg = total/shoeSize.length;
			
			System.out.printf("%s%18s\n", shoeSize[i], avg);
			
		}
		
		System.out.println("\nOverall average is : " + avg);
	}

}
