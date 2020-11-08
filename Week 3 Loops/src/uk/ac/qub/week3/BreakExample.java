/**
 * 
 */
package uk.ac.qub.week3;

/**
 * @author geraldcraig
 *
 */
public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int loop;
		loop = 10;
		
		do {
			if (loop == 3) {
				System.out.println("Abort");
				break;
			}
			System.out.println(loop);
			loop --;
			
		}
		while (loop > 0);

	}

}
