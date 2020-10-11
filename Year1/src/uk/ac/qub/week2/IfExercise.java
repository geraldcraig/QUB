/**
 * 
 */
package uk.ac.qub.week2;

/**
 * @author geraldcraig
 *
 */
public class IfExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		int age;
		boolean goodCreditHistory;
		
		// assign values
		age = 17;
		goodCreditHistory = true;
		
		// if statement to age and credit history
		if (age >= 18 && goodCreditHistory == true) {
			System.out.println("Successful application");
		} else {
			System.out.println("Application unsuccessful");
		}
		
		
		
		

	}

}
