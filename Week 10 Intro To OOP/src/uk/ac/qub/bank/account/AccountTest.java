/**
 * 
 */
package uk.ac.qub.bank.account;

import java.util.Scanner;

/**
 * Creating and manipulating an Account object
 * @author geraldcraig
 *
 */
public class AccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a Scanner object to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// create an Account object and assign it to myAccount
		Account myAccount = new Account();
		
		// display initial value of name (null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());
		
		// prompt for and read name
		System.out.println("Please enter the name:");
		
		// read a line of text
		String theName = input.nextLine();
		
		// put theName in myAccount
		myAccount.setName(theName);
		
		// outputs a blank line
		System.out.println();
		
		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

	}

}
