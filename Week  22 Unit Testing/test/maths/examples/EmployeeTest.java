package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetName() {
		
		Employee employee = new Employee();
		employee.setName("Gerald");
		
		assertEquals("Gerald", employee.getName());
	}

	@Test
	void testSetNameInvalid() {
		Employee employee = new Employee();
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		
		System.out.println(illegalArgumentException.getMessage());
		
		assertEquals("Name too short", illegalArgumentException.getMessage());
	}

}
