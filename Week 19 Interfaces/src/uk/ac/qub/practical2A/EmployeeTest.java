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
		
		Porter porter1 = new Porter("Ivana", "Patient", 10.50, "Royal");
		Porter porter2 = new Porter("Amanda", "Pushabed", 10.50, "BCH");
		Surgeon surgeon1 = new Surgeon("Jack", "Ripper", 55.25, "Renal", 650.00);
		Surgeon surgeon2 = new Surgeon("Edward", "Lister", 55.25, "Vascular", 800.00);
		Pharmacist pharmacist = new Pharmacist("Poppy", "Pill", 30.50, 7, 750);
		
		System.out.println(porter1.toString());
		
		
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
