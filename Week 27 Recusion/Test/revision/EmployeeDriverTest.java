package revision;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeDriverTest {
	
	List<Employee> employees;
	
	Employee employee1, employee2, employee3;
	
	String employeeName1, employeeName2, employeeName3;
	int age1, age2, age3;
	String fullTime, partTime;
	

	@BeforeEach
	void setUp() throws Exception {
		
		employeeName1 = "employee1";
		employeeName2 = "employee2";
		employeeName3 = "employee3";
		
		age1 = 25;
		age2 = 18;
		age3 = 28;
		
		fullTime = "FT";
		partTime = "PT";
		
		employee1 = new Employee(employeeName1, age1, fullTime);
		employee2 = new Employee(employeeName2, age2, fullTime);
		employee3 = new Employee(employeeName3, age3, partTime);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		}

	@Test
	void testFindByAge() {
		List<Employee> returnedSearchByAge = EmployeeDriver.findByAge(employees, 27);
		
		if (returnedSearchByAge.size() == 2 && returnedSearchByAge.contains(employee1) 
				&& returnedSearchByAge.contains(employee2)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
