/**
 * 
 */
package FlightControl;

/**
 * @author amcgowan
 *
 */
public class Flight {

	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;
	
	/**
	 * Default constructor
	 */
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor with args
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration - needs to be <= 18
	 */
	public Flight(String flightNumber,  String origin, String destination,double duration) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		
		// as there is a validation rule with this one calling the setter directly 
		// because the validation rule is implemented there
		this.setDuration(duration);
	}

	/**
	 * @return the flighNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set (Warning needs to be less < 18)
	 */
	public void setDuration(double duration) {
		if (duration<=18){
			this.duration = duration;
		} else {
			this.duration =0 ;
			System.out.println("Error : duration too long.  Setting to 0.");
		}
	}

	/**
	 * Creates a formatted string of all instance vars of the flight 
	 */
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", destination=" + destination + ", origin=" + origin
				+ ", duration=" + duration + "]";
	}

	
	
	
	
	
}
