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
			employee.setAge(17);
		});
		assertEquals("Invalid age entered", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	@Test
	void testValidConstructor() throws Exception {
		Employee e2 = new Employee("Aidan", 18);
		assertEquals("Aidan", e2.getName());
		assertEquals(18, e2.getAge());
	}
	
	@Test
	void testInvalidConstrutor() throws Exception {
		assertThrows(Exception.class, () -> {
			Employee e2 = new Employee("Aidan", 17);
		});
		
	}
	

}
