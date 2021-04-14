package uk.ac.qub.airtraffic.control;

import java.util.ArrayList;

public class AirtrafficControl {

	public static void main(String[] args) {
		Airline air1 = new Airline();
		air1.setCurrentSpeed(800);
		air1.setDistanceToAirfield(1000);
		air1.setEngineType(EngineType.JET);
		
		System.out.println(air1.getCurrentSpeed());
		System.out.println(air1.getEngineType());

	}
	
	public static ArrayList<Integer> searchBySpeed() {
		return null;	
	}
	
	public static ArrayList<Integer> searchForAllByEngineType() {
		return null;	
	}
	
	public static ArrayList<Integer> searchForLandingList() {
		return null;	
	}

}
