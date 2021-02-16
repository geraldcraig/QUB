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
		System.out.println("About to test add addNumbers(int, int)");
		
		int expected = 6;
		int actual = nc.addNumbers(num1, num2);
		
		assertEquals(expected, actual);
		
 	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {
		System.out.println("About to test add addNumbers(int, int, int)");
		
		int expected = 0;
		int actual = nc.addNumbers(num1, num2, num3);
		
		assertEquals(expected, actual); 
	}

}
