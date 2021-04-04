package uk.ac.qub.librarysearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBook {
	String validISBN10, validISBN13, invalidISBN;
	String validAuthor, invalidAuthor;
	String validTitle, invalidTitle;
	int validRatingLower, validRatingMid, validRatingUpper;
	int invalidRatingLower, invalidRatingUpper;
	Book book;

	@BeforeEach
	void setUp() throws Exception {
		validISBN10 = "1234567890";
		validISBN13 = "1234567890123";
		invalidISBN = "0";
		book = new Book();
	}

	@Test
	void testBook() {
		fail("Not yet implemented");
	}

	@Test
	void testBookStringStringStringInt() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSetISBN() {
		book.setISBN(validISBN10);
		assertEquals(validISBN10, book.getISBN());
		System.out.println("ISBN valid 10: " + book.getISBN());
		
		book.setISBN(validISBN13);
		assertEquals(validISBN13, book.getISBN());
		System.out.println("ISBN valid 13: " + book.getISBN());
	}

	@Test
	void testGetAuthor() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAuthor() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetRating() {
		fail("Not yet implemented");
	}

	@Test
	void testSetRating() {
		fail("Not yet implemented");
	}

}
