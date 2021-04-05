package uk.ac.qub.week9;

public class ArrayIssue1 {

	public static void main(String[] args) {

		int[] myArray = { 1, 2, 3, 4 };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(myArray[i]);
			}
		} catch (Exception exception) {
			System.out.println("Sorry had a problem");
			exception.printStackTrace();
		}

	}

}
