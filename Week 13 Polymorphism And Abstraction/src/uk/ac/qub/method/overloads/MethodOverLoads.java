/**
 * 
 */
package uk.ac.qub.method.overloads;

/**
 * @author Gerald
 *
 */
public class MethodOverLoads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		squareUp(3);
		squareUp(3.2);
		squareUp(1, 3);
		

	}
	
	public static void squareUp(int number) {
		System.out.println(number * number);
	}

	public static void squareUp(double number) {
		System.out.println(number * number);
	}
	
	public static void squareUp(int number, int number1) {
		System.out.println(number * number1);
	}
}
