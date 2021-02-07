/**
 * 
 */
package uk.ac.qub.practical2A;

/**
 * @author geraldcraig
 *
 */
public class Surgeon extends Employee implements AdminsterDrugs {
	
	public String specialistArea;
	public double consultationFee;
	
	public Surgeon() {
		
	}
	
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param specialistArea
	 * @param consultationFee
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}


	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}
	


	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}
	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}
	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("[%-10s] %-20s %020s £%.2f Specialist Area : &s, Consultation Fee :£%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getSpecialistArea(), this.getConsultationFee());
	}
	@Override
	public void printAll() {
		System.out.printf("[%-10s] %-20s %020s £%.2f Specialist Area : &s, Consultation Fee :£%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), this.getBaseRate(), this.getSpecialistArea(), this.getConsultationFee());
	}
	@Override
	public boolean adminControlledDrug() {
		return false;
	}
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}
	
	

}
