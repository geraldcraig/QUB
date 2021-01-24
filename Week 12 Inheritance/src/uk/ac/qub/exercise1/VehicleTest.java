/**
 * 
 */
package uk.ac.qub.exercise1;

/**
 * @author geraldcraig
 *
 */
public class VehicleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setName("Ford");
		car.setPowerType("Petrol");
		car.setNumberOfWheels(4);
		System.out.println(car.toString());

	}

}
