/**
 * 
 */
package FlightControl;

/**
 * @author amcgowan
 *
 */
public class AirTrafficControl {

	/**
	 * Tests the Flight class...
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Flight f1 = new Flight("ESY3214", "Amsterdam", "Belfast", 2.2);
			Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
			Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
			Flight f4 = new Flight("ESY3214", "Dublin", "Newark", 8.5);

			System.out.println("All flights..................");

			// show all flights
			System.out.println(f1.toString());
			System.out.println(f2.toString());
			System.out.println(f3.toString());
			System.out.println(f4.toString());

			// You could also add all flights to an array to flights
			Flight[] flights = { f1, f2, f3, f4 };

			System.out.println("All flights..................");
			// now show all flights using the array
			for (int loop = 0; loop < flights.length; loop++) {
				System.out.println(flights[loop].toString());
			}

			System.out.println();

			// the longest flight
			double longestFlight = flights[0].getDuration();
			for (int loop = 0; loop < flights.length; loop++) {
				if (flights[loop].getDuration() > longestFlight) {
					// new longest duration flight found
					longestFlight = flights[loop].getDuration();
				}
			}

			System.out.println("The longest flight duration : " + longestFlight);

			System.out.println();

			System.out.println("All flights from Dublin...............");
			// all flights from Dublin
			for (int loop = 0; loop < flights.length; loop++) {
				if (flights[loop].getOrigin().equalsIgnoreCase("Dublin")) {
					// output the flight number of this flight from Dublin
					System.out.println(flights[loop].getFlightNumber());
				}
			}

			// attempting to add a flight with an invalid duration i.e. >=18
			Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);

		} catch (Exception exception) {
			System.out.println("Had a problem. Programming exiting");
		}
	}

}
