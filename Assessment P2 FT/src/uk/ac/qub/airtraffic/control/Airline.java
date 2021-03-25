package uk.ac.qub.airtraffic.control;

public class Airline extends Aircraft {
	
	private String engineType;

	/**
	 * @return the engineType
	 */
	public String getEngineType() {
		return engineType;
	}

	/**
	 * @param engineType the engineType to set
	 */
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public int getCurrentSpeed() {
		// TODO Auto-generated method stub
		return super.getCurrentSpeed();
	}

	@Override
	public void setCurrentSpeed(int currentSpeed) {
		// TODO Auto-generated method stub
		super.setCurrentSpeed(currentSpeed);
	}

	@Override
	public int getDistanceToAirfield() {
		// TODO Auto-generated method stub
		return super.getDistanceToAirfield();
	}

	@Override
	public void setDistanceToAirfield(int distanceToAirfield) {
		// TODO Auto-generated method stub
		super.setDistanceToAirfield(distanceToAirfield);
	}

	@Override
	public String getAircraftCode() {
		// TODO Auto-generated method stub
		return super.getAircraftCode();
	}

	@Override
	public void setAircraftCode(String aircraftCode) {
		// TODO Auto-generated method stub
		super.setAircraftCode(aircraftCode);
	}
	
	
	

}
