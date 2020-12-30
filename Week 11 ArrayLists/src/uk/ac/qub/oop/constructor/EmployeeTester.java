/**
 * 
 */
package uk.ac.qub.oop.constructor;

/**
 * @author geraldcraig
 *
 */
public class EmployeeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.setFirstname("Matthew");
		em1.setSurname("Collins");
		em1.setEmployeeNum(1010101);
		em1.setSalary(99999.99);
		
		int[] projects = new int[3];
		
		Employee em2 = new Employee();
		
		Employee em3 = new Employee("Pete", "Jones", 58376, 75.99, new int[] {45,67,99});
		Employee em4 = new Employee("Pete1", "Jones1", 58376, 75.99, projects);
		Employee em5 = new Employee("John", "Smith");
		
		System.out.println(em1.getFirstname());
		System.out.println(em1.getSurname());
		System.out.println(em1.getEmployeeNum());
		System.out.println(em1.getSalary());
		
		System.out.println(em2.getSalary());
		
		System.out.println(em1.toString());
		
		System.out.println(em3);
		
		System.out.println(em4);
		
		System.out.println(em5);

	}

}
