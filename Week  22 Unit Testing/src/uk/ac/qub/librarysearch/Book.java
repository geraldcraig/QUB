package uk.ac.qub.librarysearch;

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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		if (rating < 1 && rating > 5) {
			System.err.println("invalid rating");
		} else {
			this.rating = rating;
		}
	}


	/**
	 * The title of the book
	 */
	private String title;
	
	/**
	 * The rating of the book
	 */
	private int rating;

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
	public void setISBN(String iSBN)  {
		
			this.ISBN = iSBN;
		
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
	public void setAuthor(String author)  {

		
			this.author = author;
		
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
		
			this.title = title;
		
	}
	
	
	/**
	 * Default constructor
	 */
	public Book() {

	}

	
}
