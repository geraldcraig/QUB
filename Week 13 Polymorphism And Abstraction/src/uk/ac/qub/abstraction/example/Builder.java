package uk.ac.qub.abstraction.example;

public class Builder extends Employee {
	
	private int builderID;

	public int getBuilderID() {
		return builderID;
	}

	public void setBuilderID(int builderID) {
		this.builderID = builderID;
	}

	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println(rate * hours * 2.2);
		
	}

}
