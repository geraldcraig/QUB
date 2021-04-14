package abstraction.slides;

public class Lecturer extends Employee {
	
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public void calculateSalary(double hours, double rate) {
		System.out.println("Salary for Lecturer : " + (rate * hours * 2));
	}
	
	

}
