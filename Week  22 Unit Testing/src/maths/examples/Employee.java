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
	
	
}
