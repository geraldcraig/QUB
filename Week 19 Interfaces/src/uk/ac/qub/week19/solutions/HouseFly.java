/**
 * 
 */
package simgameannoying;

/**
 * @author 3048013
 *
 */
public class HouseFly extends Insect implements IPest {

	/**
	 * 
	 */
	public HouseFly() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beAnnoying() {
		flyAroundYourHead();

	}
	
	/**
	 * Fly is annoying by buzzing around
	 */
	private void flyAroundYourHead() {
		System.out.println("Buzz Buzz Fly Fly");
	}

}
