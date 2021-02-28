/**
 * 
 */
package tdd.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Gerald
 *
 */
class FootballerTest {
	
	// test data
	int validAgeLower, validAgeMid, validAgeUpper, invalidLowerAge, invalidUpperAge;
	
	Footballer f;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		f = new Footballer();
		validAgeLower = 16;
		validAgeMid = 25;
		validAgeUpper = 40;
		
		invalidLowerAge = 15;
		invalidUpperAge = 41;
	}

	@Test
	void test() {
		
	}
	
	@Test
	void testValidRangetest() {
		f.setAge(validAgeLower);
		assertEquals(validAgeLower, f.getAge());
		
		f.setAge(validAgeMid);
		assertEquals(validAgeMid, f.getAge());
		
		f.setAge(validAgeUpper);
		assertEquals(validAgeUpper, f.getAge());
	}
	
	@Test
	void testInvalidAgetest() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(invalidLowerAge);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			f.setAge(invalidUpperAge);
		});
		
	}

}
