/**
 * 
 */
package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberCruncherTest {

	// test data
	int num1;
	int num2;
	int num3;
	NumberCruncher nc;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		num1 = 2;
		num2 = 4;
		num3 = -6;
		nc = new NumberCruncher();
	}

	@Test
	void testAddNumbersIntInt() {
		System.out.println("About to test addNumbers(int, int) ");

		int expected = 6;
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
		System.out.println("Test AddNumbersIntInt finished");
	}

	@Test
	void testAddNumbersIntIntInt() {
		System.out.println("About to test addNumbers(int, int, int) ");

		int expected = 0;
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
		System.out.println("Test AddNumbersIntIntInt finished");
	}

	@Test
	void testMultiplyNumbersIntInt() {
		System.out.println("About to test multiplyNumbers(int, int) ");
		int expected = 8;
		int actual = nc.multiplyNumbers(num1, num2);
		assertEquals(expected, actual);
		System.out.println("Test MultiplyNumbersIntInt finished");
	}

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
		System.out.println("Test divide by zero: " + exception.getMessage());
		String expectedMessage = "Exception : attempt to div by zero";

		assertEquals(expectedMessage, exception.getMessage());
	}

	@Test
	void testDoubleUp() {
		int seed = 2;
		int number = 4;
		int[] expected = { 2, 4, 8, 16 };

		NumberCruncher nc = new NumberCruncher();
		int[] actual = nc.doubleUp(seed, number);

		System.out.println(Arrays.toString(actual));
		boolean match = true;
		// checking the values of the actual are the same as the expected
		for (int i = 0; i < expected.length; i++) {
			if (expected[i] == actual[i]) {
				match = true;
			} else {
				// not a match
				match = false; // set flag to false
				break; // leaving the loop
			}
		}
		// overall result
		assertTrue(match);
	}

}
