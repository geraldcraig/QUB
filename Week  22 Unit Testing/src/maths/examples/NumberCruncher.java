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

	/**
	 * Method takes a seed value and creates an int array sized by the number passed
	 * (with each previous number * seed) eg given 2 and 4 would return an array of
	 * [2, 4, 8, 16]
	 * 
	 * @param seed
	 * @param number
	 * @return
	 */
	public int[] doubleUp(int seed, int number) {

		int[] nums = new int[number];
		nums[0] = seed;

		for (int i = 1; i < number; i++) {
			nums[i] = nums[i - 1] * seed;
		}
		return nums;
	}

}
