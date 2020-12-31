/**
 * 
 */
package uk.ac.qub.abstraction.example;

/**
 * @author Gerald
 *
 */
public class TestAbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Builder b = new Builder();
		b.setFirstName("Alan");
		b.calculateSalary(2, 6);
		
		System.out.println(b.getFirstName());
		
		
		
	}

}
