/**
 * 
 */
package maths.examples;

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
	public Employee(String name, int age) throws Exception {
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

}
