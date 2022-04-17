package Code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSwitcher {

	// test data
	String jan="Jan";
	String feb="Feb";
	String unknown="unknown";
	// etc
	
	@Before
	public void setUp() throws Exception {
		jan="Jan";
		feb="Feb";
		unknown="unknown";
	}

	@Test
	public void testMonthNameToNumberJan() {

		Switcher switcher = new Switcher();
		int actual = switcher.monthNameToNumber(jan);
		assertEquals(1, actual);

	}
	
	@Test
	public void testMonthNameToNumberFeb() {

		Switcher switcher = new Switcher();
		int actual = switcher.monthNameToNumber(feb);
		assertEquals(2, actual);

	}
	
	@Test
	public void testMonthNameToNumberUnknown() {

		Switcher switcher = new Switcher();
		int actual = switcher.monthNameToNumber(unknown);
		assertEquals(-1, actual);

	}

}
