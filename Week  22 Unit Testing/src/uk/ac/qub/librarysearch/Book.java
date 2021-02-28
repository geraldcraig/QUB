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
	 * The autor of the book
	 */
	private String author;

	/**
	 * The title of the book
	 */
	private String title;

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
