/**
 * 
 */
package uk.ac.qub.constructors;

/**
 * @author Gerald
 *
 */
public class TeamAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Footballer f1 = new Footballer();
		f1.setLastName("Gareth");
		f1.setLastName("Bale");
		f1.setEmployeeNumber(282882);
		f1.setSquadNumber(7);
		
		System.out.println(f1.getLastName());
		
		Footballer f2 = new Footballer("George", "Best", 8, 828282);
		System.out.println(f2.getLastName());
		System.out.println(f2.toString());
		
		Footballer f3 = new Footballer("Leo", "Messi", 98282);
		System.out.println(f3.toString());
		
		
		
																						
	}
	


}
