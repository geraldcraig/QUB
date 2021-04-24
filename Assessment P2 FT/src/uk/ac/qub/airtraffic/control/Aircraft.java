package uk.ac.qub.airtraffic.control;

public abstract class Aircraft {
	
	private int currentSpeed;
	private int distanceToAirfield;
	private String aircraftCode;
	
	public Aircraft() {
		
	}


	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) {
		this.setCurrentSpeed(currentSpeed);
		this.setDistanceToAirfield(distanceToAirfield);
		this.setAircraftCode(aircraftCode);
	}
	
	
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

	public double timeToAirfield() {
		return (double) this.getDistanceToAirfield() / this.getCurrentSpeed() * 60;
	}

}
