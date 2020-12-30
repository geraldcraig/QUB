/**
 * 
 */
package uk.ac.qub.constructors;

/**
 * @author Gerald
 *
 */
public class Footballer {
	
	// instance vars
	private String firstName;
	private String lastName;
	private int squadNumber;
	private int employeeNumber;
	
	// constructors
	
	/**
	 * default constructor - Creates a footballer
	 */
	public Footballer() {
		System.out.println("default constructor");
	}
	
	public Footballer(String firstName, String lastName, int employeeNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNumber = employeeNumber;
		this.squadNumber = -1;
	}
	
	/**
	 * Creates a footballer with passed in details
	 * @param firstName
	 * @param lastName
	 * @param squadNumber
	 * @param employeeNumber
	 */
	public Footballer(String firstName, String lastName, int squadNumber, int employeeNumber) {
		System.out.println("Creating the footballer with details...");
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.setSquadNumber(squadNumber);
		
		this.employeeNumber = employeeNumber;
		
	}
	
	// methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSquadNumber() {
		return squadNumber;
	}
	/**
	 * Sets the squadNumber
	 * @param squadNumber the squadNumber to set limited to 1 - 30 (inclusive)
	 */
	public void setSquadNumber(int squadNumber) {
		if (squadNumber > 0 && squadNumber < 31) {
		this.squadNumber = squadNumber;
		} else {
			System.out.println("Sorry number outside range - set later");
			this.squadNumber = -999;
		}
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", lastName=" + lastName + ", squadNumber=" + squadNumber
				+ ", employeeNumber=" + employeeNumber + "]";
	}
	
	
}
