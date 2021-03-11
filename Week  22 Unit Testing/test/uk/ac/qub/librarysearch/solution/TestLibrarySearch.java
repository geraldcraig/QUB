package uk.ac.qub.librarysearch.solution;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TestLibrarySearch {
 
	// Test data structures - books, etc
	
	// some books
	Book b1, b2, b3;
	
	String authorB1, authorB2, authorB3;
	String ISBNB1, ISBNB2, ISBNB3;
	
	String titleB1, titleB2, titleB3;
	
	int ratingB1, ratingB2, ratingB3;
	
	// the arraylist of books structure
	ArrayList<Book> arrayList ; 
	
	@BeforeEach
	public void setUp() throws Exception {
		// create some books with test data
		authorB1 = "B1Author";
		authorB2 = "B2Author"; 
		authorB3 = "B3Author";
		
		titleB1 = "B1Title";
		titleB2 = "B2Title";
		titleB3 = "B3Title";
		
		ISBNB1 = "ISBNB1AAAA";
		ISBNB2 = "ISBNB2AAAA";
		ISBNB3 = "ISBNB3AAAA";
		
		
		ratingB1 = 1;
		ratingB2 = 1;
		ratingB3 = 3;
		
 		// create the test book objects
		b1 = new Book(ISBNB1, authorB1, titleB1, ratingB1);
		b2 = new Book(ISBNB2, authorB2, titleB2, ratingB2);
		b3 = new Book(ISBNB3, authorB3, titleB3, ratingB3);
		
		// create the array list of books
		arrayList = new ArrayList<Book>(); 
		
		// add the book to the list
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);
	}

	

	@Test
	public void testSearchByTitle() {

		ArrayList<Book> results =  LibrarySearch.searchByTitle(arrayList, titleB1);
		
		if (results.contains(b1)){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void testSearchByAuthor() {
		
		ArrayList<Book> results =  LibrarySearch.searchByAuthor(arrayList,authorB1);
		
		if (results.contains(b1)){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
	}

	@Test
	public void testSearchByISBN() {
		
		ArrayList<Book> results =  LibrarySearch.searchByISBN(arrayList,ISBNB2);
		
		if (results.contains(b2)){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
	}

	@Test
	public void testSearchByRating() {
		
		ArrayList<Book> results =  LibrarySearch.searchByRating(arrayList,1);
		
		if ((results.contains(b1)) && (results.contains(b2))){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
