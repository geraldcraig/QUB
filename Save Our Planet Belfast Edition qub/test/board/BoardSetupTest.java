package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardSetupTest {
	
	// test data
	int validIndex1, validIndex2;
	int invalidIndex1, invalidIndex2;
	String validArea1, validArea2;
	String invalidArea1, invalidArea2;
	String validGo;
	int validPurchasePrice1, validPurchasePrice2;
	int invalidPurchasePrice1, invalidPurchasePrice2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		validIndex1 = 1;
		validIndex2 =2;
		validArea1 = "Falls";
		validArea2 = "Shankill";
		validPurchasePrice1 = 20;
		validPurchasePrice2 = 40;
		validGo = "GO";
		
	}

	@Test
	void testGetNewBoardOne() {
		
		Areas testAreas = new Areas(validIndex1, validArea1, validPurchasePrice1);
		assertEquals(validIndex1, testAreas.getIndex());
		assertEquals(validArea1, testAreas.getAreaName());
		assertEquals(validPurchasePrice1, testAreas.purchasePrice);
		
	}
	
	@Test
	void testGetNewBoardTwo() {
		
		Areas testAreas = new Areas(validIndex2, validArea2, validPurchasePrice2);
		assertEquals(validIndex2, testAreas.getIndex());
		assertEquals(validArea2, testAreas.getAreaName());
		assertEquals(validPurchasePrice2, testAreas.purchasePrice);
		
	}
	
	@Test
	void testGetNewBoardGo() {
		
		Go testAreas = new Go();
		assertEquals(validGo, testAreas.getAreaName());
	
	}
	
}
