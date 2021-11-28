package uk.ac.qub.librarysearch;

import static org.junit.Assert.assertThrows;

/**
 * Book class - represents a book in the system
 * 
 * @author amcgowan
 */
public class Book {

	/**
	 * The book's ISBN
	 */
	private String ISBN;

	/**
	 * The author of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;
	
	private int rating;
	
	/**
	 * Default constructor
	 */
	public Book() {

	}
	
	public Book(String iSBN, String author, String title, int rating) {
		setISBN(iSBN);
		setAuthor(author);
		setTitle(title);
		setRating(rating);
	}

	/**
	 * Gets the ISBN number
	 * 
	 * @return
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the ISBN number
	 * 
	 * @param iSBN
	 *            10 or 13 chars
	 * @throws Exception 
	 */
	public void setISBN(String iSBN) throws IllegalArgumentException {
		if (iSBN.length() == 10 || iSBN.length() == 13) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException();
		}	
	}

	/**
	 * Get the book's author
	 * 
	 * @return
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the book's author
	 * 
	 * @param author
	 */
	public void setAuthor(String author) throws IllegalArgumentException {
		if (author.length() < 1) {
			throw new IllegalArgumentException("Invalid author length");
		} else {
			this.author = author;
		}			
	}

	/**
	 * Gets the book's title
	 * 
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the books title
	 * 
	 * @param title
	 */
	public void setTitle(String title) throws IllegalArgumentException {
		if (title.length() < 1) {
			throw new IllegalArgumentException("Invalid title length");
		} else {
			this.title = title;
		}	
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if (rating < 1 || rating > 5) {
			throw new IllegalArgumentException("Invalid rating");
		} else {
			this.rating = rating;
		}
	}

	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ", rating=" + rating + "]";
	}
	
	
	
}
