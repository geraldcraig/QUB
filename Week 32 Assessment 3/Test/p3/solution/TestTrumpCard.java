package p3.solution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Sample Solution - Matthew Collins
 *
 */
class TestTrumpCard {

	// test data
	String validStringLow, validStringMid, validStringHigh;
	String invalidStringLow, invalidStringHigh;
	String validFilename, validFilenameLow, validFilenameHigh;
	String invalidFilename1, invalidFilename2, invalidFilename3, invalidFilename4, invalidFilename5;
	int validStatLow, validStatMid, validStatHigh;
	int invalidStatLow, invalidStatHigh;
	TopTrumpCard topTrumpCard;

	@BeforeEach
	void setUp() throws Exception {
		validStringLow = "a";
		validStringMid = "valid mid length name";
		validStringHigh = "123456789012345678901234567890";// len30
		invalidStringLow = "";
		invalidStringHigh = "1234567890123456789012345678901";// len31
		validStatLow = 0;
		validStatMid = 51;
		validStatHigh = 100;
		invalidStatLow = -1;
		invalidStatHigh = 101;
		validFilename = "filename.jpg";
		validFilenameLow = "a.jpg";// min len 5
		validFilenameHigh = "12345678901234567890123456.jpg";// max len 30
		invalidFilename1 = "invalidfilename";// no .jpg
		invalidFilename2 = "filename.jpgandmore";// .jpg present but not at end
		invalidFilename3 = "invalid filename.jpg";// spaces in name
		invalidFilename4 = ".jpg";// filename too short len 4 - meets other requirements
		invalidFilename5 = "123456789012345678901234567.jpg";// too long len 31 - meets other requirements
		topTrumpCard = new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, validStatMid,
				validStatMid, validStatMid, validStatMid, validStringMid);
		//if default constructor included in class, could also declare empty object for convenience in testing 
		//(and to ensure values are set to something different than they started at while testing)
	}

	@Test
	void testTopTrumpCard() {
		//Happy Path test that values set by constructor as expected
		TopTrumpCard testConst = new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN,
				validStatMid, validStatMid, validStatMid, validStatMid, validStringMid);
		assertNotNull(testConst);
		assertEquals(validStringMid, testConst.getName());
		assertEquals(validStringMid, testConst.getRealname());
		assertEquals(validFilename, testConst.getFilename());
		assertEquals(Category.VILLAIN, testConst.getCategory());
		assertEquals(validStatMid, testConst.getSpeed());
		assertEquals(validStatMid, testConst.getStrength());
		assertEquals(validStatMid, testConst.getAgility());
		assertEquals(validStatMid, testConst.getIntelligence());
		assertEquals(validStringMid, testConst.getBio());
	}

	@Test
	void testTopTrumpCardInvalid() {
		//Unhappy Path test each arg of constructor in turn to ensure exception thrown as expected
		//verifies that constructor actually linked to setters, not just setting directly

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(invalidStringLow, validStringMid, validFilename, Category.VILLAIN, validStatMid,
					validStatMid, validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, invalidStringLow, validFilename, Category.VILLAIN, validStatMid,
					validStatMid, validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, invalidFilename1, Category.VILLAIN, validStatMid,
					validStatMid, validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, null, validStatMid, validStatMid,
					validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, invalidStatHigh,
					validStatMid, validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, validStatMid,
					invalidStatHigh, validStatMid, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, validStatMid,
					validStatMid, invalidStatHigh, validStatMid, validStringMid);
		});

		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, validStatMid,
					validStatMid, validStatMid, invalidStatHigh, validStringMid);
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new TopTrumpCard(validStringMid, validStringMid, validFilename, Category.VILLAIN, validStatMid,
					validStatMid, validStatMid, validStatMid, null);
		});

	}
	
	@Test
	void testGetSetName() {
		topTrumpCard.setName(validStringLow);;
		assertEquals(validStringLow, topTrumpCard.getName());
		topTrumpCard.setName(validStringMid);;
		assertEquals(validStringMid, topTrumpCard.getName());
		topTrumpCard.setName(validStringHigh);;
		assertEquals(validStringHigh, topTrumpCard.getName());
	}
	
	@Test
	void testNameInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setName(null); 
		});
		assertEquals("Invalid Name Length", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setName(invalidStringLow); 
		});
		assertEquals("Invalid Name Length", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setName(invalidStringHigh); 
		});
		assertEquals("Invalid Name Length", exp.getMessage());
	}
	
	@Test
	void testRealName() {
		//simple getter/setter test
		//skipping other tests on real name for time. Same principle as name
		topTrumpCard.setRealname(validStringMid);
		assertEquals(validStringMid, topTrumpCard.getRealname());
	}
	

	@Test
	void testGetSetFilenameValid() {
		//simple getter test
		topTrumpCard.setFilename(validFilename);
		assertEquals(validFilename, topTrumpCard.getFilename());
		
		//verify min and max length accepted too
		topTrumpCard.setFilename(validFilenameLow);
		assertEquals(validFilenameLow, topTrumpCard.getFilename());
		
		topTrumpCard.setFilename(validFilenameHigh);
		assertEquals(validFilenameHigh, topTrumpCard.getFilename());
	}

	@Test
	void testSetFilenameInValid() {
		//filename has many conditions that should be rejected and can be tested for

		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(invalidFilename1); // no .jpg
		});
		assertEquals("Invalid Filename - must end in .jpg", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(invalidFilename2); // .jpg not at end
		});
		assertEquals("Invalid Filename - must end in .jpg", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(invalidFilename3);// spaces in name
		});
		assertEquals("Invalid Filename - no spaces permitted", exp.getMessage());

		// length checks
		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(null);
		});
		assertEquals("Invalid Filename length", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(invalidFilename4);// too short
		});
		assertEquals("Invalid Filename length", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setFilename(invalidFilename5);// too long
		});
		assertEquals("Invalid Filename length", exp.getMessage());
	}
	
	@Test
	void testGetSetCategory() {
		topTrumpCard.setCategory(Category.HERO);
		assertEquals(Category.HERO, topTrumpCard.getCategory());
		
		topTrumpCard.setCategory(Category.VILLAIN);
		assertEquals(Category.VILLAIN, topTrumpCard.getCategory());
		
		//I chose to enforce non-null on category setter so also testing for it. Perhaps could be separate test case
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setCategory(null);
		});
		assertEquals("Must set a category", exp.getMessage());	
	}
	
	@Test
	void testGetSetBio() {
		topTrumpCard.setBio("");//empty string rejected for name, but ok for Bio
		assertEquals("", topTrumpCard.getBio());
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setCategory(null);
		});
		assertEquals("Must set a category", exp.getMessage());	
	}
	
	@Test
	void testSetBioInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setBio(null);
		});
		assertEquals("Bio cant be null", exp.getMessage());	
	}
	
	@Test
	void testGetSetSpeed() {
		topTrumpCard.setSpeed(validStatLow);
		assertEquals(validStatLow, topTrumpCard.getSpeed());
		topTrumpCard.setSpeed(validStatMid);
		assertEquals(validStatMid, topTrumpCard.getSpeed());
		topTrumpCard.setSpeed(validStatHigh);
		assertEquals(validStatHigh, topTrumpCard.getSpeed());
	}
	
	@Test
	void testSetSpeedInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setSpeed(invalidStatLow); 
		});
		assertEquals("Speed stat value out of range", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.setSpeed(invalidStatHigh);
		});
		assertEquals("Speed stat value out of range", exp.getMessage());
		
	}
	
	//skipping other stat tests for repetition. (getter partially tested in constructor)
	//real world should fully test all
	
	@Test
	void testGetMaxStatID() {
		topTrumpCard.setSpeed(80);
		topTrumpCard.setStrength(60);
		topTrumpCard.setAgility(35);
		topTrumpCard.setIntelligence(2);
		assertEquals(0, topTrumpCard.getMaxStatID());
		
		topTrumpCard.setSpeed(40);
		topTrumpCard.setStrength(60);
		topTrumpCard.setAgility(35);
		topTrumpCard.setIntelligence(2);
		assertEquals(1, topTrumpCard.getMaxStatID());
		
		topTrumpCard.setSpeed(30);
		topTrumpCard.setStrength(60);
		topTrumpCard.setAgility(85);
		topTrumpCard.setIntelligence(2);
		assertEquals(2, topTrumpCard.getMaxStatID());
		
		topTrumpCard.setSpeed(80);
		topTrumpCard.setStrength(60);
		topTrumpCard.setAgility(35);
		topTrumpCard.setIntelligence(92);
		assertEquals(3, topTrumpCard.getMaxStatID());
		
		//case where more than one max - assume first occurrence is returned
		topTrumpCard.setSpeed(60);
		topTrumpCard.setStrength(80);
		topTrumpCard.setAgility(80);
		topTrumpCard.setIntelligence(12);
		assertEquals(1, topTrumpCard.getMaxStatID());
		
		//could probably test more variations for robustness
		//need to think about expected behaviour and is everything covered
	}
	
	@Test
	void testGetStatScore() {
		
		topTrumpCard.setSpeed(60);
		topTrumpCard.setStrength(80);
		topTrumpCard.setAgility(50);
		topTrumpCard.setIntelligence(12);
		assertEquals(60, topTrumpCard.getStatScore(0));
		assertEquals(80, topTrumpCard.getStatScore(1));
		assertEquals(50, topTrumpCard.getStatScore(2));
		assertEquals(12, topTrumpCard.getStatScore(3));
		
	}
	
	@Test
	void testGetStatScoreInvalid() {
		
		topTrumpCard.setSpeed(60);
		topTrumpCard.setStrength(80);
		topTrumpCard.setAgility(50);
		topTrumpCard.setIntelligence(12);
		
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.getStatScore(-1);
		});
		assertEquals("Must be index 0-3", exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			topTrumpCard.getStatScore(4);
		});
		assertEquals("Must be index 0-3", exp.getMessage());
		
	}
	
	//could also test other methods eg average method if written for expected values
	//average calculated a double, so could test for expected precision too, not just averages that compute cleanly

}
