package Code;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestInsuranceCal {

	// test data
	int outOfBoundsLower, outOfBoundsUpper, middle, lowBoundry, nextLowBoundary, highBoundary, nextHighBoundary;; 
	
	@Before
	public void setUp() throws Exception {
		outOfBoundsLower=17;
		lowBoundry=18;
		nextLowBoundary=19;
		middle=45;
		nextHighBoundary=59;
		highBoundary=60;
		outOfBoundsUpper=61;
	}

	@Test
	public void testOutOfBoundsLower() {
		boolean actual;
		InsuranceCal insuranceCal = new InsuranceCal();
		actual = insuranceCal.checkAgeForInsurance(outOfBoundsLower);
		assertEquals(false, actual);
	}
	
	@Test
	public void testLowBoundary() {
		boolean actual;
		InsuranceCal insuranceCal = new InsuranceCal();
		actual = insuranceCal.checkAgeForInsurance(lowBoundry);
		assertEquals(true, actual);

	}

}
