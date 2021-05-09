package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConstruct {
	Construct c1;
	String fName;

	@BeforeEach
	void setUp() throws Exception {
		fName = "";
		c1 = new Construct();
		
	}

	@Test
	void testGetFirstName() {
		c1.setFirstName(fName);
		assertEquals(fName, c1.getFirstName());
	}

	

}
