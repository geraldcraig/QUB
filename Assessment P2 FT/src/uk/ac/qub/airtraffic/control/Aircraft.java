/**
 * 
 */
package uk.ac.qub.airtraffic.control;

import java.util.InputMismatchException;

/**
 * @author Gerald
 *
 */
public abstract class Aircraft {

	private int currentSpeed;
	private int distanceToAirfield;
	private String aircraftCode;

	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) {
		this.setCurrentSpeed(currentSpeed);
		this.setDistanceToAirfield(distanceToAirfield);
		this.setAircraftCode(aircraftCode);
	}

	/**
	 * @return the currentSpeed
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * @param currentSpeed the currentSpeed to set
	 */
	public void setCurrentSpeed(int currentSpeed) throws InputMismatchException {
		if (currentSpeed > 0 && currentSpeed <= 800) {
			this.currentSpeed = currentSpeed;
		} else {
			System.out.println("Invalid speed");
			throw new InputMismatchException("INVALID SPEED");
		}
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
	public void setDistanceToAirfield(int distanceToAirfield) throws InputMismatchException {
		if (distanceToAirfield < 1 || distanceToAirfield > 20000) {
			throw new InputMismatchException("INVALID DISTANCE");
		} else {
			this.distanceToAirfield = distanceToAirfield;
		}
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
		if ((aircraftCode.length() == 6) && (aircraftCode.charAt(0) == 'A')) {
			this.aircraftCode = aircraftCode;
		} else {
			throw new InputMismatchException("INVALID CODE");
		}
	}

	public double timeToAirfield() {
		return (double) this.getDistanceToAirfield() / this.getCurrentSpeed() * 60;
	}
}
