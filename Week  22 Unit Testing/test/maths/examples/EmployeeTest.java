 package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	// test data
	String validName, invalidName;
	Employee employee;
	
	int ageValidLower, ageValidMid, ageValidUpper;
	int ageInValidLower, ageInValidUpper;
	
	@BeforeEach
	void setUp() throws Exception {
		validName = "Michael";
		invalidName = "";
		employee = new Employee();
		
		ageValidLower = 18;
		ageValidMid =24;
		ageValidUpper = 30;
		
		ageInValidLower = 17;
		ageInValidUpper = 31;
	}

	@Test
	void testGetSetName() {
		employee.setName(validName);
		assertEquals(validName, employee.getName());
	}
	
	@Test
	void testGetSetAge() {
		employee.setAge(ageValidMid);
		assertEquals(ageValidMid, employee.getAge());
	}
	
	@Test
	void testSettingValidAges() {
		employee.setAge(ageValidLower);
		assertEquals(ageValidLower, employee.getAge());
		
		employee.setAge(ageValidMid);
		assertEquals(ageValidMid, employee.getAge());
		
		employee.setAge(ageValidUpper);
		assertEquals(ageValidUpper, employee.getAge());	
	}
	
	@Test
	void testSetInvalidAge() {
		String expectedMessage = "Invalid age entered";
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageInValidLower);
		});
		assertEquals(expectedMessage, exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			employee.setAge(ageInValidUpper);
		});
		assertEquals(expectedMessage, exp.getMessage());
	}

	@Test
	void testSetNameInvalid() {
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
			employee.setName("");
		});
		
		System.out.println(illegalArgumentException.getMessage());
		
		assertEquals("Invalid name", illegalArgumentException.getMessage());
	}
	
	@Test
	void testValidConstructor() throws Exception {
		Employee e2 = new Employee(validName, ageValidMid);
		assertEquals(validName, e2.getName());
		assertEquals(ageValidMid, e2.getAge());
		
		System.out.println("Valid name: " + e2.getName());
	}
	
	@Test
	void testInvalidConstrutor() throws IllegalArgumentException {
		// call constructor with invalid values, test for exception
		Exception exp = assertThrows(IllegalArgumentException.class, () -> {
			new Employee(validName, ageInValidLower);
		});
		
		System.out.println("Invalid age Exception: " + exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Employee(invalidName, ageValidLower);
		});	
		
		assertEquals("Invalid name", exp.getMessage());
		
		System.out.println("Invalid name Exception: " + exp.getMessage());
		
		exp = assertThrows(IllegalArgumentException.class, () -> {
			new Employee(null, ageValidLower);
		});	
	}
	
}
