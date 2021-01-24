/**
 * 
 */
package uk.ac.qub.exercise2;

/**
 * @author Gerald
 *
 */
public class BankTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		b1.setAccNumber(101);
		b1.displayAll();
		
		PersonalAccount p1 = new PersonalAccount();
		p1.setAccNumber(202);
		p1.setFirstName("John");
		p1.setLastName("Smith");
		p1.displayAll();
		
		BusinessAccount ba1 = new BusinessAccount();
		ba1.setAccNumber(333);
		ba1.setBusinessName("QUB");
		ba1.displayAll();
		ba1.printStatement();
		

	}

}
