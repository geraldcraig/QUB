/**
 * 
 */
package uk.ac.qub.phone.app.solution;

/**
 * Represents functions of a online mobile selling website 
 */
public class CarphoneWarehouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Objects testing boundary values
		 */

		MobilePhone m1 = new MobilePhone("Samsung", "S11", 1);

		System.out.println(m1.toString());

		MobilePhone m2 = new MobilePhone("Samsung", "S11", 5);

		System.out.println(m2.toString());

		MobilePhone m3 = new MobilePhone("Samsung", "S11", 3);

		System.out.println(m3.toString());

		MobilePhone m4 = new MobilePhone("Samsung", "S11", -1);

		System.out.println(m4.toString());

		MobilePhone m5 = new MobilePhone("Samsung", "S11", 6);

		System.out.println(m5.toString());

	}

}
