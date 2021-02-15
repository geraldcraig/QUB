/**
 * 
 */
package uk.ac.qub.assessment2.solution;

/**
 * Sample Solution for P2 Task - corresponding to walkthrough video
 * @author Matthew Collins
 *
 */
public class MenuItem implements IDetail {

	private String name;
	private double price;

	/**
	 * Main constructor for menuItem objects
	 * 
	 * @param name
	 * @param price
	 */
	public MenuItem(String name, double price) {
		setName(name);
		setPrice(price);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if (validateName(name) == true) {
			this.name = name;
		} else {
			this.name = "INVALID NAME";
		}
	}

	/**
	 * Check a string for non empty letters and spaces only and starts with letter
	 * 
	 * @param input
	 * @return
	 */
	private boolean validateName(String input) {
		if (input.length() < 1) {
			return false;
		}
		if (input.charAt(0) == ' ') {
			return false;
		}
		// check string is only letters and spaces
		String validChars = " abcdefghijklmnopqrstuvwxyz";
		String lower = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			if (validChars.indexOf(lower.charAt(i)) == -1) {
				return false;
			}
		}

		return true;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price < 0) {
			price = 0;
		}
		this.price = price;
	}

	@Override
	public void printDetails() {
		// System.out.println(this.getName()+" "+this.getPrice());
		System.out.printf("%s\t\t�%.2f %n",this.name,this.price);
	}

}
