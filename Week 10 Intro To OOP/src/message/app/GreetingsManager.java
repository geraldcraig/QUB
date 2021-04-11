/**
 * 
 */
package message.app;

/**
 * @author Gerald
 *
 */
public class GreetingsManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Greetings app started");
		
		// create an object of MessageCentre
		MessageCentre messageCentre = new MessageCentre();
		// invoking method of MessageCentre
		messageCentre.displayWelcomeMessage("pm");
		
		System.out.println("Greetings app ending");

	}

}
