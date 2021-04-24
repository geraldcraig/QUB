package uk.ac.qub.airtraffic.control;

public class Airline extends Aircraft {
	
	private EngineType engineType;
	
	
	public Airline(int currentSpeed, int distanceToAirfield, String aircraftCode, EngineType engineType) {
		super(currentSpeed, distanceToAirfield, aircraftCode);
		this.setEngineType(engineType);
		this.timeToAirfield();
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
	public double timeToAirfield() {
		return super.timeToAirfield();
	}

	@Override
	public String toString() {
		return "Airline [CurrentSpeed=" + getCurrentSpeed() + ", DistanceToAirfield=" + getDistanceToAirfield() + ", AircraftCode=" + getAircraftCode() + ", EngineType="
				+ getEngineType() + ", TimeToAirfield=" + timeToAirfield() + "]";
	}
	
	

	

	
	
}
