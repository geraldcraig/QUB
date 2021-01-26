/**
 * 
 */
package uk.ac.qub.exercise1;

/**
 * @author Gerald
 *
 */
public class Employee implements IPayable {
	
	private String name;
	
	public Employee() {
		
	}

	@Override
	public double calculateWages(double hoursWorked, double payRate) {
		return hoursWorked * payRate;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
