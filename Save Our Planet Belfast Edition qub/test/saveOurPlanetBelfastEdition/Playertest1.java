package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Playertest1 {

	// Test Data
	String validName;
	int validBoardPosition;
	Player player;
	double fundsToAdd;
	double fundsToRemove;
	int areaIndex;

	@BeforeEach
	void setUp() throws Exception {

		validName = "Lee";
		validBoardPosition = 10;
		player = new Player("Walter", Marker.SOLAR_PANEL);
		fundsToAdd = 50.50;
		fundsToRemove = 350;
		areaIndex = 3;
		player.addToOwnedAreas(areaIndex);

	}

	// Test case tests the instantiation of a player object
	@Test
	void testPlayerConstructor() {
		Player testPlayer = new Player(validName, Marker.WINDMILL);
		assertEquals(validName, testPlayer.getPlayerName());
		assertEquals(Marker.WINDMILL, testPlayer.getMarker());
	}

	@Test
	void testGetSetPlayerBoardPosition() {
		Player testPlayer = new Player(validName, Marker.WINDMILL);
		testPlayer.setBoardPosition(validBoardPosition);
		assertEquals(validBoardPosition, testPlayer.getBoardPosition());
	}

	@Test
	void testUpdatePlayerFundsAdd() {
	
		double addition = 300 + fundsToAdd;
		player.updatePlayerFundsAdd(fundsToAdd);
		assertEquals(addition, player.getPlayerFunds());
	}

	@Test
	void testUpdatePlayerFundsSubtract() {

		double total = 300 - fundsToRemove;
		player.updatePlayerFundsSubtract(fundsToRemove);
		assertEquals(total, player.getPlayerFunds());
	}
	
	@Test
	void testGetOwnedAreas() {
		
		assertTrue(player.getOwnedAreas().contains(areaIndex));
	}

	@Test
	void testAddToOwnedAreas() {

		int index = 4;
		player.addToOwnedAreas(index);
		assertTrue(player.getOwnedAreas().contains(index));
	}

	@Test
	void testRemoveFromOwnedAreas() {

		player.removeFromOwnedAreas(areaIndex);
		assertFalse(player.getOwnedAreas().contains(areaIndex));
	}

	@Test
	void testGetPlayerName() {
		
		String testPlayer = "Walter";
		assertTrue(player.getPlayerName().contains(testPlayer));
	}

	@Test
	void testGetMarker() {
		
		assertEquals(Marker.SOLAR_PANEL, player.getMarker());
		
	}


}
