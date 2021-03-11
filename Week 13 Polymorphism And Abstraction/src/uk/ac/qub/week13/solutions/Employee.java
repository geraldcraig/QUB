/**
 * 
 */
package uk.ac.qub.week13.solutions;

/**
 * General employee definition 
 * @author amcgowan
 */
public abstract class Employee {

	private String firstName;
	private String lastName;
	private double baseRate;
	
	/**
	 * Default constructor
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Argument based constructor
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
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

	/**
	 * @return the baseRate
	 */
	public double getBaseRate() {
		return baseRate;
	}

	/**
	 * @param baseRate the baseRate to set
	 */
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	/**
	 * Calculates the employee's weekly wage
	 * @param hours
	 */
	public abstract void calculateWeeklySalary(double hours);


	/**
	 * Displays the employee's details
	 */
	public void printAll(){
		System.out.printf("[%-10s] %-20s %-20s £%.2f","Employee",this.firstName, this.lastName, this.baseRate);
	}
	
}
