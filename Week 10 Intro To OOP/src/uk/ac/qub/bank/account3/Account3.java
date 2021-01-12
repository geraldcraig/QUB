/**
 * 
 */
package uk.ac.qub.bank.account3;

/**
 * Account class with a double instance variable balance and a constructor
 * and deposit method that perform validation.
 * @author Gerald
 *
 */
public class Account3 {
	
	// instance variables
	private String name;
	private double balance;
	
	// Account constructor that receives two parameters
	public Account3(String name, double balance) {
	// assign name to instance variable name
		this.name = name;
	// validate that the balance is greater than 0.0; if it's not
	//instance variable balance keeps its default initial value of 0.0
	// if the balance is valid
		if (balance > 0.0 ) {
	// assign it to instance variable balance
			this.balance = balance;
		}			
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount) {
	// if the depositAmout is valid
		if (depositAmount > 0.0) {
	// add it to the balance	
			balance = balance + depositAmount;
		}
	}
	
	
	// method returns the account balance
	public double getBalance() {
		return balance;
	}
	
	
	// method that sets the name
	public void setName(String name) {
		this.name = name;
	}
	
	// method that returns the name
	public String getName() {
		return name;
	}

}
