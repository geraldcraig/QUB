 package airtraffic.control;

public class Airline extends Aircraft {

	// instance var
	private EngineType engineType;
	
	
	/**
	 * default constructor for testing purposes
	 */
	public Airline() {
		
	}

	/**
	 * constructor with args
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 * @param engineType
	 */
	public Airline(int currentSpeed, int distanceToAirfield, String aircraftCode, EngineType engineType) {
		super(currentSpeed, distanceToAirfield, aircraftCode);
		setEngineType(engineType);
		timeToAirfield();
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
	public void setCurrentSpeed(int currentSpeed) throws IllegalArgumentException {
		if (currentSpeed > 0 && currentSpeed <= 800) {
			super.setCurrentSpeed(currentSpeed);
		} else {
			System.out.println("Invalid speed");
			throw new IllegalArgumentException("INVALID SPEED");
		}
	}

	@Override
	public int getDistanceToAirfield() {
		return super.getDistanceToAirfield();
	}

	@Override
	public void setDistanceToAirfield(int distanceToAirfield) throws IllegalArgumentException {
		if (distanceToAirfield < 1 || distanceToAirfield > 20000) {
			System.out.println("Invalid distance");
			throw new IllegalArgumentException("INVALID DISTANCE");
		} else {
			super.setDistanceToAirfield(distanceToAirfield);
		}
	}

	@Override
	public String getAircraftCode() {
		return super.getAircraftCode();
	}

	@Override
	public void setAircraftCode(String aircraftCode) throws IllegalArgumentException {
		if ((aircraftCode.length() == 6) && (aircraftCode.charAt(0) == 'A') && (aircraftCode.charAt(5) != ' ') 
				&& (aircraftCode != "")) {
			super.setAircraftCode(aircraftCode);
		} else {
			System.out.println("Invalid code");
			throw new IllegalArgumentException("INVALID CODE");
		}
	}

	@Override
	public double timeToAirfield() {
		return super.timeToAirfield();
	}

	@Override
	public String toString() {
		return "Airline [CurrentSpeed=" + getCurrentSpeed() + ", DistanceToAirfield=" + getDistanceToAirfield()
				+ ", AircraftCode=" + getAircraftCode() + ", EngineType=" + getEngineType() + ", TimeToAirfield="
				+ timeToAirfield() + "]";
	}

}
