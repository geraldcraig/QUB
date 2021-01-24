/**
 * 
 */
package uk.ac.qub.exercise3;

/**
 * @author Gerald
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lecturer lect1 = new Lecturer();
		lect1.setFirstName("Aidan");
		lect1.setLastName("McGowan");
		lect1.setSubject("Java");
		lect1.payWage(24, 1.2);
		lect1.displayAll();

	}

}
