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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) throws IllegalArgumentException {
		
		if (name.length() >0) {
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
		if (age < 18 || age > 30) {
			throw new Exception("Invalid age entered");
		}
		this.age = age;
	}
		
}
