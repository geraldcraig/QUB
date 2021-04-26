package uk.ac.qub.airtraffic.control;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAirtrafficControl {
	
	// arraylist to test methods
	ArrayList<Airline> air = new ArrayList<Airline>();
	
	// test data
	int speed1, speed2, speed3;
	int distance1, distance2, distance3;
	String code1, code2,code3;
	EngineType engine1, engine2, engine3;
	double time1,time2,time3;
	Airline air1, air2, air3;
	
	// set values
	@BeforeEach
	void setUp() throws Exception {
		speed1 = 800;
		speed2 = 700;
		speed3 = 600;
		distance1 = 16000;
		distance2 = 14000;
		distance3 =18000;
		code1 = "A12345";
		code2 = "A54321";
		code3 = "Aaaaaa";
		engine1 = EngineType.JET;
		engine2 = EngineType.PROPELLER;
		engine3 = EngineType.JET;
		time1 = 1200;
		time2 = 1200;
		time3 = 600;
		
		air1 = new Airline(speed1, distance1, code1, engine1);
		air2 = new Airline(speed2, distance2, code2, engine2);
		air3 = new Airline(speed3, distance3, code3, engine3);
		
		air.add(air1);
		air.add(air2);
		air.add(air3);
		
	}

	@Test
	void testSearchBySpeed() {
		ArrayList<Airline> returnedSearchBySpeed = AirtrafficControl.searchBySpeed(air, 650, 850);
		
		System.out.println(returnedSearchBySpeed.size());
		
		if (returnedSearchBySpeed.size() == 2 && returnedSearchBySpeed.contains(air1) && returnedSearchBySpeed.contains(air2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	void testSearchForAllByEngineType() {
		fail("Not yet implemented");
	}

	@Test
	void testSearchForLandingList() {
		fail("Not yet implemented");
	}

}
