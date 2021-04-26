package uk.ac.qub.airtraffic.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineTest {
	
	// test date
	int speedValidLow, speedValidMid, speedValidHigh;
	int speedInvalidLow, speedInvalidHigh;
	int distanceValidLow, distanceValidMid, distanceValidHigh;
	int distanceInvalidLow, distanceInvalidHigh;
	String codeValid, codeInvalidStart, codeInvalidLength, codeInvalidEmpty, codeInvalidSpace;
	EngineType engine;
	Airline air;
	
	// set values
	@BeforeEach
	void setUp() throws Exception {
		speedValidLow = 1;
		speedValidMid = 400;
		speedValidHigh = 800;
		speedInvalidLow = 0;
		speedInvalidHigh = 801;
		distanceValidLow = 1;
		distanceValidMid = 10000;
		distanceValidHigh = 20000;
		distanceInvalidLow = 0;
		distanceInvalidHigh = 20001;
		codeValid = "A12345";
		codeInvalidStart = "B12345";
		codeInvalidLength = "A1234";
		codeInvalidEmpty = "";
		codeInvalidSpace = "A1234 ";
		engine = engine.JET;
		air = new Airline();
	}
	
	// test happy path
	@Test
	void testGetSetValidCurrentSpeed() {
		air.setCurrentSpeed(speedValidLow);
		assertEquals(speedValidLow, air.getCurrentSpeed());

		air.setCurrentSpeed(speedValidMid);
		assertEquals(speedValidMid, air.getCurrentSpeed());

		air.setCurrentSpeed(speedValidHigh);
		assertEquals(speedValidHigh, air.getCurrentSpeed());
	}
	
	// test unhappy path
	@Test
	void testGetSetInvalidCurrentSpeed() {
		String expectedMessage = "INVALID SPEED";
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			air.setCurrentSpeed(speedInvalidLow);
		});
		assertEquals(expectedMessage, exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			air.setCurrentSpeed(speedInvalidHigh);
		});
		assertEquals(expectedMessage, exp.getMessage());
	}
	
	// test engine type is set - enum so no unhappy path to check
	@Test
	void testGetSetEngineType() {
		air.setEngineType(engine);
		assertEquals(engine, air.getEngineType());
	}
	
	@Test
	void testTimeToAirfield() {
		air.timeToAirfield();
	}

	@Test
	void testValidConstructor() {
		Airline air2 = new Airline(speedValidLow, distanceValidLow, codeValid, engine);
		assertEquals(speedValidLow, air2.getCurrentSpeed());
		assertEquals(speedValidLow, air2.getDistanceToAirfield());
		assertEquals(codeValid, air2.getAircraftCode());
		assertEquals(engine, air2.getEngineType());
	}

	@Test
	void testInvalidConstructor() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(speedInvalidLow, distanceValidHigh, codeValid, engine);
		});
		assertEquals("INVALID SPEED", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(speedValidMid, distanceInvalidHigh, codeValid, engine);
		});
		assertEquals("INVALID DISTANCE", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(speedValidLow, distanceValidLow,codeInvalidSpace, engine);
		});
		assertEquals("INVALID CODE", exp.getMessage());

	}

}
