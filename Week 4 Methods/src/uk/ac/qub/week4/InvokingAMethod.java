/**
 * 
 */
package uk.ac.qub.week4;

/**
 * @author geraldcraig
 *
 */
public class InvokingAMethod {

	/**
	 * start point for this program.. this our first method based class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("In main start");
		name(5, "Gerald");
		System.out.println("In main end");

	} // end of main

	/**
	 * Prints a name to screen
	 * @param count - the number of times this is printed to screen
	 * @param name - the name to print
	 */
	public static void name(int count, String name) {
		for (int loop = 1; loop <= count; loop++) {
		System.out.println(name);
		}
	} // end of method

} // end of class
