package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardSetupTest {
	
	Areas expectedArea = new Areas(5, "Water Works", "North Belfast", 30, 100, .10, 60, .03, 120, .12);
	
	Board board;
	
	@BeforeEach
	void setUp() throws Exception {
	
	board = BoardSetup.getNewBoard();
	
	}

	@Test
	void testGetNewBoard() {
		
		assertEquals(expectedArea.getAreaName(), board.getBoardLocation(5).getAreaName());
		
	}

}