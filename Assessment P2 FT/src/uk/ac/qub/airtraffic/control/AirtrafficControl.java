package uk.ac.qub.airtraffic.control;

import java.util.ArrayList;

public class AirtrafficControl {

	public static void main(String[] args) {
		Airline air1 = new Airline(600, 100, "A12345", EngineType.JET);
		Airline air2 = new Airline(300, 300, "A54321", EngineType.PROPELLER);
		Airline air3 = new Airline(800, 50, "A43544", EngineType.JET);
		
		ArrayList<Airline> air = new ArrayList<Airline>();
		air.add(air1);
		air.add(air2);
		air.add(air3);
		
		
		searchBySpeed(air);
		ArrayList<Airline> engine = new ArrayList<Airline>();
		//engine.add(tem))
		System.out.println("Search by engine type : " + searchForAllByEngineType(air));
		searchForLandingList(air);
		
		
		
		System.out.println("Current speed : " + air1.getCurrentSpeed() + " mph");
		System.out.println("Engine type : " + air1.getEngineType()+ " Engine");
		System.out.println("Aircraft code : " + air1.getAircraftCode());
		System.out.println("Distance to airfield : " + air1.getDistanceToAirfield());
		System.out.println();
		air1.timeToAirfield();

	}
	
	public static void searchBySpeed(ArrayList<Airline> temp) {
		for (int i = 0; i < temp.size(); i++) {
			System.out.println("Search by speed : " + temp.get(i).getCurrentSpeed());
		}
			
	}
	
	public static ArrayList<Airline> searchForAllByEngineType(ArrayList<Airline> engine) {
		ArrayList<Airline> engineType = new ArrayList<Airline>();
		for (int i = 0; i < engine.size(); i++) {
			if (engine.get(i).getEngineType().equals(EngineType.JET)) {
				engineType.add(engine.get(i));
			}		
		}
		
		return engineType;	
	}
	
	public static void searchForLandingList(ArrayList<Airline> list) {
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getDistanceToAirfield() < 200) {
		System.out.println("distance : " + list.get(i).getDistanceToAirfield());
			}
		}
		 
	}

}
