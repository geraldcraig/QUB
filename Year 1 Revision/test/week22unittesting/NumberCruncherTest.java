/**
 * 
 */
package week22unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {
	// test data
	int num1;
	int num2;
	int num3;
	NumberCruncher nc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		num1 = 2;
		num2 = 4;
		num3 = 6;
		nc = new NumberCruncher();
	}

	/**
	 * Test method for {@link week22unittesting.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {
		System.out.println("About to test addNumbersIntInt");
		int expected = 6;
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
	}

	@Test
	void testAddNumbersIntIntInt() {
		System.out.println("About to test addNumbersIntIntInt");
		assertEquals(0, nc.addNumbers(2, 4, -6));
	}
	
	@Test
	void testDivNumbers() {
		System.out.println("About to test divNumbers");
		assertEquals(3.0, nc.divNumbers(9.0, 3.0));
	}
	
	@Test
	void testDivNumbersDelta() {
		System.out.println("About to test divNumbersDelta");
		assertEquals(3.3, nc.divNumbers(10.0, 3.0), 0.1);
	}
	
	@Test
	void testDivideNumbers() {
		System.out.println("About to test divideNumbers");
		try {
			assertEquals(3.333, nc.divideNumbers(10.0, 3.0), 0.001);
		} catch (Exception e) {
			e.printStackTrace();	
		}			
	}
	
	@Test
	void testDivideByZero() {
		// can use ArithmeticException, InputMismatchException etc.
		Exception exception = assertThrows(Exception.class, () -> {
			nc.divideNumbers(4, 0);	
		});
		assertEquals("Exception : attempt to div by zero", exception.getMessage());
		System.out.println(exception.getMessage());
	}

}
