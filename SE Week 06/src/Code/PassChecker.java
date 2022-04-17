package Code;

public class PassChecker {

	/**
	 * Checks if a supplied mark is between the pass mark 50-100 (inclusive)
	 * 
	 * @param mark
	 * @return true if a pass, otherwise false
	 */
	public boolean checkForPass(int mark) {
		if ((mark >= 50) && (mark <= 100)) {
			return true;
		} else {
			return false;
		}
	}
}
