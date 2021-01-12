/**
 * 
 */
package uk.ac.qub.bank.account2;

/**
 * Using the Account constructor to initialise the name instance
 * variable at the time each Account object is created.
 * @author Gerald
 *
 */
public class AccountTest2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create two Account objects
		Account2 account1 = new Account2("Jane Green");
		Account2 account2 = new Account2("John Blue");
		
;		
		// display initial value of name for each Account
		System.out.printf("account1 name is: %s%n", account1.getName());
		System.out.printf("account2 name is: %s%n", account2.getName());
		

	}

}
