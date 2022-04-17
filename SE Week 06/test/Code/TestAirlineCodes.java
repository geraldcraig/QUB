package Code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAirlineCodes {

	// test data
	String aerLingus = "AER";
	String britishAirways = "BA";
	// etc
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAER() {
		String expected = "Aer Lingus";
		String actual;
		AirlineCodes airlineCodes = new AirlineCodes();
		actual = airlineCodes.codeToName(aerLingus);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBA() {
		String expected = "British Airways";
		String actual;
		AirlineCodes airlineCodes = new AirlineCodes();
		actual = airlineCodes.codeToName(britishAirways);
		assertEquals(expected, actual);
	}
	
	//etc

}
