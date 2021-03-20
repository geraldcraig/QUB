package uk.ac.qub.frameworksdemo;

public class Employee {

	private String name;
	private int age;
	private String employeeStatus;
	
	/**
	 * @param name
	 * @param age
	 * @param employeeStatus
	 */
	public Employee(String name, int age, String employeeStatus) {
		this.name = name;
		this.age = age;
		this.employeeStatus = employeeStatus;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", employeeStatus=" + employeeStatus + "]";
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
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the employeeStatus
	 */
	public String getEmployeeStatus() {
		return employeeStatus;
	}
	
	/**
	 * @param employeeStatus the employeeStatus to set
	 */
	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}	
}
