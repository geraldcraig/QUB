package week22unittesting;

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
	void testGetSetName() {
		employee.setName("Aidan");
		assertEquals("Aidan", employee.getName());
	}
	
	@Test
	void testSetNameInvalid() {
		assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		// can also print message to console
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		System.out.println(illegalArgumentException.getMessage());
		// could also do
		assertEquals("Name too short", illegalArgumentException.getMessage());
		
	}
	
}
