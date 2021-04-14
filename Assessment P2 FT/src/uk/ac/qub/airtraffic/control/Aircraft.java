/**
 * 
 */
package uk.ac.qub.airtraffic.control;

/**
 * @author Gerald
 *
 */
public abstract class Aircraft {
	
	private int currentSpeed;
	private int distanceToAirfield;
	private String aircraftCode;
	
	/**
	 * @return the currentSpeed
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * @param currentSpeed the currentSpeed to set
	 */
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	/**
	 * @return the distanceToAirfield
	 */
	public int getDistanceToAirfield() {
		return distanceToAirfield;
	}

	/**
	 * @param distanceToAirfield the distanceToAirfield to set
	 */
	public void setDistanceToAirfield(int distanceToAirfield) {
		this.distanceToAirfield = distanceToAirfield;
	}

	/**
	 * @return the aircraftCode
	 */
	public String getAircraftCode() {
		return aircraftCode;
	}

	/**
	 * @param aircraftCode the aircraftCode to set
	 */
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}

	public double timeToAirfield() {
		return currentSpeed;
		
	}
}
