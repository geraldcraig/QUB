package uk.ac.qub.airtraffic.control;

public class Airline extends Aircraft {
	
	private EngineType engineType;
	
	
	public Airline(int currentSpeed, int distanceToAirfield, String aircraftCode, EngineType engineType) {
		super(currentSpeed, distanceToAirfield, aircraftCode);
		this.setEngineType(engineType);
	}

	/**
	 * @return the engineType
	 */
	public EngineType getEngineType() {
		return engineType;
	}

	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public void timeToAirfield() {
		double distance = this.getDistanceToAirfield();
		double speed = this.getCurrentSpeed();
		System.out.println("Minutes to airfield : " + distance / speed * 60);
	}

	@Override
	public String toString() {
		return "Airline [engineType=" + engineType + ", getCurrentSpeed()=" + getCurrentSpeed()
				+ ", getDistanceToAirfield()=" + getDistanceToAirfield() + ", getAircraftCode()=" + getAircraftCode()
				+ "]";
	}

	
	
}
