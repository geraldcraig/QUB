package board;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import saveOurPlanetBelfastEdition.Marker;
import saveOurPlanetBelfastEdition.Player;

class BoardTest {
	
	String validFIELD_ONE_NAME;
	String validFIELD_TWO_NAME;
	String validFIELD_THREE_NAME;
	String validFIELD_FOUR_NAME;
	
	BoardLocation go = new Go();
	Areas falls = new Areas(1, "Falls", "West Belfast", 20, 20, .05, 40, .02, 80, .08);
	Areas shankill = new Areas(2, "Shankill", "West Belfast", 40, 20, .05, 40, .02, 80, .08);
	Areas castleView = new Areas(3, "Castle View", "North Belfast", 60, 30, .10, 60, .03, 120, .12);
	Areas caveHill= new Areas(4, "Cave Hill", "North Belfast", 80, 30, .10, 60, .03, 120, .12);
	Areas waterWorks = new Areas(5, "Water Works", "North Belfast", 100, 30, .10, 60, .03, 120, .12);
	Areas titanic = new Areas(7, "Titanic", "East Belfast", 120, 40, .15, 80, .04, 160, .16);
	Areas victoriaStation = new Areas(8, "Victoria-Station", "East Belfast", 140, 40,.15, 80, .04, 160, .16);
	Areas airportRoad = new Areas(9, "Airport Road", "East Belfast", 160, 40, .15, 80, .04, 160, .16);
	Areas universitySquare = new Areas(10, "University Square", "South Belfast", 180, 50, .20, 100, .05, 200, .20);
	Areas botanic = new Areas(11, "Botanic", "South Belfast", 200, 50, .20, 100, .05, 200, .20);
	
	Player player = new Player("Lee", Marker.ELECTRIC_CAR);
	
	Board board = new Board();
	
	@BeforeEach
	void setUp() throws Exception {
		
		validFIELD_ONE_NAME = "West Belfast";
		validFIELD_TWO_NAME = "North Belfast";
		validFIELD_THREE_NAME = "East Belfast";
		validFIELD_FOUR_NAME = "South Belfast";
		
		board.addLocation(go);
		board.addLocation(falls);
		board.addLocation(shankill);
		board.addLocation(castleView);
		board.addLocation(caveHill);
		board.addLocation(waterWorks);
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(titanic);
		board.addLocation(victoriaStation);
		board.addLocation(airportRoad);
		board.addLocation(universitySquare);
		board.addLocation(botanic);
		
		player.setBoardPosition(8);
	}

	//@Test
	void testBoard() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSetFIELD_ONE_NAME() {
		board.setFIELD_ONE_NAME(validFIELD_ONE_NAME);
		assertEquals(validFIELD_ONE_NAME, board.getFIELD_ONE_NAME());
	}

	@Test
	void testGetSetFIELD_TWO_NAME() {
		board.setFIELD_TWO_NAME(validFIELD_TWO_NAME);
		assertEquals(validFIELD_TWO_NAME, board.getFIELD_TWO_NAME());
	}

	@Test
	void testGetSetFIELD_THREE_NAME() {
		board.setFIELD_THREE_NAME(validFIELD_THREE_NAME);
		assertEquals(validFIELD_THREE_NAME, board.getFIELD_THREE_NAME());
	}

	@Test
	void testGetSetFIELD_FOUR_NAME() {
		board.setFIELD_FOUR_NAME(validFIELD_FOUR_NAME);
		assertEquals(validFIELD_FOUR_NAME, board.getFIELD_FOUR_NAME());
	}

	@Test
	void testGetAreasInField() {
		
		ArrayList<Areas>expectedFieldsWB = board.getAreasInField(validFIELD_ONE_NAME);
		ArrayList<Areas>expectedFieldsNB = board.getAreasInField(validFIELD_TWO_NAME);
		ArrayList<Areas>expectedFieldsEB = board.getAreasInField(validFIELD_THREE_NAME);
		ArrayList<Areas>expectedFieldsSB = board.getAreasInField(validFIELD_FOUR_NAME);
		
		assertEquals(2, expectedFieldsWB.size());
		assertEquals(3, expectedFieldsNB.size());
		assertEquals(3, expectedFieldsEB.size());
		assertEquals(2, expectedFieldsSB.size());
		
	}

	@Test
	void testGetLocation() {
		
		assertEquals(titanic.getAreaName(), board.getLocation(7));
	}

	@Test
	void testGetLocationByName() {
		
		BoardLocation boardLocation = board.getLocationByName("GO");
		Areas area = (Areas) board.getLocationByName("Cave Hill");
		
		assertEquals( go, boardLocation);
		assertEquals( caveHill, area);
		
	}


	@Test
	void testGetNewPlayerBoardPosition() {
		
		assertEquals(5, board.getNewPlayerBoardPosition(0, 5));
		assertEquals(0, board.getNewPlayerBoardPosition(6, 6));
		assertEquals(3, board.getNewPlayerBoardPosition(player.getBoardPosition(), 7));
	}
	
	@Test
	void testGetBoardLocation() {
		
		BoardLocation location = board.getBoardLocation(1);
		assertEquals("Falls", location.getAreaName());

	}

}
