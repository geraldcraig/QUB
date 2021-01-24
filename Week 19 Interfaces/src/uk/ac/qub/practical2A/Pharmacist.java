package uk.ac.qub.practical2A;

public class Pharmacist extends Employee implements AdminsterDrugs {
	
	public int grade;
	public double bonus;
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
	public double calculateWeeklySalary(double hours) {
		return super.calculateWeeklySalary(hours);
	}
	@Override
	public void printAll() {
		super.printAll();
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
