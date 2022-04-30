package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Userinputtest1 {

	// test data
	String validName;
	String validResponse1, validResponse2;
	int validPrice;
	int validIndex;
	UserInput userInput;

	@BeforeEach
	void setUp() throws Exception {

		validName = "Lee";
		validResponse1 = "Yes";
		validResponse2 = "No";
		validPrice = 100;
		validIndex = 10;
	}

	@Test
	void testGetPlayerName() {
		Player testPlayer = new Player(validName, Marker.ELECTRIC_CAR);
		assertEquals(validName, testPlayer.getPlayerName());
	}

	@Test
	void testContinuePlaying() {
		
	}

	@Test
	void testGetAreaPurchaseAnswer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPurchaseAdditionalAreaAnswer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPurchaseAdditionalAreaIndexAnswer() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOfferPrice() {
		
	}

	@Test
	void testGetOfferAcceptResponse() {
		fail("Not yet implemented");
	}

}
