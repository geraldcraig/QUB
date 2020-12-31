/**
 * 
 */
package uk.ac.qub.poly;

/**
 * @author Gerald
 *
 */
public class Lion extends Animal {
	
	private String countryOfOrigin;

	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public void makeANoise() {
		System.out.println("Lion makes a ROOOARRR");
	}

}
