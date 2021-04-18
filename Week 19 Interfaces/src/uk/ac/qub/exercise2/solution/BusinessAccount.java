/**
 * 
 */
package uk.ac.qub.exercise2.solution;

public class BusinessAccount extends BankAccount implements IPrintable{
	
	private String businessName;

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	@Override
	public void printStatement() {
		System.out.println("Business account statement (simulated ...)");
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Business name : " + this.businessName);
	}
	
}
