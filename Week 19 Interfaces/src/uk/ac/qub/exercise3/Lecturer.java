/**
 * 
 */
package uk.ac.qub.exercise3;

/**
 * @author Gerald
 *
 */
public class Lecturer extends Employee implements IPayable{
	
	private String subject;

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Subject is : " + this.subject);
	}

	@Override
	public double payWage(double hrs, double rate) {
		return hrs * rate;
		
	}
	
	
	

}
