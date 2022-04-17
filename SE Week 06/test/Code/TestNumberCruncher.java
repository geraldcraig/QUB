package Code;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class TestNumberCruncher {

	// test data
	int num1, num2, num3;
	NumberCruncher numberCruncher;

	@Before
	public void setUp() throws Exception {
		// initialise data
		num1 = 2;
		num2 = 4;
		num3 = 6;
		// create the class
		numberCruncher = new NumberCruncher();
	}

	@Test
	public void testAddNumbersIntInt() {

		int expected = num1 + num2;

		numberCruncher = new NumberCruncher();
		int actual = numberCruncher.addNumbers(num1, num2);

		assertEquals(expected, actual);
	}

	@Test
	public void testAddNumbersIntIntInt() {
		int expected = num1 + num2 + num3;

		numberCruncher = new NumberCruncher();
		int actual = numberCruncher.addNumbers(num1, num2, num3);

		assertEquals(expected, actual);
	}

	@Test
	public void testMultiNumbersIntInt() {

		int expected = num1 * num2;

		int actual = numberCruncher.multiNumbers(num1, num2);

		assertEquals(expected, actual);
	}

}
