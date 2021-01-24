/**
 * 
 */
package uk.ac.qub.exercise2;

/**
 * @author Gerald
 *
 */
public class BusinessAccount extends BankAccount implements IPrintable{
	
	private String businessName;
	

	@Override
	public void printStatement() {
		System.out.println("Bank statement");
		System.out.println("Printed...");
		
	}

	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Business name : " + this.businessName);
	}
	
	

}
