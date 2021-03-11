/**
 * 
 */
package uk.ac.qub.week12;

import java.util.ArrayList;

/**
 * @author Gerald
 *
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "Antarctic", 919, 13, 13);

		Whale[] whales = { w1, w2, w3, w4 };

		displayAll(whales);
		
		swimMost(whales);

	}

	public static void displayAll(Whale[] whales) {
		for (Whale w : whales) {
			System.out.println(w.toString());
		}
	}
	
	public static void swimMost(Whale[] whales) {
		for (int i = 0; i < whales.length; i++) {
			if(whales[i].getMainOcean().equals("Atlantic")) {
				System.out.println(whales[i].getName());
			}
		}
	}

}
