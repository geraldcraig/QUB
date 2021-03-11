package uk.ac.qub.librarysearch.solution;

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
	 * The autor of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

	/**
	 * The books rating 1-5
	 */
	private int rating;
	
	

	/**
	 * Default constructor
	 */
	public Book() {

	}

	/**
	 * Book creation
	 * 
	 * @param iSBN
	 *            - 10 or 13 chars
	 * @param author
	 *            - at least 1 char
	 * @param title
	 *            - at least 1 char
	 * @param rating
	 *            - 1 ot 5
	 */
	public Book(String iSBN, String author, String title, int rating) {
		this.setISBN(iSBN);
		this.setAuthor(author);
		this.setTitle(title);
		this.setRating(rating);
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
	public void setISBN(String iSBN) throws IllegalArgumentException  {
		// note could be constants here for the ISBN value limits
		if ((iSBN.length() == 10) || (iSBN.length() == 13)) {
			this.ISBN = iSBN;
		} else {
			throw new IllegalArgumentException("Invalid ISBN");
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

		if (author.length() > 0) {
			this.author = author;
		} else {
			throw new IllegalArgumentException("Author name no legal");
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
		if (title.length() > 0) {
			this.title = title;
		} else {
			throw new IllegalArgumentException("Not legal title");
		}
		
	}

	/**
	 * Get the book rating
	 * 
	 * @return the rating 1-5
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Sets the books rating
	 * 
	 * @param rating 1- 5
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		// note could be constants here for the rating value limits
		if ((rating > 0) && (rating < 6)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Outside range for rating");
		}
	}
}
