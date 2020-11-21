package uk.ac.qub.week4;

import java.util.Calendar;
import java.util.Random;

public class MethodsSolutionsPart2 {
	
	/**
	 * Calculates and returns the area of a rectangle, given the height and
	 * base.
	 * 
	 * @param height
	 * @param base
	 * @return the area of the triangle
	 */
	public static int areaOfTrainagle(int height, int base) {
		return ((base / 2) * height);
	}

	/**
	 * Given a number from 1-12, returns the name of the appropriate month.
	 * 
	 * @param numericalMonth
	 * @return the name of the Month
	 */
	public static String nameOfMonth(int numericalMonth) {
		// name to be returned. Note: default value is set as null.
		String name = null;

		switch (numericalMonth) {
		case 1:
			name = "Jan";
			break;
		case 2:
			name = "Feb";
			break;
		case 3:
			name = "Mar";
			break;
		case 4:
			name = "Apr";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "Jun";
			break;
		case 7:
			name = "Jul";
			break;
		case 8:
			name = "Aug";
			break;
		case 9:
			name = "Sep";
			break;
		case 10:
			name = "Oct";
			break;
		case 11:
			name = "Nov";
			break;
		case 12:
			name = "Dec";
			break;
		default:
			System.out.println("Error - unknown value");
		}
		// return the name value
		return name;
	}

	/**
	 * Method that takes three int arguments and returns the average of the
	 * numbers as a double.
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public static double averageFromNumbers(int num1, int num2, int num3) {

		int total = 0;
		double result = 0;

		total = num1 + num2 + num3;
		// to keep the result accurate need to cast to a double
		result = (double) total / 3;

		return result;

		// alternative in one line of code !
		// return ((num1+num2+num3) / (double)3);
	}

	/**
	 * Takes as an argument the name of a G8 country. Then returns the capital
	 * city of the country as a string
	 * 
	 * @param country
	 * @return the capital city
	 */
	public static String countryCapitalUsingASwitch(String country) {

		String capital = null;

		switch (country) {
		case "France":
			capital = "Paris";
			break;
		case "Germany":
			capital = "Berlin";
			break;
		// etc .. etc
		default:
			System.out.println("Unknown country");

		}
		return capital;
	}

	/**
	 * Takes as an argument the name of a G8 country. Then returns the capital
	 * city of the country as a string
	 * 
	 * @param country
	 * @return the capital city
	 */
	public static String countryCapital(String country) {

		String capital = null;

		if (country.equalsIgnoreCase("France")) {
			capital = "Paris";
		} else if (country.equalsIgnoreCase("Germany")) {
			capital = "Berlin";
			// etc etc
		} else {
			System.out.println("Unknown");
		}
		return capital;
	}

	

	/**
	 * Simulates a coin toss. Then checks if the user's call i.e. head or tails
	 * is correct
	 * 
	 * @param call
	 *            ie heads or tails (case insensitive)
	 */
	public static void coinToss(String call) {

		int result = 0;
		// var used to convert from users call eg "Heads" to a number value eg 1
		int callConvert = 0;

		// map the call to a numeric value. 1 = heads and 2 = tails
		if (call.equalsIgnoreCase("Heads")) {
			callConvert = 1;
		} else {
			callConvert = 2;
		}
		// "toss the coin". Generate either a 1 or a 2
		Random rand = new Random();
		result = rand.nextInt(2) + 1;

		// show the result of the coin toss
		if (result == 1) {
			System.out.print("Heads ");
		} else {
			System.out.print("Tails ");
		}

		// check if user called it correctly
		if (callConvert == result) {
			System.out.print(" you win");
		} else {
			System.out.print(" you lose");
		}
	}

	/**
	 * Main method used for ad hoc testing
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// test area of triangle
		System.out.println("areaOfTrainagle : " + areaOfTrainagle(4, 2));

		// test month
		System.out.printf("Month %d is %s", 7, nameOfMonth(7));

		System.out.println();

		// test average
		System.out.println("Average : " + averageFromNumbers(3, 4, 3));

		// test capital country
		System.out.printf("%s has a capital city %s \n", "Germany",
				countryCapital("Germany"));

		// test capital country (with switch)
		System.out.printf("%s has a capital city %s", "Germany",
				countryCapitalUsingASwitch("Germany"));

		System.out.println();
		// coin toss
		coinToss("Heads");

		
	}

}
