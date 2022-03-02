package diceTest;

public class Dice {
	
	private final int NUM_OF_SIDES;
	private int value;
	
	public Dice() {
		NUM_OF_SIDES = 6;
		value = 1;
	}
	
	public Dice(int inputNumberOfSides) {
		NUM_OF_SIDES = inputNumberOfSides;
		value = 1;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getNUM_OF_SIDES() {
		return NUM_OF_SIDES;
	}
	
	public void rollDice() {
		value = (int)(Math.random()*NUM_OF_SIDES)+1;
	}
	
	public String toString() {
		return "{" + value + "}";
	}
	
	public static Dice[] generateDice() {
		Dice [] dice = new Dice[2];
		for (int i=0; i < dice.length; i++) {
			dice[i] = new Dice();
		}
		return dice;	
	}
	
	public static void rollDice(Dice [] dice) {
		for (int i = 0; i < dice.length; i++) {
			dice[i].rollDice();
		}
	}
	
	public static int sumDice(Dice [] dice) {
		 int sum = 0;
		 for ( int i = 0; i < dice.length; i++) {
			 sum += dice[i].getValue();
		 }
		 return sum;
	}
	
	public static void printDice(Dice [] dice) {
		
		System.out.print("You have rolled: ");
		for (Dice d: dice) {
			System.out.print(d);
			
		}
		
		System.out.print(" This totals " + sumDice(dice));
		System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.print(" This totals ");

	}

}
