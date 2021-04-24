package uk.ac.qub.airtraffic.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineTest {

	int validLow, speedValidMid, speedValidHigh;
	int invalidLow, speedInvalidHigh;
	String valid, invalid;
	Airline air;
	EngineType engine;

	@BeforeEach
	void setUp() throws Exception {
		validLow = 1;
		speedValidMid = 400;
		speedValidHigh = 800;
		invalidLow = 0;
		speedInvalidHigh = 801;
		valid = "Aaaaaa";
		engine = engine.JET;
		air = new Airline();
	}

	@Test
	void testGetSetValidCurrentSpeed() {
		air.setCurrentSpeed(validLow);
		assertEquals(validLow, air.getCurrentSpeed());

		air.setCurrentSpeed(speedValidMid);
		assertEquals(speedValidMid, air.getCurrentSpeed());

		air.setCurrentSpeed(speedValidHigh);
		assertEquals(speedValidHigh, air.getCurrentSpeed());
	}

	@Test
	void testGetSetInvalidCurrentSpeed() {
		String expectedMessage = "INVALID SPEED";
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			air.setCurrentSpeed(invalidLow);
		});
		assertEquals(expectedMessage, exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			air.setCurrentSpeed(speedInvalidHigh);
		});
	}

	@Test
	void testValidConstructor() {
		Airline air2 = new Airline(validLow, validLow, valid, engine);
		assertEquals(validLow, air2.getCurrentSpeed());
		assertEquals(validLow, air2.getDistanceToAirfield());
		assertEquals(valid, air2.getAircraftCode());
		assertEquals(engine, air2.getEngineType());
	}

	@Test
	void testInvalidConstructor() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(0, validLow, valid, engine);
		});
		assertEquals("INVALID SPEED", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(1, invalidLow, valid, engine);
		});
		assertEquals("INVALID DISTANCE", exp.getMessage());

		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Airline(1, validLow, "123456", engine);
		});
		assertEquals("INVALID CODE", exp.getMessage());

	}

}
