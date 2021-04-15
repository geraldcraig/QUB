package methods.revision;

import java.util.Arrays;
import java.util.Scanner;

import uk.ac.qub.week4.Exercise2;

public class Multiple {

	public static void main(String[] args) {

		int[] myArray = { 4, 9, 2, 13, 7 };

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] += 5;
			//System.out.print(myArray[i] + " ");	
		}
		System.out.println(Arrays.toString(myArray));
		int pos = myArray[0];
		
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i] < pos) {
				pos = myArray[i];
			}
			
		}
		System.out.println("position : " + pos);
		
		System.out.println();
		System.out.println("multiple : ");
		Exercise2.main(args);

		System.out.println(nums(11, 9));
		loop(10);

		char response = 'n';
		System.out.println((response == 'y') ? "you chose yes" : "you chose no");

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");

		num = sc.nextInt();

		if (num % 10 == 0) {
			System.out.println("zero tail");
		} else {
			System.out.println("non zero tail");
		}

		sc.close();
	}

	public static double nums(double a, double b) {
		return (a > b) ? a : b;
	}

	public static void loop(int num) {
		while (num >= 1) {
			if (num == 5) {
				break;
			} else {
				System.out.println(num);
				num--;
			}
		}
		System.out.println("Abort");
	}

}
