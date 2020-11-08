/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class CountdownExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		count(10);

	}
	
	public static void count(int start) {
		for (int i = start; i >= 0; i--) {
		
			System.out.println(i);
		}
			
	}

}
