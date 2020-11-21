/**
 * 
 */
package uk.ac.qub.week3;

/**
 * @author geraldcraig
 *
 */
public class WhileLoopDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int loopVar = 0;
		
		
		while(loopVar<20) {
			if(loopVar % 2 == 0) {
				System.out.println(loopVar + " is even");
			}
			loopVar++;
			System.out.println("current value" + loopVar);
		}
		

		System.out.println("End of program");
		System.out.println("Final value of " + loopVar);
	}

}
