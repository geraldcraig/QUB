/**
 * 
 */
package uk.ac.qub.bank.account3;

import java.util.Scanner;

/**
 * Inputting and outputting floating-point numbers with Account objects.
 * @author Gerald
 *
 */
public class AccountTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Account3 account1 = new Account3("Jane Green", 50.00);
		Account3 account2 = new Account3("John Blue", -7.53);
		
		// display initial balance of each object
		System.out.printf("%s balance is: £%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: £%.2f%n", account2.getName(), account2.getBalance());
		
		// create a Scanner to obtain input from comman window
		Scanner input = new Scanner(System.in);
		
		// prompt input
		System.out.print("Enter deposit amount for account1: ");
		// obtain user input
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		// add to account1's balance
		account1.deposit(depositAmount);
		
		// display balances
		System.out.printf("%s balance is: £%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: £%.2f%n", account2.getName(), account2.getBalance());

		// prompt input
		System.out.print("Enter deposit amount for account2: ");
		// obtain user input
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		// add to account2's balance
		account2.deposit(depositAmount);
				
		// display balances
		System.out.printf("%s balance is: £%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: £%.2f%n", account2.getName(), account2.getBalance());
	}

}