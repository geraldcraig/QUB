package uk.ac.qub.exercise1.solution;

public class Employee implements IPayable {
	
	private String name;
	
	public Employee( ) {
		
	}

	@Override
	public double calculatewages(double hoursWorked, double payRate) {
		return hoursWorked * payRate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
