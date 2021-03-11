/**
 * 
 */
package uk.ac.qub.week19;

/**
 * @author Gerald
 *
 */
public class Telesales extends Person implements IPest {

	/**
	 * 
	 */
	public Telesales() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beAnnoying() {
		makePhoneRing();
	}
	
	private void makePhoneRing() {
		System.out.println(("Ring Ring"));
	}

}
