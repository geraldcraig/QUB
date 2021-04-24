package uk.ac.qub.airtraffic.control;

import java.util.ArrayList;

public class AirtrafficControl {

	public static void main(String[] args) {

		Airline air1 = new Airline(150, 300, "A12345", EngineType.JET);
		Airline air2 = new Airline(300, 300, "A54321", EngineType.PROPELLER);
		Airline air3 = new Airline(600, 60, "A43544", EngineType.JET);
		

		ArrayList<Airline> air = new ArrayList<Airline>();
		air.add(air1);
		air.add(air2);
		air.add(air3);
		

		ArrayList<Airline> speed = new ArrayList<Airline>();
		speed.addAll(searchBySpeed(air, 100, 600));
		for (Airline i : speed) {
			System.out.println("Search by speed : " + i);
		}
		

		System.out.println("\n-------------\n");
		

		ArrayList<Airline> engine = new ArrayList<Airline>();
		engine.addAll(searchForAllByEngineType(air));
		for (Airline i : engine) {
			System.out.println("Search by engine type : " + i);
		}
		

		System.out.println("\n-------------\n");
		

		ArrayList<Airline> landingList = new ArrayList<Airline>();
		landingList.addAll(searchForLandingList(air, 6, 300, EngineType.JET));
		for (Airline i : landingList) {
			System.out.println("Search by landing : " + i);
		}

	}
	

	public static ArrayList<Airline> searchBySpeed(ArrayList<Airline> list, int min, int max) {
		ArrayList<Airline> speed = new ArrayList<Airline>();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getCurrentSpeed() >= min) && (list.get(i).getCurrentSpeed() <= max)) {
				speed.add(list.get(i));
			}
		}
		return speed;
	}
	

	public static ArrayList<Airline> searchForAllByEngineType(ArrayList<Airline> list) {
		ArrayList<Airline> eng = new ArrayList<Airline>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEngineType().equals(EngineType.JET)) {
				eng.add(list.get(i));
			}
		}
		return eng;
	}
	

	public static ArrayList<Airline> searchForLandingList(ArrayList<Airline> list, int timeMin, int timeMax,
			EngineType eng) {
		ArrayList<Airline> landing = new ArrayList<Airline>();
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).timeToAirfield() >= timeMin) && (list.get(i).timeToAirfield() <= timeMax)
					&& (list.get(i).getEngineType().equals(eng))) {
				landing.add(list.get(i));
			}
		}
		return landing;
	}

}
