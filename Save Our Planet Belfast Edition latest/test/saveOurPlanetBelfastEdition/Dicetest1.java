package saveOurPlanetBelfastEdition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Dicetest1 {

	int ValidNumOfSides;
	int ValidValue;

	@BeforeEach
	void setUp() throws Exception {
		
		ValidNumOfSides = 4;
		ValidValue = 1;
	}

	// test default constructor happy path
	@Test
	void testDice() {
		Dice dice = new Dice();
		assertEquals(ValidNumOfSides, dice.getNumOfSides());
		assertEquals(ValidValue, dice.getValue());
	}
	
	// test constructor with args happy path
	@Test
	void testDiceInt() {
		Dice dice = new Dice(ValidNumOfSides);
		assertEquals(ValidNumOfSides, dice.getNumOfSides());
		assertEquals(ValidValue, dice.getValue());
	}
	
	// test value getter and setter happy path
	@Test
	void testGetSetValue() {
		Dice dice = new Dice();
		dice.setValue(ValidValue);
		assertEquals(ValidValue, dice.getValue());
	}

	@Test
	void testGetNumOfSides() {
		fail("Not yet implemented");
	}

	@Test
	void testRollDice() {
		fail("Not yet implemented");
	}

	@Test
	void testGenerateDice() {
		fail("Not yet implemented");
	}

	@Test
	void testRollDiceDiceArray() {
		fail("Not yet implemented");
	}

	@Test
	void testSumDice() {
		fail("Not yet implemented");
	}
	
	@Test
	void testToString() {
		fail("Not yet implemented");
	}


}
