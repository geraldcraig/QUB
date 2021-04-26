package uk.ac.qub.airtraffic.control;

public abstract class Aircraft {
	
	// instance vars
	private int currentSpeed;
	private int distanceToAirfield;
	private String aircraftCode;
	
	/**
	 * default constructor for testing purposes
	 */
	public Aircraft() {
		
	}
	/**
	 * constructor with args
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 */
	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) {
		this.setCurrentSpeed(currentSpeed);
		this.setDistanceToAirfield(distanceToAirfield);
		this.setAircraftCode(aircraftCode);
	}
	
	// getters and setters
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public int getDistanceToAirfield() {
		return distanceToAirfield;
	}
	
	public void setDistanceToAirfield(int distanceToAirfield) {
		this.distanceToAirfield = distanceToAirfield;
	}
	
	public String getAircraftCode() {
		return aircraftCode;
	}
	
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}

	/**
	 * non abstract method to calculate time to airfield.
	 * public, as not every sub class needs to implement it
	 * takes two ints and returns a double
	 * @return time
	 */
	public double timeToAirfield() {
		return (double) this.getDistanceToAirfield() / this.getCurrentSpeed() * 60;
	}

}
