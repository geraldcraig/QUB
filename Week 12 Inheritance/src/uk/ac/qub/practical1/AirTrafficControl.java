/**
 * 
 */
package uk.ac.qub.practical1;

/**
 * @author Gerald
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newark", 8.5);
				
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		
		Flight[] flights = {f1, f2, f3, f4};
		
		System.out.println(flights[3].getDestination());
		
		System.out.println("All flights.........");
		
		for (int i = 0; i < flights.length; i++) {
			System.out.println(flights[i].toString());	
		}
		
		
		
	}

}
