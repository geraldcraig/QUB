package uk.ac.qub.exercise1.solution;

public class PayrollManger {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Aidan");
		System.out.printf("%s pay : £%.2f", employee.getName(), employee.calculatewages(40.5, 33.23));
	}

}
