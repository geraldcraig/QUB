package Code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPassChecker {

	
	// test data
	int outOfBoundsNegative, lowerInBound, upperInBound, boundaryLower;
	
	@Before
	public void setUp() throws Exception {
		outOfBoundsNegative = -12;
		boundaryLower = 50;
		// etc
	}

	@Test
	public void testCheckForPassOutOfBoundsNeg() {
		
		boolean expected = false; 
		PassChecker pc = new PassChecker();
		boolean actual = pc.checkForPass(outOfBoundsNegative);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCheckForPassOutboundaryLower() {
		
		boolean expected = true; 
		PassChecker pc = new PassChecker();
		boolean actual = pc.checkForPass(boundaryLower);
		
		assertEquals(expected, actual);
	}
	
	// etc

}
