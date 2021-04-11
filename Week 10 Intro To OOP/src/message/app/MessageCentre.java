/**
 * 
 */
package message.app;

/**
 * @author Gerald
 *
 */
public class MessageCentre {

	/**
	 * Method that prints to screen a welcome message	
	 */
	public void displayWelcomeMessage(String timeofDay) {
		
		String message;
		message = "Hello";
		
		if (timeofDay.equalsIgnoreCase("am")) {
			message += " and good morning";
		} else if (timeofDay.equalsIgnoreCase("pm")) {
			message += " and good afternoon";
		} else {
			// unknown value passed as parameter
			message += " and good day";
		}
		System.out.println(message);
	}

}
