/**
 * 
 */
package uk.ac.qub.exercise2.solution;

public class BankMangerApp {

	public static void main(String[] args) {
		
		// create the Personal Account
		PersonalAccount personalAcc = new PersonalAccount();
		personalAcc.setFirstName("Jimmy");
		personalAcc.setLastName("Nesbitt");
		personalAcc.setAccNumber(11111);
		
		// create Business Account
		BusinessAccount busAcc = new BusinessAccount();
		busAcc.setAccNumber(12345);
		busAcc.setBusinessName("QUB");
		busAcc.printStatement();
	
	}

}
