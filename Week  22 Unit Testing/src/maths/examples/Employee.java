/**
 * 
 */
package maths.examples;

/**
 * @author Gerald
 *
 */
public class Employee {

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
		this.name = name;
		this.setAge(age);
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		if (name.length() > 0) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Name too short");
		}
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 * @throws Exception
	 */
	public void setAge(int age) throws Exception {
		if (age >= 18 && age <= 30) {
			this.age = age;
		} else {
			throw new Exception("Invalid age entered");
		}
	}

}
