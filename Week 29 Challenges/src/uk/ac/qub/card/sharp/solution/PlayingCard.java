package uk.ac.qub.card.sharp.solution;

/**
 * @author Matthew Collins
 *
 */
public class PlayingCard {
	
	//static variables for range limiting facevalue
	private static final int LOW_VALUE=2;
	private static final int HIGH_VALUE=14;
	
	private Suit suit;
	private int value;
	
	/**
	 * Constructor for PlayingCard
	 * @param suit
	 * @param value
	 * @throws IllegalArgumentException if value out of range (2-14)
	 */
	public PlayingCard(int value,Suit suit) {
		this.setValue(value);
		this.setSuit(suit);
	}
	
	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}
	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 * @throws IllegalArgumentException if value out of range (2-13 inclusive)
	 */
	public void setValue(int value) throws IllegalArgumentException{
		if(value>=LOW_VALUE && value <=HIGH_VALUE) {
			this.value = value;
		}
		else {
			throw new IllegalArgumentException("Card Face Value must be between 2 and 14 inclusive");
		}	
	}
	
	/**
	 * Helper function to get print friendly version of face value
	 * @param value
	 * @return
	 */
	private String valueWord(int value) {
		String word="ERROR";
		switch(value) {
		case 2:word="Two";break;
		case 3:word="Three";break;
		case 4:word="Four";break;
		case 5:word="Five";break;
		case 6:word="Six";break;
		case 7:word="Seven";break;
		case 8:word="Eight";break;
		case 9:word="Nine";break;
		case 10:word="Ten";break;
		case 11:word="Jack";break;
		case 12:word="Queen";break;
		case 13:word="King";break;
		case 14:word="Ace";break;
		}
		return word;
	}
	
	/**
	 * Helper function to get print friendly version of enum suit value
	 * @param suit
	 * @return
	 */
	private String suitWord(Suit suit) {
		String word="ERROR";
		switch (suit) {
		case CLUBS:word="Clubs";break;
		case HEARTS:word="Hearts";break;
		case SPADES:word="Spades";break;
		case DIAMONDS:word="Diamonds";break;
		}
		return word;
	}

	/**
	 * Simple toString method to print friendly name eg "Two of Clubs"
	 * @return String representation of Card
	 */
	@Override
	public String toString() {
		return String.format("%s of %s", valueWord(this.value), suitWord(this.suit));
	}

}
