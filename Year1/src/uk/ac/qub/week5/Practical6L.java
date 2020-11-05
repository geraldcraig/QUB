/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6L {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] num = new int[4][4];
		int element = 2;
		int total = 0;
		int counter = 0;
		
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				num[row][col] = element;
				System.out.printf("%2d ", num[row][col]);
				element += 2;
				total += num[row][col];
				counter++;
			}
			System.out.println();// take new line at end of row
		
		
		}
		double avg = (double)total/counter;
		
		System.out.println("Average is : " + avg);
	}

}
