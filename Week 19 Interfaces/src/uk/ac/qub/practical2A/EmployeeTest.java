/**
 * 
 */
package uk.ac.qub.practical2A;

/**
 * @author geraldcraig
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Surgeon surgeon1 = new Surgeon();
		
		Pharmacist pharmacist = new Pharmacist();
		
		
		System.out.println(("Surgeon : admin controlled drug : " + 
	surgeon1.adminControlledDrug()));
		System.out.println(("Surgeon : admin noncontrolled drug : " + 
				surgeon1.adminNoncontrolledDrug()));
		
		System.out.println(("Pharmacist : admin controlled drug : " + 
				pharmacist.adminControlledDrug()));
					System.out.println(("Pharmacist : admin noncontrolled drug : " + 
							pharmacist.adminNoncontrolledDrug()));
	}

}
