/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double temperatures[] = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
		avgTemp(temperatures);
		
	
		}
	public static void avgTemp(double[] temps) {
		double avg = 0;
		for (int i = 0; i < temps.length; i++) {
			avg = avg + temps[i];
		}
		System.out.printf("Total : %.2f\n", avg);
		System.out.printf("Average is : %.2f", avg/temps.length);
	}
	
	

}
