/**
 * 
 */
package uk.ac.qub.librarysearch;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uk.ac.qub.librarysearch.solution.Book;
import uk.ac.qub.librarysearch.solution.LibrarySearch;

/**
 * @author Gerald
 *
 */
class LibrarySearchTest {
	Book bk1, bk2;
	String author, title, ISBN;
	int rating;
	
	ArrayList<Book> arrayList;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		author = "author";
		title = "title";
		ISBN = "0123456789";
		rating = 3;
		
		bk1 = new Book(ISBN, author, title, rating);
		
		arrayList = new ArrayList<Book>();
		
		arrayList.add(bk1);
	}

	@Test
	public void testSearchByTitle() {

		ArrayList<Book> results =  LibrarySearch.searchByTitle(arrayList, title);
		
		if (results.contains(bk1)){
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

}
