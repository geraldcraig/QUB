package uk.ac.qub.week12.solutions;


/**
 * Test the whale class 
 * @author amcgowan
 *
 */
public class WhaleWatcher {

	
	/**
	 * Tests the whale class
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 	Name		Right		Blue	Sperm		Humpback
			Main ocean	Atlantic	Pacific	Atlantic	Antarctic
			Weight		2001		2001	1900		919
			Max Speed	21			23		20			13
			Length		16			16		40			13 
		 */

		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		Whale[] whales = {w1, w2,w3,w4};
		
		displayAll(whales);
		
		
		whalesByOcean(whales, "Atlantic");
		
		fastestWhale(whales);
		
		heaviestWhale(whales);

	}
	
	/**
	 * Prints all whale details to screen
	 * @param whales
	 */
	public static void displayAll(Whale[] whales) {
		System.out.println("Displaying all whales ");
		for (Whale whale : whales) {
			System.out.println(whale.toString());
		}
		System.out.println();
	}

	
	/**
	 * Searches for the whales by given ocean
	 * @param whales
	 * @param ocean
	 */
	public static void whalesByOcean(Whale[] whales, String ocean){
		System.out.println("Names of whales that swim in the "+ocean);
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getMainOcean().equals(ocean)){
				System.out.println(whales[loop].getName());
			}
		}
	}
	
	/**
	 * Output the fastest whale(s)
	 * @param whales
	 */
	public static void fastestWhale(Whale[] whales){
		System.out.println("Searching for fastest whale");
		// need to search for the fastest speed
		int fastest = whales[0].getMaxSpeed();
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getMaxSpeed()>fastest){
				fastest=whales[loop].getMaxSpeed();
			}
		}
		
		// now need to match and output the names of all whales with that speed
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getMaxSpeed()==fastest){
				System.out.println(whales[loop].getName());
			}
		}
	}
	
	
	/**
	 * Searches for the heaviest whale(s)
	 * @param whales
	 */
	public static void heaviestWhale(Whale[] whales){
		System.out.println("Searching for heaviest whale");
		// need to search for the heaviest value
		int heaviest = whales[0].getWeight();
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getWeight()>heaviest){
				heaviest=whales[loop].getWeight();
			}
		}
		
		// now need to match and output the names of all whales with that weight
		for (int loop=0;loop<whales.length;loop++){
			if (whales[loop].getWeight()==heaviest){
				System.out.println(whales[loop].getName());
			}
		}
	}
	
	
	
	
}
