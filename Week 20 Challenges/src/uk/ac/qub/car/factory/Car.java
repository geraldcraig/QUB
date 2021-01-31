/**
 * 
 */
package uk.ac.qub.car.factory;

/**
 * @author Gerald
 *
 */
public class Car {
	
	private String make;
	private String model;
	private int horsepower;
	
	/**
	 * default constructor
	 */
	public Car() {
		
	}
	
	/**
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public Car(String make, String model, int horsepower) {
		this.make = make;
		this.model = model;
		// engage with the validation for the horsepower 
		this.setHorsepower(horsepower);
	}

	public void displayAll() {
		System.out.println("Make \t:" + this.make);
		System.out.println("Model \t:" + this.model);
		System.out.println("HorsePower \t:" + this.horsepower);
		
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the horsepower
	 */
	public int getHorsepower() {
			return horsepower;	
	}

	/**
	 * @param horsepower (should be between 0 and 1000 inclusive)
	 *  the horsepower to set
	 */
	public void setHorsepower(int horsepower) {
		if (horsepower >= 0 && horsepower <= 1000) {
			this.horsepower = horsepower;
		} else {
			this.horsepower = -999;
		}
		
	}
}
