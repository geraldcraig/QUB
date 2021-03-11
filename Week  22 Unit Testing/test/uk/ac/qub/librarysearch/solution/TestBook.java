package uk.ac.qub.librarysearch.solution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBook {

	// test data
	String ISBN, ISBNInValid, author, authorInvalid, title, titleInvalid;
	int rating, ratingInvalidLower, ratingInvalidUpper;

	@BeforeEach
	public void setUp() throws Exception {
		ISBN = "VALIDISBNISBN";
		ISBNInValid = "INV";
		author = "Valid Author";
		authorInvalid = "";
		title = "Valid Title";
		titleInvalid = "";
		rating = 3; // mid value EP testing - could be BVA
		ratingInvalidUpper = 6;
		ratingInvalidLower = 0;
	}

	/**
	 * Test constructor with args
	 */
	@Test
	public void testBookConstructorArgs() {
		// create the book
		Book book = new Book(ISBN, author, title, rating);

		assertEquals(author, book.getAuthor());
		assertEquals(ISBN, book.getISBN());
		assertEquals(title, book.getTitle());
		assertEquals(rating, book.getRating());
		
	}
	
	@Test
	public void testBookConstructorInvalidArgs() {
		// need to see every setter with business rules being called and exception returned for each
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBNInValid, author, title, rating);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBN, authorInvalid, title, rating);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBN, author, titleInvalid, rating);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Book b = new Book(ISBN, author, title, ratingInvalidLower);
		});
	}
	

	@Test
	void testValidAuthor() {
		Book book = new Book();
		book.setAuthor(author);
		assertEquals(author, book.getAuthor());
	}

	@Test
	void testInvalidAuthor() {
		Book book = new Book();
		assertThrows(IllegalArgumentException.class, () -> {
			book.setAuthor(authorInvalid);
		});
	}

	@Test
	void testValidISBN() {
		Book book = new Book();
		book.setISBN(ISBN);
		assertEquals(ISBN, book.getISBN());
	}

	@Test
	void testInvalidISBN() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(ISBNInValid);
		});

	}

	/**
	 * Test rating - could test at boundaries
	 */
	@Test
	void testValidRating() {
		Book book = new Book();
		book.setRating(rating);
		assertEquals(rating, book.getRating());
	}

	@Test
	void testInvalidRating() {
		Book book = new Book();

		// lower invalid test
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingInvalidLower);
		});
		// upper invalid test
		assertThrows(IllegalArgumentException.class, () -> {
			book.setRating(ratingInvalidUpper);
		});
	}
	
	
	@Test
	void testValidTitle() {
		Book book = new Book();
		book.setTitle(title);
		assertEquals(title, book.getTitle());
	}

	@Test
	void testInvalidTitle() {
		Book book = new Book();

		assertThrows(IllegalArgumentException.class, () -> {
			book.setISBN(titleInvalid);
		});

	}

}
