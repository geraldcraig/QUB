package uk.ac.qub.week2;

/**
 * Class outputs to screen the day of the week depending on input number using
 * an IF Else IF etc
 * 
 * @author Aidan
 *
 */
public class DayOfWeekerIfElse {

	/**
	 * Class outputs to screen the day of the week depending on input number using
	 * an IF Else IF etc
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int dayNumber;
		String day;

		// test data
		dayNumber = 6;

		// checking the day to get the day as a string
		if (dayNumber == 1) {
			day = "Sunday";
		} else if (dayNumber == 2) {
			day = "Monday";
		} else if (dayNumber == 3) {
			day = "Tuesday";
		} else if (dayNumber == 4) {
			day = "Tuesday";
		} else if (dayNumber == 5) {
			day = "Tuesday";
		} else if (dayNumber == 6) {
			day = "Tuesday";
		} else if (dayNumber == 7) {
			day = "Tuesday";
		} else {
			day = "Invalid input";
		}
		// now output to screen the response
		System.out.println("That'll be : " + day);
	}
}

