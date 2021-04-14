package uk.ac.qub.abstraction.example;

public class Nurse extends Employee {

	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println(rate * hours * 3.5);
	}

}
