/**
 * 
 */
package uk.ac.qub.practical3;

/**
 * @author Gerald
 *
 */
public class Calculator {
	
	private int memory;
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @return
	 */
	/*public double addNumbers(int num1) {
		return sqrt(num1);
	}*/
	
	/**
	 * 
	 * @param memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMemory() {
		return memory;
	}
	
	/**
	 * 
	 * @param memory
	 */
	public void clearMemory(int memory) {
		this.memory = memory;
	}

}
