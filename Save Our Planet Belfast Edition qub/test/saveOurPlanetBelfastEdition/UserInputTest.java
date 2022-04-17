package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserInputTest {
	
	// test data
	String validName;;
	

	@BeforeEach
	void setUp() throws Exception {
		
		validName = "Lee";
	}
	

	@Test
	void testGetPlayerName() {
		Player testPlayer = new Player(validName, Marker.ELECTRIC_CAR);
		assertEquals(validName, testPlayer.getPlayerName());
	}

}
