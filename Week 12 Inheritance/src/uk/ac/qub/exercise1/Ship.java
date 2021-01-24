package uk.ac.qub.exercise1;

public class Ship extends Vehicle {

	private int tonnage;
	
	/**
	 * 
	 * default constructor
	 */
	public Ship() {
		
	}

	public Ship(String name, String powerType, int tonnage) {
		super(name, powerType);
		this.tonnage = tonnage;
	}

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Ship [ name=" + this.getName() + " powertype=" + this.getPowerType() + " tonnage=" + tonnage + "]";
	}
	
}
