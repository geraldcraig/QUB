/**
 * 
 */
package uk.ac.qub.practical3;

/**
 * @author Gerald
 *
 */
public class CalculatorApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// test data
		int num1 = 15;
		int num2 = 5;
		
		//
		Calculator cal = new Calculator();
		cal.addNumbers(num1, num2);
		cal.subtract(num1, num2);
		cal.multiply(num1, num2);
		cal.divide(num1, num2);
		cal.sqrRoot(num1);
		cal.setMemory(num1);
		cal.getMemory();
		cal.clearMemory();
		
		

	}

}
