package uk.ac.qub.airtraffic.control;

public abstract class Aircraft1 {
	
	private int currentSpeed;
	private int distanceToAirfield;
	private String aircraftCode;
	
	
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
