/**
 * 
 */
package simgameannoying;

/**
 * @author 3048013
 *
 */
public class SimGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("Bob");
		Person p2 = new Person();
		
		HouseFly f1 = new HouseFly();
		HouseFly f2 = new HouseFly();
		Telesales t1 = new Telesales("Simon", "Virgin Media");
		Telesales t2 = new Telesales("Mary", "The Lotto");
		Telesales t3 = new Telesales("Jane", "Some company");
		
		Person[] people = new Person[] {p1,p2,t3};
		IPest[] pests = new IPest[] {f1,t1,f2,t2,t3};
		//IPest[] pests = new IPest[0];
		
		DiningRoom diner = new DiningRoom(people, pests);
		diner.serveFood();

	}

}
