/**
 * 
 */
package uk.ac.qub.inheritance.example;

/**
 * @author Gerald
 *
 */
public class Programmer extends Staffmember {

	private String language;
	
	public Programmer() {
		
	}
	
	public Programmer(String firstName, String lastname, int employeeNumber, String language) {
		super(firstName, lastname, employeeNumber);
		this.language = language;
		
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Programmer [language=" + language + ", getFirstName()=" + getFirstName() + ", getLastname()="
				+ getLastname() + ", getEmployeeNumber()=" + getEmployeeNumber() + "]";
	}
	
}
