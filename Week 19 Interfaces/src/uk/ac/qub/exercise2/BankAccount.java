/**
 * 
 */
package uk.ac.qub.exercise2;

/**
 * @author Gerald
 *
 */
public class BankAccount {
	
	private int accNumber;
	
	public BankAccount() {
		
	}
	
	public void displayAll() {
		System.out.println("account number : " + this.accNumber);
	}

	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

}
