/**
 * 
 */
package uk.ac.qub.week2;

import java.util.Scanner;

/**
 * @author geraldcraig
 *
 */
public class Practical3c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		String name, party, partyname;
		

		System.out.println("Please input your age");
		age = scanner.nextInt();

		if (age > 17) {
		
			System.out.println("Please enter your name");
			name = scanner.next();

			System.out.println("Name : " + name + " Age : " + age);
			System.out.println("\nVoting ... \nEnter 'con' for Conservative and 'lab' for Labour");
			party = scanner.next();

			if ((party.equalsIgnoreCase("con")) || (party.equalsIgnoreCase("lab"))) {

				partyname = party.equalsIgnoreCase("con") ? "Conservative" : "Labour";
				
				
				System.out.println("Party voted for is : " + partyname);

			} else {
				System.out.println("Party not recognised");
			}

		} else if ((age <= 17) && (age > 0)) {

			System.out.println("too young to continue");

		} else {

			System.out.println("sorry don't recognise your input");

		}

		scanner.close();
		
		

	}

}
