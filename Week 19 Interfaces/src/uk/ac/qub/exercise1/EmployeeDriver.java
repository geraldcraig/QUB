/**
 * 
 */
package uk.ac.qub.exercise1;

/**
 * @author Gerald
 *
 */
public class EmployeeDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("John");
		double wages = e1.calculateWages(23.9, 4.7);
		
		
		
		System.out.println(e1.getName() + " earned " + wages);

	}

}
  