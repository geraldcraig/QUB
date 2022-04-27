package board;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreasTest {
	
	// test data
	int validIndex;
	int validPurchasePrice;
	int validMinorDevPurchaseCost;
	double validMinorDevPercentage;
	int validMajorDevPurchaseCost;
	double validMajorDevPercentage;
	String validAreaName, validAreaField;
	double validPercentageLicenseFee;
	Areas areaConstrcutorTest;
	Areas testArea;
	Areas testArea2 = new Areas(5, "Water Works", "North Belfast", 100, .10, 60, .03, 120, .12);;
	Areas testArea3 = new Areas(7, "Titanic", "East Belfast", 120, .15, 80, .04, 160, .16);
			
	@BeforeEach
	void setUp() throws Exception {
		
		validIndex = 1;
		validPurchasePrice = 20;
		validMinorDevPurchaseCost = 40;
		validMinorDevPercentage = .02; 
		

		validMajorDevPurchaseCost = 80;
		validMajorDevPercentage = .08;

		validAreaName = "Falls";
		validAreaField = "West Belfast";
		validPercentageLicenseFee = .05;
		
		testArea = new Areas(validIndex, validAreaName, validAreaField, validPurchasePrice, validPercentageLicenseFee, validMinorDevPurchaseCost, validMinorDevPercentage, validMajorDevPurchaseCost, validMajorDevPercentage);
		
		testArea2.setAreaOwned();
		testArea2.incrementMinorDevelopment();
		
		testArea3.incrementMajorDevelopment();
		
	}


	@Test
	void testAreas() {
		
		areaConstrcutorTest = new Areas(validIndex, validAreaName, validAreaField, validPurchasePrice, validPercentageLicenseFee, validMinorDevPurchaseCost, validMinorDevPercentage, validMajorDevPurchaseCost, validMajorDevPercentage);
		
		assertEquals(validIndex, areaConstrcutorTest.getIndex());
		assertEquals(validAreaName, areaConstrcutorTest.getAreaName());
		assertEquals(validAreaField, areaConstrcutorTest.getAreaField());
		assertEquals(validPurchasePrice, areaConstrcutorTest.purchasePrice);
		assertEquals(validMinorDevPurchaseCost, areaConstrcutorTest.minorDevPurchaseCost);
		assertEquals(validMajorDevPurchaseCost, areaConstrcutorTest.majorDevPurchaseCost);

	}
	
	@Test
	void testIsAreaOwnedDefault() {
		
		assertFalse(testArea.isAreaOwned());;
		
	}

	@Test
	void testSetAreaOwned() {

		assertTrue(testArea2.isAreaOwned());
	}
	
	@Test
	void testRemoveAreaOwnership() {

		testArea2.removeAreaOwnershipt();
		assertFalse(testArea2.isAreaOwned());;
		
	}
	
	@Test
	void testgetPurchasePrice() {

		assertEquals(validPurchasePrice, testArea.getPurchasePrice());
	}
	
	@Test
	void testGetCostOfEstablishingMinorDev() {

		assertEquals(validMinorDevPurchaseCost, testArea.getCostOfEstablishingMinorDev());
	}
	
	@Test
	void testGetCountOfMinorDev() {

		assertEquals(0, testArea.getCountOfMinorDev());
		
	}
	
	@Test
	void testIncrementMinorDevelopment() {

		
		assertEquals(1, testArea2.getCountOfMinorDev());
	}
	
	@Test
	void testRemoveMinorDevelopment() {

		testArea2.removeMinorDevelopment();
		assertEquals(0, testArea2.getCountOfMinorDev());
	}
	
	@Test
	void testGetCostOfEstablishingMajorDev() {

		assertEquals(validMajorDevPurchaseCost, testArea.getCostOfEstablishingMajorDev());
	}
	
	@Test 
	void testGetCountOfMajorDev() {

		assertEquals(0, testArea.getCountOfMajorDev());
	}
	
	@Test
	void testIncrementMajorDevelopment() {

		testArea.incrementMajorDevelopment();
		assertEquals(1, testArea.getCountOfMajorDev());
		assertEquals(0, testArea.getCountOfMinorDev());
	}
	
	@Test
	void testRemoveMajorDevelopment() {
		
		testArea3.removeMajorDevelopment();
		assertEquals(0, testArea.getCountOfMajorDev());
	
		
	}
	
	@Test
	void testGetAreaField() {
		
		assertEquals(validAreaField, testArea.getAreaField());

		
	}
	
	@Test
	void testGetPercentageLicenseFee() {
		
		assertEquals(validPercentageLicenseFee, testArea.getPercentageLicenseFee());
	}
	
	@Test
	void testAreaLicenseFee() {

		double validLicenseFee = validPurchasePrice * validPercentageLicenseFee;
		assertEquals(validLicenseFee, testArea.areaLicenseFee());
		
	}
	
	@Test
	void testCalculateDevelopmentReturn1MinorDevelopment() {

		testArea.incrementMinorDevelopment();
		double validFee = validMinorDevPurchaseCost * validMinorDevPercentage;
		assertEquals(validFee, testArea.areaMinorDevelopmentsLicenseFee());
		
	}
	
	@Test
	void testCalculateDevelopmentReturn2MinorDevelopments() {

		testArea.incrementMinorDevelopment();
		testArea.incrementMinorDevelopment();
		double validFee = validMinorDevPurchaseCost * (validMinorDevPercentage * 2);
		assertEquals(validFee, testArea.areaMinorDevelopmentsLicenseFee());
		
	}
	
	@Test
	void testCalculateDevelopmentReturn3MinorDevelopments() {

		testArea.incrementMinorDevelopment();
		testArea.incrementMinorDevelopment();
		testArea.incrementMinorDevelopment();
		double validFee = validMinorDevPurchaseCost * (validMinorDevPercentage * 3);
		assertEquals(validFee, testArea.areaMinorDevelopmentsLicenseFee());
	}
	
	@Test
	void testCalculateDevelopmentReturn1MajorDevelopment() {

		testArea.incrementMajorDevelopment();
		double validFee = validMajorDevPurchaseCost * validMajorDevPercentage;
		assertEquals(validFee, testArea.areaMajorDevelopmentsLicenseFee());
		assertEquals(0, testArea.areaMinorDevelopmentsLicenseFee());
	}
}
