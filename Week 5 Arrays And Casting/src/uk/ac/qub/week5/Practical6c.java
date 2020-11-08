/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double[] heights = { 1.4, 1.9, 1.31, 1.2 };
		avgHeight(heights);
		tallestHeight(heights);
		smallestHeight(heights);
	}

	public static void avgHeight(double[] avg) {
		double count = 0;
		for (int i = 0; i < avg.length; i++) {
			count = count + avg[i];
		}
		System.out.printf("Average height is : %.2f\n", count / avg.length);
	}

	public static void tallestHeight(double[] tall) {
		double count = tall[0];
		for (int i = 0; i < tall.length; i++) {
			if (tall[i] > count) {
				count = tall[i];
			}
		}
		System.out.printf("Tallest height is : %.2f\n", count);
	}

	public static void smallestHeight(double[] small) {
		double count = small[0];
		for (int i = 0; i < small.length; i++) {
			if (small[i] < count) {
				count = small[i];
			}
		}
		System.out.printf("Smallest height is : %.2f\n", count);
	}
}
