/**
 * 
 */
package uk.ac.qub.enumdemo;

/**
 * @author Gerald
 *
 */
public class Book {
	
	private String title;
	private double price;
	private Genre genre;
	
	
	
	public Book() {
		
	}
	
	
	/**
	 * @param title
	 * @param price
	 * @param genre
	 */
	public Book(String title, double price, Genre genre) {
		this.title = title;
		this.price = price;
		this.genre = genre;
	}


	public String bookDetails() {
		return getTitle() + " " +  " Price: £" + getPrice();
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if (title.length()< 1) {
			this.title = "INVALID TITLE";
		} else {
		this.title = title;
		}
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price < 0) {
			System.err.println("Can't have negative price, setting to default value");
			this.price = 0;
		} else {
		this.price = price;
		}
	}


	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}


	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
