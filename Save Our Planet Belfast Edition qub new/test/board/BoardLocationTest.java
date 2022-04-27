package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardLocationTest {
	
	Areas boardlocation = new Areas(5, "Water Works", "North Belfast", 100, .10, 60, .03, 120, .12);

	@BeforeEach
	void setUp() throws Exception {
	}



	@Test
	void testGetIndex() {
		
		assertEquals(5, boardlocation.getIndex());
	}

	@Test
	void testGetAreaName() {
		
		assertEquals("Water Works", boardlocation.getAreaName());
	}


}
