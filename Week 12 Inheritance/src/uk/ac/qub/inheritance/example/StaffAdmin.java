/**
 * 
 */
package uk.ac.qub.inheritance.example;

/**
 * @author Gerald
 *
 */
public class StaffAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Staffmember staffmember = new Staffmember();
		staffmember.setFirstName("Aidan");
		staffmember.setLastname("McGowan");
		System.out.println(staffmember.toString());
		
		Doctor doctor = new Doctor();
		doctor.setFirstName("Joe");
		doctor.setLastname("Soap");
		doctor.setWard(2);
		
		System.out.println(doctor.toString());
		
		Programmer programmer = new Programmer();
		programmer.setLanguage("Java");
		programmer.setFirstName("Gerald");
		programmer.setLastname("Craig");
		
		System.out.println(programmer.toString());
		
		Staffmember staffmember2 = new Staffmember();
		staffmember2.setFirstName("Alison");
		staffmember2.setLastname("Craig");
		
		System.out.println(staffmember2.toString());
		
		Programmer p2 = new Programmer("Bill", "Gates", 1, "C#");
		
		System.out.println(p2.toString());
		
	}

}
