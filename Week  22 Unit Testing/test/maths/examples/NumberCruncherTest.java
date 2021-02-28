/**
 * 
 */
package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Gerald
 *
 */
class NumberCruncherTest {
	
	// test data
	int num1;
	int num2;
	int num3;
	NumberCruncher nc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception { 
		num1 = 2;
		num2 = 4;
		num3 = -6;
		nc = new NumberCruncher();
	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {
		System.out.println("About to test addNumbers(int, int) ");
		
		int expected = 6;
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
		System.out.println("Test AddNumbersIntInt finished" );
		
 	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
		System.out.println("About to test addNumbers(int, int, int) ");
		
		int expected = 0;
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual); 
		System.out.println("Test AddNumbersIntIntInt finished" );
	}
	
	/**
	 * 
	 */
	@Test
	void testMultiplyNumbersIntInt() {
		System.out.println("About to test multiplyNumbers(int, int) ");
		int expected = 8;
		int actual = nc.multiplyNumbers(num1, num2);
		assertEquals(expected, actual);
		System.out.println("Test MultiplyNumbersIntInt finished");
	}
	
	/**
	 * 
	 */
	@Test
	void testMultiplyNumbersIntIntInt() {
		System.out.println("About to test multiplyNumbers(int, int, int) ");
		int expected = -48;
		int actual = nc.multiplyNumbers(num1, num2, num3);
		assertEquals(expected, actual);
		System.out.println("Test MultiplyNumbersIntIntInt finished");
	}
	
	@Test
	void testDivide() {
		try {
			assertEquals(3.33, nc.divNumbers(10.0, 3.0), 0.1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void testDivNumbersExpectedException() {
			
		Exception exception = assertThrows(Exception.class, () -> {
			nc.divNumbers(3, 0);
		});
		
		assertEquals("Exception : attempt to div by zero", exception.getMessage());
		
	}
}
