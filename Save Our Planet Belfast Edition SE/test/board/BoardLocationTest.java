package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import saveOurPlanetBelfastEdition.Marker;
import saveOurPlanetBelfastEdition.Player;

class BoardLocationTest {

	Areas boardlocation = new Areas(5, "Water Works", "North Belfast", 100, 30, .10, 60, .03, 120, .12);

	Player testPlayer = new Player("Lee", Marker.SOLAR_PANEL);

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBoardLocation() {

		assertEquals(5, boardlocation.getIndex());
		assertEquals("Water Works", boardlocation.getAreaName());
	}

	@Test
	void testGetIndex() {

		assertEquals(5, boardlocation.getIndex());
	}

	@Test
	void testGetAreaName() {

		assertEquals("Water Works", boardlocation.getAreaName());
	}

	@Test
	void testPlayerLandsOnLocation() {

		assertEquals("Lee", testPlayer.getPlayerName());
		assertEquals(Marker.SOLAR_PANEL, testPlayer.getMarker());
	}

}
