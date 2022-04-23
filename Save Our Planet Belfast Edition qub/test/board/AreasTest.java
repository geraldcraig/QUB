package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreasTest {
	
	// test data
	int validPurchasePrice;
	int validIndex;
	String validAreaName;
	Areas ownershipArea = new Areas(1, "LeesArea", 200);

	@BeforeEach
	void setUp() throws Exception {
		
		validPurchasePrice = 100;
		validIndex = 11;
		validAreaName = "Botanic";
		
	}


	@Test
	void testAreas() {
		Areas testAreas = new Areas(validIndex, validAreaName, validPurchasePrice);
		assertEquals(validIndex, testAreas.getIndex());
		assertEquals(validAreaName, testAreas.getAreaName());
		assertEquals(validPurchasePrice, testAreas.purchasePrice);
	}
	
	@Test
	void testIsAreaOwnedDefault() {
		assertFalse(ownershipArea.isAreaOwned());;
		
	}

	@Test
	void testSetAreaOwned() {

		ownershipArea.setAreaOwned();
		assertTrue(ownershipArea.isAreaOwned());
	}
	
	@Test
	void testgetPurchasePrice() {

		assertEquals(200, ownershipArea.getPurchasePrice());
	}

}
