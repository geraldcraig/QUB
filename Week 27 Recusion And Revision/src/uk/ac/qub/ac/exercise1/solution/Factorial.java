package uk.ac.qub.ac.exercise1.solution;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(4));
	}

	public static int fact(int num) {
		// base case
		if (num == 1 ) {
			return 1;
		}
		return num * fact(num - 1);
	}

}
