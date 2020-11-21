/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical6i {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] assignment1 = {24, 42, 29, 66, 77};
		double[] assignment2 = {79, 68, 31, 22, 42};
		double avg1 = 0;
		double avg2 = 0;
		
		for (int i = 0; i < assignment1.length; i++) {
			avg1 = avg1 + assignment1[i];	
		}
		avg1 = avg1/assignment1.length;
		System.out.printf("Assignment 1 average is : %.1f\n", avg1);
		
		for (int i = 0; i < assignment2.length; i++) {
			avg2 = avg2 + assignment2[i];	
		}
		avg2 = avg2/assignment2.length;
		System.out.printf("Assignment 2 average is : %.1f\n", avg2);
		
		double avg = (avg1 + avg2)/2;
		System.out.printf("Overall average is : %.1f\n", avg);
		
		if (avg1 > avg2) {
			System.out.println("Assignment 1 has the best average");
		} else if (avg2 > avg1) {
			System.out.println("Assignment 2 has the best average");
		} else {
			System.out.println("Both averages are the same");
		}
	}	
	

}
