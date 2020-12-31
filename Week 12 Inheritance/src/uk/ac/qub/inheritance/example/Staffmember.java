/**
 * 
 */
package uk.ac.qub.inheritance.example;

/**
 * @author Gerald
 *
 */
public class Staffmember {
	
	private String firstName;
	private String lastname;
	private int employeeNumber;
	
	public Staffmember() {
		
	}
	
	public Staffmember(String firstName, String lastname, int employeeNumber) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.employeeNumber = employeeNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the employeeNumber
	 */
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	@Override
	public String toString() {
		return "Staffmember [firstName=" + firstName + ", lastname=" + lastname + ", employeeNumber=" + employeeNumber
				+ "]";
	}
	
	
	
	

}
