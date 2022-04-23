package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
	
	Board board = new Board();
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		
		board.addLocation(new Go());
		board.addLocation(new Areas(1, "Falls", 20));
		board.addLocation(new Areas(2, "Shankill", 40));
		board.addLocation(new Areas(3, "Castle View", 60));
		board.addLocation(new Areas(4, "Cave Hill", 80));
		board.addLocation(new Areas(5, "Water Works", 100));
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(new Areas(7, "Titanic", 100));
		board.addLocation(new Areas(8, "Victoria-Station", 100));
		board.addLocation(new Areas(9, "Airport Road", 100));
		board.addLocation(new Areas(10, "University Square", 100));
		board.addLocation(new Areas(11, "Botanic", 100));
	}

	@Test
	void testBoard() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testAddLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLocationByName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNewPlayerBoardPosition() {
		fail("Not yet implemented");
	}
	
	@Test
	void getBoardLocation() {
		
		BoardLocation location = board.getBoardLocation(1);
		assertEquals("Falls", location.getAreaName());

	}

}
