/**
 * 
 */
package uk.ac.qub.practical4;

/**
 * @author Gerald
 *
 */
public class Car {
	
	private String name;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;
	
	public void startCar() {
		
	}
	
	public void stopCar() {
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}

}
