/**
 * 
 */
package uk.ac.qub.bank.account;

/**
 * Account class that contains a name instance variable
 * and methods to set and get its value
 * @author geraldcraig
 *
 */
public class Account {
	// instance variable
	private String name;
	
	// method to set the name in the object
	public void setName(String name) {
		// store the name
		this.name = name;
	}
	
	// method to retrieve the name from the object
	public String getName() {
		// return the value to the caller
		return name;
	}

}
