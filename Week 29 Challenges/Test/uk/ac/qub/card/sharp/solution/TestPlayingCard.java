package uk.ac.qub.card.sharp.solution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Matthew Collins
 *
 */
class TestPlayingCard {

	// test data
	int valueValidLow, valueValidMid, valueValidHigh;
	int valueInvalidLow, valueInvalidHigh;
	Suit suit1, suit2, suit3, suit4;
	String validCardName1, validCardName2, validCardName3, validCardName4;
	PlayingCard playingCard;

	@BeforeEach
	void setUp() throws Exception {
		valueValidLow = 2;
		valueValidMid = 7;
		valueValidHigh = 14;

		valueInvalidHigh = 15;
		valueInvalidLow = 1;

		suit1 = Suit.CLUBS;
		suit2 = Suit.HEARTS;
		suit3 = Suit.SPADES;
		suit4 = Suit.DIAMONDS;

		validCardName1 = "Two of Clubs";
		validCardName2 = "Seven of Hearts";
		validCardName3 = "Ace of Spades";
		validCardName4 = "Two of Diamonds";

		playingCard = new PlayingCard(valueValidLow, suit1);
	}

	@Test
	void testPlayingCardConstructorValid() {
		PlayingCard toCreate = new PlayingCard(valueValidLow, suit1);
		
		assertEquals(valueValidLow, toCreate.getValue());
		assertEquals(suit1, toCreate.getSuit());
	}

	@Test
	void testPlayingCardConstructorInvalid() {
		String expectedMessage = "Card Face Value must be between 2 and 14 inclusive";

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			new PlayingCard(valueInvalidHigh, suit1);
		});

		assertEquals(expectedMessage, exp.getMessage());
	}

	@Test
	void testGetSetSuit() {
		// test setting and retrieving all 4 suit values (probably overkill)
		// enum, so no need to test unhappy path (not possible)
		playingCard.setSuit(suit1);
		assertEquals(suit1, playingCard.getSuit());

		playingCard.setSuit(suit2);
		assertEquals(suit2, playingCard.getSuit());

		playingCard.setSuit(suit3);
		assertEquals(suit3, playingCard.getSuit());

		playingCard.setSuit(suit4);
		assertEquals(suit4, playingCard.getSuit());
	}

	@Test
	void testGetSetValidValue() {
		playingCard.setValue(valueValidLow);
		assertEquals(valueValidLow, playingCard.getValue());

		playingCard.setValue(valueValidMid);
		assertEquals(valueValidMid, playingCard.getValue());

		playingCard.setValue(valueValidHigh);
		assertEquals(valueValidHigh, playingCard.getValue());
	}

	@Test
	void testGetSetInvalidValue() {
		String expectedMessage = "Card Face Value must be between 2 and 14 inclusive";

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			playingCard.setValue(valueInvalidLow);
		});

		assertEquals(expectedMessage, exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			playingCard.setValue(valueInvalidHigh);
		});
	}

	@Test
	void testToString() {
		PlayingCard pCard1 = new PlayingCard(valueValidLow, suit1);
		assertEquals(validCardName1, pCard1.toString());

		PlayingCard pCard2 = new PlayingCard(valueValidMid, suit2);
		assertEquals(validCardName2, pCard2.toString());

		PlayingCard pCard3 = new PlayingCard(valueValidHigh, suit3);
		assertEquals(validCardName3, pCard3.toString());

		PlayingCard pCard4 = new PlayingCard(valueValidLow, suit4);
		assertEquals(validCardName4, pCard4.toString());
	}
	
	@Test
	void testToStringValueSwitch() {
		String[] nums = new String[] {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		for(int i=0;i<nums.length;i++) {
			int val=i+2;
			PlayingCard pCard = new PlayingCard(val, suit1);
			String expectedName = nums[i]+" of Clubs";
			assertEquals(expectedName, pCard.toString());
		}
	}

}
