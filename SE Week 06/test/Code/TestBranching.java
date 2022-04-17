package Code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBranching {

	// test data
	int a, b, actual;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBiggestAisBiggest() {
		 
		a = 999;
		b=1;
		
		Branching branching = new Branching();
		actual = branching.biggest(a, b);
		
		assertEquals(a, actual);
		
	}

	
	@Test
	public void testBiggestBisBiggest() {
		 
		a = 1;
		b=999;
		
		Branching branching = new Branching();
		actual = branching.biggest(a, b);
		
		assertEquals(b, actual);
		
	}
	
	
	@Test
	public void testBiggestSame() {
		 
		a = 1;
		b=  1;
		
		Branching branching = new Branching();
		actual = branching.biggest(a, b);
		
		assertEquals(-1, actual);
		
	}
	
}
