/**
 * 
 */
package maths.examples;

import java.util.ArrayList;

/**
 * @author Gerald
 *
 */
public class Employee {
	
	// constants for business rules
	private static final int AGE_VALID_LOWER = 18;
	private static final int AGE_VALID_UPPER = 30;
	
	// instance vars
	private String name;
	private int age;	

	/**
	 * 
	 */
	public Employee() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 * @param age
	 * @throws Exception 
	 */
	public Employee(String name, int age) throws IllegalArgumentException {
		setName(name);
		setAge(age);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name != null && name.length() > 0) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Invalid name");
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * setter for age and apply business rules
	 * @param age
	 * @throws IllegalArgumentException
	 */
	public void setAge(int age) throws IllegalArgumentException {
		if (age < AGE_VALID_LOWER || age > AGE_VALID_UPPER) {
			throw new IllegalArgumentException("Invalid age entered");
		} else {
			this.age = age;
		}
	}
	
	public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age) {
		ArrayList<Employee> employeesWithAge = new ArrayList<Employee>();
		
		for (Employee employee : employees) {
			if (employee.getAge() <= age) {
				// found an employee - adding to list
				employeesWithAge.add(employee);
			}
		}
		
		// return the list
		return employeesWithAge;
	}

}
