package uk.ac.qub.airtraffic.control;

import java.util.ArrayList;

public class AirtrafficControl {

	public static void main(String[] args) {
		Airline air1 = new Airline();
		air1.setCurrentSpeed(600);
		air1.setDistanceToAirfield(100);
		air1.setEngineType(EngineType.JET);
		air1.timeToAirfield();
		
		System.out.println("Current speed : " + air1.getCurrentSpeed() + " mph");
		System.out.println("Engine type : " + air1.getEngineType()+ " Engine");

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
