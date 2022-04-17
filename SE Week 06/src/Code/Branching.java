package Code;

public class Branching {

	/**
	 * Returns the biggest number between two parameters (limited to positive numbers only) 
	 * @param num1
	 * @param num2
	 * @return (will return -1 if both are the same)
	 */
	public int biggest(int num1, int num2){
		int biggest;
		if (num1>num2){
			biggest=num1;
		} else if (num2>num1){
			biggest=num2;
		} else {
			biggest = -1;
		}
		return biggest;
	}
	
	
	/**
	 * Returns the smallest number between two parameters (limited to positive numbers only) 
	 * @param num1
	 * @param num2
	 * @return (will return -1 if both are the same)
	 */
	public int smallest(int num1, int num2){
		int smallest;
		if (num1<num2){
			smallest=num1;
		} else if (num2<num1){
			smallest=num2;
		} else {
			smallest = -1;
		}
		return smallest;
	}
}
