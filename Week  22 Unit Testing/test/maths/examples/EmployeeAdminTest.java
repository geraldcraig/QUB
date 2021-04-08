package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeAdminTest {

	ArrayList<Employee> employees = new ArrayList<Employee>();

	// create employee test data
	Employee employee1, employee2, employee3;

	// valid test data
	String employeeName1, employeeName2, employeeName3;
	int age1, age2, age3;

	@BeforeEach
	void setUp() throws Exception {

		employeeName1 = "employeeName1";
		employeeName2 = "employeeName2";
		employeeName3 = "employeeName3";

		age1 = 20;
		age2 = 25;
		age3 = 30;

		employee1 = new Employee(employeeName1, age1);
		employee2 = new Employee(employeeName2, age2);
		employee3 = new Employee(employeeName3, age3);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
	}

	@Test
	void testGetAllEmployeesByAge() {

		// invoke the search
		ArrayList<Employee> returnedSearchByAge = EmployeeAdmin.getAllEmployeesByAge(employees, 27);

		// should return two employees
		System.out.println(returnedSearchByAge.size());

		// could check the numbers returned and the exact object matches
		if (returnedSearchByAge.size() == 2 && returnedSearchByAge.contains(employee1)
				&& returnedSearchByAge.contains(employee2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		// or
		assertTrue(returnedSearchByAge.size() == 2 && returnedSearchByAge.contains(employee1)
				&& returnedSearchByAge.contains(employee2));
	}

}