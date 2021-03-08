package uk.ac.qub.week2.solutions;

/**
 * Class outputs to screen the day of the week depending on input number
 * 
 * @author Aidan
 *
 */
public class SwitcherDayOfWeek {

	/**
	 * Method outputs to screen the day of the week depending on input number
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// decalre vars
		int dayNumber;
		String day;

		// test data
		dayNumber = 6;

		// switch on the day of the week number to find the appropriate day
		switch (dayNumber) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid input";
		}
		// now output to screen the response
		System.out.println("That'll be : " + day);

	}

}
