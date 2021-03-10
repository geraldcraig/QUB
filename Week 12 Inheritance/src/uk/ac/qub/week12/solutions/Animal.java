/**
 * 
 */
package whalesinfo;

/**
 * Class represents a basic animal
 * @author amcgowan
 *
 */
public class Animal {

	private String name;

	/**
	 * Default constructor
	 * @param name
	 */
	public Animal() {
		
	}
	
	
	/**
	 * Constructor with args
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
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
	 * String representation of the instance vars 
	 */
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
}
