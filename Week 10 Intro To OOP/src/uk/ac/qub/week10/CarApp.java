/**
 * 
 */
package uk.ac.qub.week10;

/**
 * @author Gerald
 *
 */
public class CarApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setName("Ford");
		car1.setModel("Fiesta");
		car1.setColour("Blue");
		car1.setNumberOfDoors(4);
		car1.setEngineSize(1.2);
		car1.setMaxSpeed(110);
		
		car1.startCar();
		car1.startCar();
		car1.stopCar();
		car1.stopCar();
		
		Car car2 = new Car();
		car1.setName("Ford");
		car1.setModel("Fiesta");
		car1.setColour("Blue");
		car1.setNumberOfDoors(4);
		car1.setEngineSize(1.2);
		car1.setMaxSpeed(110);
		
		System.out.println(car1.toString());

	}

}
