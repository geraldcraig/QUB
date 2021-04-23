package uk.ac.qub.revision.p3.solution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPlayer {
	
	//test data
	Country country1, country2;
	String validStringLow,validStringMid,validStringHigh;
	String invalidStringLow,invalidStringHigh;
	
	
	String surnameValidLow, surnameValidMid,surnameValidHigh;
	String surnameInvalidLow,surnameInvalidHigh;
	
	int postiveInt, negativeInt;
	
	Position position1,position2;
	
	//ultimately didnt really use (or set) many of these and 
	//perhaps shouldnt have declared them in the first place
	int totalMatchesValid,totalMatchesInvalid;
	int pointsValid;
	int wonValid;
	int lostValid;
	int drewValid, validDrew;
	double heightValid;
	String clubValid;
	
	
	Player player;

	@BeforeEach
	void setUp() throws Exception {
		country1 = Country.IRE;
		country2 = Country.ENG;
		position1 = Position.FORWARD;
		position2 = Position.BACK;
		
		//stings of appropriate lengths
		validStringHigh = "12345678912345678920";
		validStringMid = "123456789";
		validStringLow = "a";
		invalidStringHigh ="123456789123456789201";
		invalidStringLow ="";
		
		postiveInt = 5;
		negativeInt = -5;
		
		wonValid = 5;
		totalMatchesValid = 10;
		totalMatchesInvalid = -4;
		
		//player = new Player();
		player = new Player(country1, validStringMid, validStringMid, position1, totalMatchesValid, pointsValid, wonValid, lostValid, drewValid, heightValid, clubValid, postiveInt);
		
	}

	@Test
	void testPlayerConstructValid() {
		Player testPlayer = new Player(country1, validStringMid, validStringLow, position1, postiveInt, postiveInt, postiveInt,
							postiveInt, postiveInt, postiveInt, validStringMid, postiveInt);
		
		
		assertTrue(testPlayer instanceof Player);
		assertNotNull(testPlayer);
		
		//verify that each field was correctly set by constructor...
		assertEquals(country1, testPlayer.getCountry());
		assertEquals(validStringMid, testPlayer.getFirstName());
		assertEquals(validStringLow, testPlayer.getSurname());
		assertEquals(position1, testPlayer.getPosition());
		//etc etc
		
		double expected = 100;
		assertEquals(expected,testPlayer.getPercentWon(),0.001);
		
	}
	
	//test the unhappy path of constructor eg exceptions thrown as expected where appropriate
	@Test
	void testPlayerConstructInvalid() {
		Exception exp = assertThrows(IllegalArgumentException.class, ()->{
			//invalid fname
			new Player(country1, invalidStringHigh, validStringLow, position1, postiveInt, postiveInt, postiveInt,
					postiveInt, postiveInt, postiveInt, validStringMid, postiveInt);
		});	
		exp = assertThrows(IllegalArgumentException.class, ()->{
			//invalid surname
			new Player(country1, validStringHigh, invalidStringLow, position1, postiveInt, postiveInt, postiveInt,
					postiveInt, postiveInt, postiveInt, validStringMid, postiveInt);
		});	
		exp = assertThrows(IllegalArgumentException.class, ()->{
			//invalid totalMatch
			new Player(country1, validStringHigh, validStringLow, position1, negativeInt, postiveInt, postiveInt,
					postiveInt, postiveInt, postiveInt, validStringMid, postiveInt);
		});	
		
	}

	@Test
	void testGetSetFirstNameValid() {
		
		player.setFirstName(validStringHigh);
		assertEquals(validStringHigh, player.getFirstName() );
		
		player.setFirstName(validStringMid);
		assertEquals(validStringMid, player.getFirstName() );
		
		player.setFirstName(validStringLow);
		assertEquals(validStringLow, player.getFirstName() );
		
	}
	
	@Test
	void testSetFirstNameInValid() {
		
		Exception exp = assertThrows(IllegalArgumentException.class, ()->{
			player.setFirstName(invalidStringLow);
		});	
		String expectedMessage = "Must be between 1 and 20";
		assertEquals(expectedMessage, exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, ()->{
			player.setFirstName(invalidStringHigh);
		});
	
	}
	
	@Test
	void testGetSetSurnameValid() {
		
		player.setSurname(validStringHigh);
		assertEquals(validStringHigh, player.getSurname() );
		
		player.setSurname(validStringMid);
		assertEquals(validStringMid, player.getSurname() );
		
		player.setSurname(validStringLow);
		assertEquals(validStringLow, player.getSurname() );
	}
	
	@Test
	void testSetSurnameInValid() {
		
		Exception exp = assertThrows(IllegalArgumentException.class, ()->{
			player.setSurname(invalidStringLow);
		});	
		String expectedMessage = "Must be between 1 and 20";
		assertEquals(expectedMessage, exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, ()->{
			player.setSurname(invalidStringHigh);
		});
		assertEquals(expectedMessage, exp.getMessage());
	
	}
	

	@Test
	void testGetSetPosition() {
		player.setPosition(position2);
		assertEquals(position2, player.getPosition());
	}

	@Test
	void testGetSetTotalMatchesValid() {
		//test basic getter setter logic
		player.setTotalMatches(9);		
		assertEquals(9, player.getTotalMatches());
		
		//set to known value and test winPercent Logic
		double expected = 50;
		player.setTotalMatches(10);
		assertEquals(expected,player.getPercentWon());
		
		expected = 33.333;
		player.setTotalMatches(15);
		assertEquals(expected,player.getPercentWon(),0.001);
		
	}
	

	@Test
	void testSetTotalMatchesInvalid() {
		assertThrows(IllegalArgumentException.class, ()->{
			player.setTotalMatches(negativeInt);
		});
	}

	

	@Test
	void testGetSetWon() {
		//test basic getter setter logic
				player.setWon(2);		
				assertEquals(2, player.getWon());
				
				//set to known value and test winPercent Logic
				double expected = 50;
				player.setWon(5);
				assertEquals(expected,player.getPercentWon(),0.001);
				
				expected = 30;
				player.setWon(3);
				assertEquals(expected,player.getPercentWon(),0.001);
	}

	

	
	@Test
	void testGetSetCountry() {
		player.setCountry(country2);
		assertEquals(country2, player.getCountry());
	}

	

}
