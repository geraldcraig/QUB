package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Userinputtest1 {

	// test data
	String validName;
	String validResponse1, validResponse2;

	@BeforeEach
	void setUp() throws Exception {

		validName = "Lee";
		validResponse1 = "yes";
		validResponse2 = "no";
	}

	@Test
	void testGetPlayerName() {
		Player testPlayer = new Player(validName, Marker.ELECTRIC_CAR);
		assertEquals(validName, testPlayer.getPlayerName());
	}

	@Test
	void testUserInput() {
		fail("Not yet implemented");
		
	}

	@Test
	void testContinuePlaying() {
		fail("Not yet implemented");
		UserInput testInput = new UserInput();
	
	}

	@Test
	void testGetAreaPurchaseAnswer() {
		fail("Not yet implemented");
	}

}
