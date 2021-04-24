package uk.ac.qub.airtraffic.control;

import java.util.InputMismatchException;

public class Airline1 extends Aircraft1 {
	
	private EngineType engineType;
	
	public Airline1(EngineType engineType) {
		super();
		this.engineType = engineType;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	@Override
	public int getCurrentSpeed() {
		return super.getCurrentSpeed();
	}

	@Override
	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > 0 && currentSpeed <= 800) {
			this.currentSpeed = currentSpeed;
		} else {
			System.out.println("Invalid speed");
			throw new InputMismatchException("INVALID SPEED");
		}
		super.setCurrentSpeed(currentSpeed);
	}

	@Override
	public int getDistanceToAirfield() {
		return super.getDistanceToAirfield();
	}

	@Override
	public void setDistanceToAirfield(int distanceToAirfield) {
		super.setDistanceToAirfield(distanceToAirfield);
	}

	@Override
	public String getAircraftCode() {
		return super.getAircraftCode();
	}

	@Override
	public void setAircraftCode(String aircraftCode) {
		super.setAircraftCode(aircraftCode);
	}

	@Override
	public double timeToAirfield() {
		return super.timeToAirfield();
	}

	@Override
	public String toString() {
		return "Airline1 [engineType=" + engineType + ", getCurrentSpeed()=" + getCurrentSpeed()
				+ ", getDistanceToAirfield()=" + getDistanceToAirfield() + ", getAircraftCode()=" + getAircraftCode()
				+ ", timeToAirfield()=" + timeToAirfield() + "]";
	}
	
	

}
