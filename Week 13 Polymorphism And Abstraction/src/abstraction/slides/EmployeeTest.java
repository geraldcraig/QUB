package abstraction.slides;

public class EmployeeTest {

	public static void main(String[] args) {
		Lecturer lect1 = new Lecturer();
		lect1.calculateSalary(10, 40);
		
		Employee lect2 = new Lecturer();
		lect2.calculateSalary(10, 30);
		
		Employee r1 = new Reader();
		r1.setFirstName("John");
		
		System.out.println(r1.getFirstName());
	}

}
