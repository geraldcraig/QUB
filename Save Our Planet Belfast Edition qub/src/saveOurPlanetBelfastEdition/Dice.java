package saveOurPlanetBelfastEdition;


/**
 * The dice object calls a single dice of X sides. By default there is a base value NUM_OF_SIDES = 4 or alternatively x number of sides can be specified via the constructor. 
 * rolling the dice generates a random value between 1 and x number of sides 
 * @author Oisin Dorton 
 */
public class Dice {
	
	//==================================================
	//============::Instance Variables::================
	//==================================================
	
	private final int NUM_OF_SIDES;
	private int value;
	
	//==================================================
	//=============::Constructors::=====================
	//==================================================
	/**
	 * Initialises the dice with a base values of 1 and default NUM_OF_SIDES = 4
	 */
	public Dice() {
		NUM_OF_SIDES = 4;
		value=1;
	}
	
	/**
	 * Initialises the dice with a base value of 1 and  NUM_OF_SIDES = inputNumberOfSides
	 * @param inputNumberOfSides
	 */
	public Dice(int inputNumberOfSides) {
		NUM_OF_SIDES =inputNumberOfSides;
		value=1;
	}
	

	//==================================================
	//==============::Getter/Setters::==================
	//==================================================
	/**
	 * sets the value of the dice to the inputValue
	 * @param inputValue an integer with the value of 1 to the NUM_OF_SIDES
	 */
	public void setValue(int inputValue) {
		value = inputValue; 
		
	}
	
	/**
	 * gets the value of the dice
	 * @return value of the dice
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * returns the final integer variable NUM_OF_SIDES
	 * @return NUM_OF_SIDES
	 */
	public int getNumOfSides() {
		return NUM_OF_SIDES;
	}
	
	//==================================================
	//==================::Roll Dice::===================
	//==================================================
	/**
	 * generates a random value between 1 and NUM_OF_SIDES for the dice
	 * ---this is a psuedo random value---
	 */
	public void rollDice() {
		value = (int)(Math.random()*NUM_OF_SIDES)+1; //
	}
	
	//==================================================
	//==============::Dice to String::==================
	//==================================================
	/**
	 * overrides the default to string method
	 */
	public String toString() {
		return "{" + value + "}";
	}
	
	
	//..........................................................................................................
	//.FFFFFFFFFF.UUUU...UUUU..NNNN...NNNN....CCCCCCC....TTTTTTTTTTTIIII...OOOOOOO.....NNNN...NNNN...SSSSSSS....
	//.FFFFFFFFFF.UUUU...UUUU..NNNNN..NNNN...CCCCCCCCC...TTTTTTTTTTTIIII..OOOOOOOOOO...NNNNN..NNNN..SSSSSSSSS...
	//.FFFFFFFFFF.UUUU...UUUU..NNNNN..NNNN..CCCCCCCCCCC..TTTTTTTTTTTIIII.OOOOOOOOOOOO..NNNNN..NNNN..SSSSSSSSSS..
	//.FFFF.......UUUU...UUUU..NNNNNN.NNNN..CCCC...CCCCC....TTTT...TIIII.OOOOO..OOOOO..NNNNNN.NNNN.NSSSS..SSSS..
	//.FFFF.......UUUU...UUUU..NNNNNN.NNNN.NCCC.....CCC.....TTTT...TIIIIIOOOO....OOOOO.NNNNNN.NNNN.NSSSS........
	//.FFFFFFFFF..UUUU...UUUU..NNNNNNNNNNN.NCCC.............TTTT...TIIIIIOOO......OOOO.NNNNNNNNNNN..SSSSSSS.....
	//.FFFFFFFFF..UUUU...UUUU..NNNNNNNNNNN.NCCC.............TTTT...TIIIIIOOO......OOOO.NNNNNNNNNNN...SSSSSSSSS..
	//.FFFFFFFFF..UUUU...UUUU..NNNNNNNNNNN.NCCC.............TTTT...TIIIIIOOO......OOOO.NNNNNNNNNNN.....SSSSSSS..
	//.FFFF.......UUUU...UUUU..NNNNNNNNNNN.NCCC.....CCC.....TTTT...TIIIIIOOOO....OOOOO.NNNNNNNNNNN........SSSS..
	//.FFFF.......UUUU...UUUU..NNNN.NNNNNN..CCCC...CCCCC....TTTT...TIIII.OOOOO..OOOOO..NNNN.NNNNNN.NSSS....SSS..
	//.FFFF.......UUUUUUUUUUU..NNNN..NNNNN..CCCCCCCCCCC.....TTTT...TIIII.OOOOOOOOOOOO..NNNN..NNNNN.NSSSSSSSSSS..
	//.FFFF........UUUUUUUUU...NNNN..NNNNN...CCCCCCCCCC.....TTTT...TIIII..OOOOOOOOOO...NNNN..NNNNN..SSSSSSSSSS..
	//.FFFF.........UUUUUUU....NNNN...NNNN....CCCCCCC.......TTTT...TIIII....OOOOOO.....NNNN...NNNN...SSSSSSSS...
	//..........................................................................................................
	
	
	//==================================================
	//===============::Generate Dice::==================
	//==================================================
	/**
	 * creates an array and initialises 2 dice objects
	 * @return returns dice
	 */
	public static Dice[] generateDice() {
		
		Dice[] dice = new Dice[2];  //creates a dice array with 2 dice references
		for (int i=0; i<dice.length; i++) { //Iterates through array and initialises the dice objects
		dice[i] = new Dice();
		}
		return dice;
	}
	
	//==================================================
	//==================::Roll Dice::===================
	//==================================================
	/**
	 * creates an integer array and fill it with 2 random values from 1 to NUM_OF_SIDES
	 * @return int [] of 2 random values, 1-NUM_OF_SIDES
	 */
	public static void rollDice(Dice[] dice) {
		for (int i=0; i<dice.length; i++) {
			dice[i].rollDice();
		}
	}
	
	//==================================================
	//==================::Sum Dice::====================
	//==================================================
	/**
	 * sums the values of the dice array into a total
	 * @param dice is a integer array full of numbers to be summed
	 * @return
	 */
	public static int sumDice(Dice[] dice) {
		
		int sum=0; 
		for (int i=0; i<dice.length; i++) {
			sum += dice[i].getValue();
		}
		return sum;
		
	}
	
	
	//==================================================
	//=================::Print Dice::===================
	//==================================================
	/**
	 * prints all values in the dice array
	 * @param dice is a integer array full of numbers to be printed
	 */
	public static void printDice(Dice[] dice) {
		
		System.out.print("You have rolled: ");
		for (Dice d: dice) {
			System.out.print(d);
			
		}
		
		System.out.println(" This totals " + sumDice(dice));
		 System.out.println();
	}
	
	
	
}
