package uk.ac.qub.card.sharp.solution;

import java.util.Comparator;

/**
 * @author Matthew Collins
 *
 */
public class CompareCardBySuit implements Comparator<PlayingCard> {

	@Override
	public int compare(PlayingCard o1, PlayingCard o2) {

		Suit suit1 = o1.getSuit();
		Suit suit2 = o2.getSuit();

		if (suit1 == suit2) {
			//suits the same no swaps
			return 0;
		} else if (suit1 == Suit.CLUBS && suit2 != Suit.CLUBS) {
			//clubs smaller than all other suits
			return -1;
		} else if (suit1 == Suit.HEARTS && (suit2 == Suit.SPADES || suit2 == Suit.DIAMONDS)) {
			//hearts smaller than spades and diamonds
			return -1;
		} else if (suit1 == Suit.SPADES && suit2 == Suit.DIAMONDS) {
			//spades smaller than diamonds
			return -1;
		} else if(suit1 == Suit.DIAMONDS && suit2 != Suit.DIAMONDS) {
			//diamonds bigger than all other suits
			return 1;
		} else if(suit1 == Suit.SPADES && suit2 != Suit.DIAMONDS) {
			//spades bigger than all except diamonds
			return 1;
		} else if(suit1==Suit.HEARTS && (suit2!=Suit.SPADES || suit2 != Suit.DIAMONDS)) {
			//hearts bigger than all except spades and diamonds
			return 1;
		} else {
			//print error message, no swap recommended
			System.err.println("Unexpected Suit Combo: "+suit1+" and "+suit2);
			return 0;
		}
	}

}
