/**
 * 
 */
package uk.ac.qub.week3;

/**
 * @author geraldcraig
 *
 */
public class NestedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int outer = 1; outer <= 3; outer++) {
			
			for (int inner = 1; inner <= 5; inner++) {
				
				System.out.print(outer + " " + inner + "  ");
			}// end inner loop
			
			System.out.println();
			
		}// end outer loop

	}

}
