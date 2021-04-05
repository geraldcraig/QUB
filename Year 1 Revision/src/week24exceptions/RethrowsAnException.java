package week24exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RethrowsAnException {
	public static void main(String[] args) {
		try {
			readFromFile();
		} catch (Exception exception) {
			System.out.println("Had a problem.");
		}
	}

	public static void readFromFile() {
		Scanner sc = new Scanner(System.in);
		try {
			int userNumber, answer;
			System.out.println("Enter a number...");
			userNumber = sc.nextInt();
			answer = 66 / userNumber;
			System.out.println("Answer is : " + answer);
		} catch (InputMismatchException | ArithmeticException ex) {
			// not handling this here, Rethrow to calling method
			throw ex;
		} finally {
			sc.close(); // close resources
		}			
	}
}
