/**
 * 
 */
package uk.ac.qub.practical2A;

/**
 * @author geraldcraig
 *
 */
public class Porter extends Employee {
	
	public String site;
	
	public Porter() {
		
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
	}

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	@Override
	public void printAll() {
		super.printAll();
		this.getSite();
	}

	@Override
	public String toString() {
		return "Porter [site=" + site + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getBaseRate()=" + getBaseRate() + "]";
	}
	
	

}
