package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Boardtest1 {

	String validFIELD_ONE_NAME;
	String validFIELD_TWO_NAME;
	String validFIELD_THREE_NAME;
	String validFIELD_FOUR_NAME;

	Board board = new Board();

	@BeforeEach
	void setUp() throws Exception {

		validFIELD_ONE_NAME = "West Belfast";
		validFIELD_TWO_NAME = "North Belfast";
		validFIELD_THREE_NAME = "East Belfast";
		validFIELD_FOUR_NAME = "South Belfast";

		board.addLocation(new Go());
		board.addLocation(new Areas(1, "Falls", "West Belfast", 20, 40, 2, 4, 6, 80, 8, 16, 24));
		board.addLocation(new Areas(2, "Shankill", "West Belfast", 40, 40, 2, 4, 6, 80, 8, 16, 24));
		board.addLocation(new Areas(3, "Castle View", "North Belfast", 60, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new Areas(4, "Cave Hill", "North Belfast", 80, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new Areas(5, "Water Works", "North Belfast", 100, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(new Areas(7, "Titanic", "East Belfast", 120, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(8, "Victoria-Station", "East Belfast", 140, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(9, "Airport Road", "East Belfast", 160, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(10, "University Square", "South Belfast", 180, 100, 5, 10, 15, 200, 20, 40, 60));
		board.addLocation(new Areas(11, "Botanic", "South Belfast", 200, 100, 5, 10, 15, 200, 20, 40, 60));
	}

	// @Test
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

	// @Test
	void testGetAreasInField() {
		fail("Not yet implemented");
	}

	// @Test
	void testGetLocation() {
		fail("Not yet implemented");
	}

	// @Test
	void testAddLocation() {
		fail("Not yet implemented");
	}

	// @Test
	void testGetLocationByName() {
		fail("Not yet implemented");
	}

	// @Test
	void testGetLocationByField() {
		fail("Not yet implemented");
	}

	// @Test
	void testGetNewPlayerBoardPosition() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBoardLocation() {

		BoardLocation location = board.getBoardLocation(1);
		assertEquals("Falls", location.getAreaName());

	}

}
