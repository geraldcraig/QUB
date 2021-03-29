package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee employee;

	@BeforeEach
	void setUp() throws Exception {
		employee = new Employee();
	}

	@Test
	void testGetName() {
		employee.setName("Gerald");
		assertEquals("Gerald", employee.getName());
	}

	@Test
	void testSetNameInvalid() {
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		
		System.out.println(illegalArgumentException.getMessage());
		
		assertEquals("Name too short", illegalArgumentException.getMessage());
	}
	
	@Test
	void testSetGetAge() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			employee.setAge(18);
		});
		assertEquals("Invalid age entered", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	@Test
	void testEmployee() throws Exception {
		Employee e2 = new Employee("Aidan", 11);
		assertEquals("Aidan",e2.getName());
		assertEquals(11, e2.getAge());
	}

}
