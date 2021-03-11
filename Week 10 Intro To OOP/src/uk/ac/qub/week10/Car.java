/**
 * 
 */
package uk.ac.qub.week10;

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
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public void startCar() {
		if (this.started) {
			System.out.println("Engine already running");
		} else {
			this.started = true;
			System.out.println("Engine started");
		}
		
	}
	
	public void stopCar() {
		if (!this.started) {
			System.out.println("Engine already stopped");
		} else {
			this.started = false;
			System.out.println("Engine stopped");
		}
		
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}

}
