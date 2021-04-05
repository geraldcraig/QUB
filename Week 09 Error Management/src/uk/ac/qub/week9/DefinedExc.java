package uk.ac.qub.week9;

public class DefinedExc {

	public static void main(String[] args) {
		
		try {
			int a, b, c;
			a = 9;
			b = 0;
			c= a / b;
			
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Div by zero");
		} catch (Exception exception) {
			System.out.println("Sorry had a problem");
		} finally {
			System.out.println("Bye");
		}
	}

}
