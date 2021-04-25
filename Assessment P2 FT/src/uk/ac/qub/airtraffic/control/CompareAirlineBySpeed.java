package uk.ac.qub.airtraffic.control;

import java.util.Comparator;

public class CompareAirlineBySpeed implements Comparator<Airline> {

	@Override
	public int compare(Airline air2, Airline air3) {
		
		return air2.getCurrentSpeed() - air3.getCurrentSpeed();	
		}

}
