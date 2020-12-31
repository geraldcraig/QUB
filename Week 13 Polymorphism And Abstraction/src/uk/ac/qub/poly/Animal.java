/**
 * 
 */
package uk.ac.qub.poly;

/**
 * @author Gerald
 *
 */
public class Animal {
	
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
	public void setName(String name) {
		this.name = name;
	}
	
	public void makeANoise() {
		System.out.println("Animal makes a noise");
	}
}
