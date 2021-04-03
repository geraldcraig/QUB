 package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	// test data
	String validName, inValidName;
	Employee employee;
	
	int ageValidLower, ageValidMid, ageValidUpper;
	int ageInValidLower, ageInValidUpper;
	
	@BeforeEach
	void setUp() throws Exception {
		validName = "Michael";
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
	void testsetInvalidAge() {
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
	void testSetGetAge() throws Exception {
		Exception exception = assertThrows(Exception.class, () -> {
			employee.setAge(17);
		});
		assertEquals("Invalid age entered", exception.getMessage());
		System.out.println(exception.getMessage());
	}
	
	@Test
	void testValidConstructor() throws Exception {
		Employee e2 = new Employee(validName, ageValidMid);
		assertEquals(validName, e2.getName());
		assertEquals(ageValidMid, e2.getAge());
	}
	
	@Test
	void testInvalidConstrutor() throws Exception {
		Exception exp = assertThrows(Exception.class, () -> {
			new Employee(validName, ageInValidLower);
		});
		
		exp = assertThrows(Exception.class, () -> {
			new Employee(inValidName, ageValidLower);
		});
		
	}
	

}
