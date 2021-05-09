package uk.ac.qub.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTopTrumpCard {

	// test data
		String nameValidLow, nameValidMid, nameValidHigh;
		String nameInvalidLow, nameInvalidHigh;
		String bioInvalid;
		Category category1, category2;
		int intValidLow, intValidMid, intValidHigh;
		int intInvalidLow, intInvalidHigh;
		TopTrumpCard card;
		
		

		/**
		 * @throws java.lang.Exception
		 */
		@BeforeEach
		void setUp() throws Exception {
			nameValidLow = "1";
			nameValidMid = "12345";
			nameValidHigh = "123456789123456789123456789130";
			nameInvalidLow = "";
			nameInvalidHigh = "1234567891234567891234567891301";
			bioInvalid = null;
			category1 = Category.HERO;
			category2 = Category.VILLAIN;
			intValidLow = 0;
			intValidMid = 50;
			intValidHigh = 100;
			intInvalidLow = -1;
			intInvalidHigh = 101;
			
			card = new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			
		}

		/**
		 * Test method for {@link p3.TopTrumpCard#TopTrumpCard(java.lang.String, java.lang.String, java.lang.String, p3.Category, int, int, int, int, java.lang.String)}.
		 */
		// test happy path for valid constructor
		@Test
		void testValidConstructor() {
			TopTrumpCard card2 = new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			assertEquals(nameValidLow, card2.getName());
			assertEquals(nameValidLow, card2.getRealName());
			assertEquals(nameValidMid, card2.getImageFileName());
			assertEquals(category1, card2.getCategory());
			assertEquals(intValidLow, card2.getSpeed());
			assertEquals(intValidLow, card2.getStrength());
			assertEquals(intValidLow, card2.getAgility());
			assertEquals(intValidLow, card2.getIntelligence());
			assertEquals(nameValidLow, card2.getBio());
		}
		
		@Test
		void testInvalidConstructor() {
			Exception exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid name
				new TopTrumpCard(nameInvalidLow, nameValidMid, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid real name
				new TopTrumpCard(nameValidLow, nameInvalidLow, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid image file name
				new TopTrumpCard(nameValidLow, nameValidLow, nameInvalidLow, category1, intValidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid speed
				new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intInvalidLow, intValidLow, intValidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid strength
				new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intInvalidLow, intValidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid agility
				new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intValidLow, intInvalidLow, intValidLow, nameValidLow);
			});
			exp = assertThrows(IllegalArgumentException.class, ()-> {
				// invalid intelligence
				new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intInvalidLow, nameValidLow);
			});
			exp = assertThrows(NullPointerException.class, ()-> {
				// invalid bio
				new TopTrumpCard(nameValidLow, nameValidLow, nameValidMid, category1, intValidLow, intValidLow, intValidLow, intValidLow, bioInvalid);
			});
			
		}
		/**
		 * Test method for {@link p3.TopTrumpCard#getName()}.
		 */
		// test happy path for name
		@Test
		void testGetSetName() {
			card.setName(nameValidLow);
			assertEquals(nameValidLow, card.getName());
			
			card.setName(nameValidMid);
			assertEquals(nameValidMid, card.getName());
			
			card.setName(nameValidHigh);
			assertEquals(nameValidHigh, card.getName());
		}
		
		@Test
		void testGetSetInvalidName() {
			String expectedMessage = "Invalid name length";
			Exception exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setName(nameInvalidLow);
			});
			assertEquals(expectedMessage, exp.getMessage());
			
			exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setName(nameInvalidHigh);
			});
			assertEquals(expectedMessage, exp.getMessage());
		}
		

		/**
		 * Test method for {@link p3.TopTrumpCard#getRealName()}.
		 */
		@Test
		void testGetSetRealName() {
			card.setRealName(nameValidLow);
			assertEquals(nameValidLow, card.getRealName());
			
			card.setRealName(nameValidMid);
			assertEquals(nameValidMid, card.getRealName());
			
			card.setRealName(nameValidHigh);
			assertEquals(nameValidHigh, card.getRealName());
		}
		
		@Test
		void testGetSetInvalidRealName() {
			String expectedMessage = "Invalid real name length";
			Exception exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setRealName(nameInvalidLow);
			});
			assertEquals(expectedMessage, exp.getMessage());
			
			exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setRealName(nameInvalidHigh);
			});
			assertEquals(expectedMessage, exp.getMessage());
		}

		/**
		 * Test method for {@link p3.TopTrumpCard#getImageFileName()}.
		 */
		@Test
		void testGetSetImageFileName() {
			
			card.setImageFileName(nameValidMid);
			assertEquals(nameValidMid, card.getImageFileName());
			
			card.setImageFileName(nameValidHigh);
			assertEquals(nameValidHigh, card.getImageFileName());
		}
		
		@Test
		void testGetSetInvalidImageFileName() {
			String expectedMessage = "Invalid image file name length";
			Exception exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setImageFileName(nameInvalidLow);
			});
			assertEquals(expectedMessage, exp.getMessage());
			
			exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setImageFileName(nameInvalidHigh);
			});
			assertEquals(expectedMessage, exp.getMessage());
		}

		/**
		 * Test method for {@link p3.TopTrumpCard#getCategory()}.
		 */
		// category is Enum so only has happy path to test
		@Test
		void testGetSetCategory() {
			card.setCategory(category1);
			assertEquals(category1, card.getCategory());
			
			card.setCategory(category2);
			assertEquals(category2, card.getCategory());
		}

		/**
		 * Test method for {@link p3.TopTrumpCard#getSpeed()}.
		 */
		@Test
		void testGetSetSpeed() {
			card.setSpeed(intValidLow);
			assertEquals(intValidLow, card.getSpeed());
			
			card.setSpeed(intValidMid);
			assertEquals(intValidMid, card.getSpeed());
			
			card.setSpeed(intValidHigh);
			assertEquals(intValidHigh, card.getSpeed());
		}

		@Test
		void testGetSetInvalidSpeed() {
			String expectedMessage = "Invalid speed";
			Exception exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setSpeed(intInvalidLow);
			});
			assertEquals(expectedMessage, exp.getMessage());
			
			exp = assertThrows(IllegalArgumentException.class, () -> {
				card.setSpeed(intInvalidHigh);
			});
			assertEquals(expectedMessage, exp.getMessage());
		}

		/**
		 * Test method for {@link p3.TopTrumpCard#getBio()}.
		 */
		@Test
		void testGetSetBio() {
			card.setBio(nameValidLow);
			assertEquals(nameValidLow, card.getBio());
			
			card.setBio(nameValidHigh);
			assertEquals(nameValidHigh, card.getBio());
			
		}
		
		@Test
		void testGetSetInvalidBio() {
			String expectedMessage = "Invalid bio length";
			Exception exp = assertThrows(NullPointerException.class, () -> {
				card.setBio(null);
			});
			assertEquals(expectedMessage, exp.getMessage());
		}


}
