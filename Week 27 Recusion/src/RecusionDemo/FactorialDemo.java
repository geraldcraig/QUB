package RecusionDemo;

public class FactorialDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Factorial of 5: " + factorial(5));
	}

	private static int factorial(int num) {
		// base case
		if (num == 1) {
			return 1;
		}
		int result = num * factorial(num - 1);
		return  result;
	}

}
