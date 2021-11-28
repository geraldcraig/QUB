/**
 * 
 */
package mathsforkids;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author geraldcraig
 *
 */
class TestGuessANumber {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testRoundToTenDown() {
		int testNumber = 123;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToTen(testNumber);
		int expected = 120;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRoundToTenUp() {
		int testNumber = 126;
		GuessANumberGame guessGame = new GuessANumberGame();
		int actual = guessGame.roundToTen(testNumber);
		int expected = 130;
		
		assertEquals(expected, actual);
		
	}

}
