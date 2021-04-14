package uk.ac.qub.airtraffic.control;

public class Airline extends Aircraft {
	
	private EngineType engineType;

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
	public void timeToAirfield(int distanceToAirfield, int currentSpeed) {
		super.timeToAirfield(distanceToAirfield, currentSpeed);
		
	}	
	
}
