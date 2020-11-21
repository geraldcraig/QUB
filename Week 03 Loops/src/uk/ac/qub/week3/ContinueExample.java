/**
 * 
 */
package uk.ac.qub.week3;

/**
 * @author geraldcraig
 *
 */
public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int reps;
		reps = 0;
		
		while (reps < 10 ) {
			reps++;
			
			if (reps == 3 || reps == 4) {
				System.out.println("miss a few");
				continue;
			}
			System.out.println("Yes ... " + reps);
		}

	}

}
