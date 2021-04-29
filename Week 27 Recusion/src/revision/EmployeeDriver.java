package revision;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		List<Employee> matchList = findByAge(employees, 25);
		
	}

	public static List<Employee> findByAge(List<Employee> employees, int age) {
		List<Employee> employeesWithAge = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getAge() <= age) {	
				employeesWithAge.add(employee);
			}
		}
		return employeesWithAge;
	}

}
