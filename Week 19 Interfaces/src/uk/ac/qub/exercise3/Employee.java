/**
 * 
 */
package uk.ac.qub.exercise3;

/**
 * @author Gerald
 *
 */
public abstract class Employee {
	
	private String firstName;
	private String lastName;
	
	public void displayAll() {
		System.out.println("First name : " + this.firstName);
		System.out.println("Last name : " + this.lastName);
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
