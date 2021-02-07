package uk.ac.qub.practical2A;

public class Pharmacist extends Employee implements AdminsterDrugs {
	
	public int grade;
	public double bonus;
	
	public Pharmacist() {
		
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public void calculateWeeklySalary(double hours) {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f + £%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), "Pharmacist", this.getBaseRate(), this.bonus);
	}
	@Override
	public void printAll() {
		System.out.printf("%-10s %-10s [%-20s] : %.2fhrs * £%.2f + £%.2f + £%.2f", "Surgeon",
				this.getFirstName(), this.getLastName(), "Pharmacist", this.getBaseRate(), this.grade, this.bonus);
	}
	
	@Override
	public boolean adminControlledDrug() {
		return true;
	}
	@Override
	public boolean adminNoncontrolledDrug() {
		return true;
	}
	
	

}
