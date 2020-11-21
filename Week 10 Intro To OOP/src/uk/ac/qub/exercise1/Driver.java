/**
 * 
 */
package uk.ac.qub.exercise1;

/**
 * @author geraldcraig
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleCalc cal1 = new SimpleCalc();
		cal1.add(3, 4);
		
		SimpleCalc cal2 = new SimpleCalc();
		cal2.subtract(31, 2);
		
		SimpleCalc cal3 = new SimpleCalc();
		cal3.multiply(3, 4);
		
		SimpleCalc cal4 = new SimpleCalc();
		cal4.divide(12, 4);

	}

}
