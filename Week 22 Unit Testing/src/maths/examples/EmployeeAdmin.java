package maths.examples;

import java.util.ArrayList;

public class EmployeeAdmin {

	public static ArrayList<Employee> getAllEmployeesByAge(ArrayList<Employee> employees, int age) {
		ArrayList<Employee> employeesWithAge = new ArrayList<Employee>();

		for (Employee employee : employees) {
			if (employee.getAge() <= age) {
				// found an employee - adding to list
				employeesWithAge.add(employee);
			}
		}

		// return the list
		return employeesWithAge;
	}

}
