/**
 * 
 */
package uk.ac.qub.week19;

/**
 * @author Gerald
 *
 */
public class SimsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		HouseFly f1 = new HouseFly();
		
		Telesales t1 = new Telesales();
		
		Person[] people = {p1, t1};
		IPest[] pests = {f1,t1};
		
		DiningRoom diner = new DiningRoom(people, pests);
		diner.serveFood();  
		

	}

}
