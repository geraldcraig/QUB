package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreasTest1 {

	// test data
	int validIndex;
	int validPurchasePrice;
	int validMinorDevPurchaseCost;
	int validMinorDev1Percentage, validMinorDev2Percentage, validMinorDev3Percentage;
	int validMajorDevPurchaseCost;
	int validMajorDev1Percentage, validMajorDev2Percentage, validMajorDev3Percentage;
	String validAreaName, validAreaField;
	// Areas ownershipArea = new Areas(1, "LeesArea", 200);

	@BeforeEach
	void setUp() throws Exception {

		validIndex = 1;
		validPurchasePrice = 20;
		validMinorDevPurchaseCost = 40;
		validMinorDev1Percentage = 2;
		validMinorDev2Percentage = 4;
		validMinorDev3Percentage = 6;
		validMajorDevPurchaseCost = 80;
		validMajorDev1Percentage = 8;
		validMajorDev2Percentage = 16;
		validMajorDev3Percentage = 24;
		validAreaName = "Falls";
		validAreaField = "West Belfast";

	}

	@Test
	void testAreas() {
		Areas testAreas = new Areas(validIndex, validAreaName, validAreaField, validPurchasePrice,
				validMinorDevPurchaseCost, validMinorDev1Percentage, validMinorDev2Percentage, validMinorDev3Percentage,
				validMajorDevPurchaseCost, validMajorDev1Percentage, validMajorDev2Percentage,
				validMajorDev3Percentage);
		assertEquals(validIndex, testAreas.getIndex());
		assertEquals(validAreaName, testAreas.getAreaName());
		assertEquals(validAreaField, testAreas.getAreaField());
		assertEquals(validPurchasePrice, testAreas.purchasePrice);
		assertEquals(validMinorDevPurchaseCost, testAreas.minorDevPurchaseCost);
		assertEquals(validMinorDev1Percentage, testAreas.getMinorDev1Percentage());
		assertEquals(validMinorDev2Percentage, testAreas.getMinorDev2Percentage());
		assertEquals(validMinorDev3Percentage, testAreas.getMinorDev3Percentage());
		assertEquals(validMajorDevPurchaseCost, testAreas.majorDevPurchaseCost);
		assertEquals(validMajorDev1Percentage, testAreas.getMajorDev1Percentage());
		assertEquals(validMajorDev2Percentage, testAreas.getMajorDev2Percentage());
		assertEquals(validMajorDev3Percentage, testAreas.getMajorDev3Percentage());
	}

	@Test
	void testPlayerLandsOnLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testIsAreaOwned() {
		fail("Not yet implemented");
	}

	// @Test
	void testIsAreaOwnedDefault() {
		// assertFalse(ownershipArea.isAreaOwned());;

	}

	// @Test
	void testSetAreaOwned() {

		// ownershipArea.setAreaOwned();
		// assertTrue(ownershipArea.isAreaOwned());
	}

	@Test
	void testRemoveAreaOwnershipt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPurchasePrice() {
		// assertEquals(200, ownershipArea.getPurchasePrice());
	}

	@Test
	void testGetMinorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMinorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMinorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMinorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMinorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMinorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMinorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMinorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMinorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMinorDev1Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMinorDev2Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMinorDev3Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMajorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMajorDev1() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMajorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMajorDev2() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMajorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveMajorDev3() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev1Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev2Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMajorDev3Percentage() {
		fail("Not yet implemented");
	}

	@Test
	void testCalculateDevelopmentReturn() {
		fail("Not yet implemented");
	}

	@Test
	void testBoardLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAreaField() {
		fail("Not yet implemented");
	}

	@Test
	void testGetIndex() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAreaName() {
		fail("Not yet implemented");
	}

}
