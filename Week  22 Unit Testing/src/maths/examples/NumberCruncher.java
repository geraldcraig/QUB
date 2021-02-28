package maths.examples;

public class NumberCruncher {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int addNumbers(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	public int multiplyNumbers(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	public double divNumbers(double num1, double num2) throws Exception {
		if (num2 == 0) {
			throw new Exception("Exception : attempt to div by zero");
		} else {
			return num1 / num2;
		}
	}

}
