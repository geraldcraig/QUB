/**
 * 
 */
package uk.ac.qub.week5;

/**
 * @author geraldcraig
 *
 */
public class Practical5a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hoursDay, hoursWeek;
		double salary;
		
		int [] hours = {8, 7, 9, 7, 4};
		String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < days.length; j++) {
			System.out.printf("%d hours worked on :  %s\n", hours[i], days[j]);
		}

	}

}
}
