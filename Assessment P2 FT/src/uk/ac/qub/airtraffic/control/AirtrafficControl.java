package uk.ac.qub.airtraffic.control;

import java.util.ArrayList;

public class AirtrafficControl {

	public static void main(String[] args) {
		Airline air1 = new Airline(600, 100, "A12345", EngineType.JET);
		Airline air2 = new Airline(300, 300, "A54321", EngineType.PROPELLER);
		
		ArrayList<Airline> air = new ArrayList<Airline>();
		air.add(air1);
		air.add(air2);
		
		searchBySpeed(air);
		
		
		
		System.out.println("Current speed : " + air1.getCurrentSpeed() + " mph");
		System.out.println("Engine type : " + air1.getEngineType()+ " Engine");
		System.out.println("Aircraft code : " + air1.getAircraftCode());
		System.out.println("Distance to airfield : " + air1.getDistanceToAirfield());
		System.out.println();
		air1.timeToAirfield();

	}
	
	public static void searchBySpeed(ArrayList<Airline> speed) {
		for (int i = 0; i < speed.size(); i++) {
			System.out.println("Search by speed : " + speed.get(i).getCurrentSpeed());
		}
			
	}
	
	public static ArrayList<Airline> searchForAllByEngineType() {
		return null;	
	}
	
	public static ArrayList<Airline> searchForLandingList() {
		return null;	
	}

}
