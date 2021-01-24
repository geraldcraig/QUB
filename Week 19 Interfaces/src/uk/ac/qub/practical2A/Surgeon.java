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
	public double calculateWeeklySalary(double hours) {
		return super.calculateWeeklySalary(hours);
	}
	@Override
	public void printAll() {
		super.printAll();
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
