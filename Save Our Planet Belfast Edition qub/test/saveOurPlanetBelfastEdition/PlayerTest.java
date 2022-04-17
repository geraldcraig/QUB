package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	
	//Test Data
		String validName;
		int validBoardPosition;
		

		@BeforeEach
		void setUp() throws Exception {
			
			validName = "Lee";
			validBoardPosition = 10;	
			
		}

		//Test case tests the instantiation of a player object
		@Test
		void testPlayerConstructor() {
			Player testPlayer = new Player(validName, Marker.WINDMILL);
			assertEquals(validName, testPlayer.getPlayerName());
			assertEquals(Marker.WINDMILL, testPlayer.getMarker());
		}
		
		@Test
		void testPlayerBoardPosition() {
			Player testPlayer = new Player(validName, Marker.WINDMILL);
			testPlayer.setBoardPosition(validBoardPosition);
			assertEquals(validBoardPosition, testPlayer.getBoardPosition());
		}
			
	}
