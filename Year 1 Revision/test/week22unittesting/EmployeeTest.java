package week22unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetSetName() {
		Employee employee = new Employee();
		employee.setName("Aidan");
		assertEquals("Aidan", employee.getName());
	}
	
	@Test
	void testSetNameInvalid() {
		Employee employee = new Employee();
		assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		// can also print message to console
		IllegalArgumentException illArg = assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		System.out.println(illArg.getMessage());
		// could also do
		assertEquals("Name too short", illArg.getMessage());
		
	}
	
}
