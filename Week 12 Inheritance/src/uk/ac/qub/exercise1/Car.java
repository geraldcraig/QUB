/**
 * 
 */
package uk.ac.qub.exercise1;

/**
 * @author geraldcraig
 *
 */
public class Car extends Vehicle {

	private int numberOfWheels;
	
	/**
	 * default constructor
	 */
	public Car() {
	}
	
	/**
	 * Constructor with args
	 * 
	 * @param name
	 * @param powerType
	 * @param numberOfWheels
	 */
	public Car(String name, String powerType, int numberOfWheels) {
		super(name, powerType);
		this.numberOfWheels = numberOfWheels;
	}

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	@Override
	public String toString() {
		return "Car [name=" + this.getName() + " powertype=" + this.getPowerType() +" numberOfWheels=" + numberOfWheels + "]";
	}

}
