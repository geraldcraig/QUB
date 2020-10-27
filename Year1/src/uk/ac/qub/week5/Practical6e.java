/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6e {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double temperatures[] = { 3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1 };

		avgTemp(temperatures);

	}

	public static void avgTemp(double[] temps) {
		double max = temps[0];
		double min = temps[0];
		double avg = 0;

		for (int i = 0; i < temps.length; i++) {
			avg = avg + temps[i];

			if (temps[i] > max) {
				max = temps[i];
			}
			if (temps[i] < min) {
				min = temps[i];
			}

		}
		System.out.printf("Total is : %.2f\n", avg);
		System.out.printf("Average temperature is : %.2f\n", avg / temps.length);
		System.out.printf("Max temperature is : %.2f\n", max);
		System.out.printf("Min temperature is : %.2f\n", min);
	}

}
