package uk.ac.qub.train.challenge.solution;

import java.util.ArrayList;

/**
 * Represents a carriage of a train. Has a list of current passengers, holds the max number of passengers
 * and also the Class of passenger generally accepted (First or Second class )
 * @author Aidan
 *
 */
public class Carriage {

	private int maxPassengers;
	
	/**
	 * The list of passengers
	 */
	private ArrayList<Passenger> passengers;
	
	/**
	 * The type (class) of this carriage
	 */
	private PassengerClass passengerType;

	/**
	 * Default constructor
	 */
	public Carriage() {
		
	}
	
	/**
	 * Constructs a carriage 
	 * @param maxPassengers
	 * @param passengerType
	 */
	public Carriage(int maxPassengers, PassengerClass passengerType) {
		
		this.maxPassengers = maxPassengers;
		this.passengerType = passengerType;
		passengers = new ArrayList<Passenger>(maxPassengers);
	}


	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public PassengerClass getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(PassengerClass passengerType) {
		this.passengerType = passengerType;
	}
	
	public void addPassenger(Passenger passenger) {
		this.passengers.add(passenger);
	}
	
	/**
	 * Outputs to screen the carriage details, including passengers
	 */
	public void displayAll() {
		System.out.println("\nCarriage details ________________________");
		System.out.println("Max passengers : "+this.maxPassengers);
		System.out.println("Class          : "+this.getPassengerType());
		System.out.println("Current passengers : "+this.passengers.size());
		
		System.out.println("\nPassenger list : ");
		for (Passenger passenger : passengers ) {
			System.out.println(passenger.toString());
		}
	}
	
	public int currentPassengers() {
		return this.passengers.size();
	}
	
	/**
	 * Checks if the carriage is max capacity
	 * @return
	 */
	public boolean carriageFull() {
		return currentPassengers() == this.maxPassengers;
			
	}
}
