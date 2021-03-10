/**
 * 
 */
package uk.ac.qub.week10.solutions;

/**
 * Represents a mobile phone
 * @author  
 *
 */
public class MobilePhone {
	
	/**
	 * Instance Vars
	 */
	
	private String make;
	private String model;
	private int rating;
	
	
	

	/**
	 * Default Constructor
	 */
	
	public MobilePhone() {
		
	}
	
	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param rating
	 */
	
	public MobilePhone(String make, String model, int rating) {
		
		this.make = make;
		this.model = model;
		this.setRating(rating);
		
		
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		if(rating >0 && rating <= 5) {
			 this.rating = rating;
		} else {
			System.out.println("Invalid entry, please enter a number 1 - 5");
		}
		
		}
	
	/**
	 * To String method to display values of class
	 */

	@Override
	public String toString() {
		return "MobilePhone [make=" + make + ", model=" + model + ", rating=" + rating + "]";
	}

}
