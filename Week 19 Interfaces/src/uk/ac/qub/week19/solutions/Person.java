/**
 * 
 */
package simgameannoying;

/**
 * @author 3048013
 *
 */
public class Person {
	
	private String name;
	
	public Person() {
		this.name = "NO NAME PROVIDED";
	}

	/**
	 * @param name
	 */
	public Person(String name) {
		setName(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * insist at least 1 char long
	 */
	public void setName(String name) {
		if(name.length()==0) {
			this.name = "NO NAME PROVIDED";
		}
		else {
			this.name = name;
		}
	}

}
