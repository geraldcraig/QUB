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
	 * Adds 2 nums
	 * @param num1
	 * @param num2
	 * @return
	 */
	public void addNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/**
	 * Subtracts 2 nums
	 * @param num1
	 * @param num2
	 * @return
	 */
	public void subtract(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	/**
	 * Multiplies 2 nums
	 * @param num1
	 * @param num2
	 * @return
	 */
	public void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	/**
	 * Divides 2 nums
	 * @param num1
	 * @param num2
	 * @return
	 */
	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
	/**
	 * Finds square root of num
	 * @param num1
	 * @return
	 */
	public void sqrRoot(int num1) {
		System.out.println(Math.sqrt(num1));
	}
	
	/**
	 * Sets the memory
	 * @param memory
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	/**
	 * Gets the memory
	 * @return
	 */
	public int getMemory() {
		return memory;
	}
	
	/**
	 * Sets memory to zero
	 * @param memory
	 */
	public void clearMemory() {
		this.memory = 0;
	}

}
