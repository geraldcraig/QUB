package uk.ac.qub.assessment1;

public class Question5 {

	public static void main(String[] args) {
		// TODO : Rewrite the following code snippet using the 
		// conditional / ternary operator to replace the 
		// following if .. else statement to achieve the same functionality.
		
		char response = 'y';
		if (response == 'y') {
		    System.out.println("You Chose Yes");
		} else {
		    System.out.println("OK Goodbye");
		}
		
		System.out.println(response == 'n' ? "You chose yes" : "Ok goodbye");

	}

}
