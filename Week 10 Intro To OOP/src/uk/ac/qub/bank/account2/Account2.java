/**
 * 
 */
package uk.ac.qub.bank.account2;

/**
 * Account class with a constructor that initialises the name.
 * @author Gerald
 *
 */
public class Account2 {
	// instance variable
	private String name;
	
	
	// constructor initialises name with parameter name
	// constructor name is class name
	public Account2(String name) {
		this.name = name;
	}
	
	// method to set the name
	public String getName() {
		return name;
	}
	
	// method to retrieve the name
	public void setName(String name) {
		this.name = name;
	}
	
	

}
