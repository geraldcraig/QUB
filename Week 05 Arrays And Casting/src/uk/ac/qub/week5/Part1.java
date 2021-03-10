package uk.ac.qub.week5;

public class Part1 {

	public static void main(String[] args) {
		int[] hours = { 8, 7, 9, 7, 4 };
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		hoursWages(hours, days);

	}

	public static void hoursWages(int[] hours, String[] days) {
		int count = 0;
		for (int i = 0; i < hours.length; i++) {
			count += hours[i];
			for (int j = 0; j < days[i].length(); j++) {

			}
			System.out.println(hours[i] + " : " + days[i]);

		}
		System.out.println("Total hours worked : " + count);
		System.out.println("Average hours worked : " + count / hours.length);
	}

}
