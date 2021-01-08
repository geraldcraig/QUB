/**
 * 
 */
package uk.ac.qub.amazon.app;

/**
 * @author Gerald
 *
 */
public class AmazonWebApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a book
				AmazonBook book1 = new AmazonBook();
				book1.setAuthor("Bill Bryson");
				book1.setRating(4);
				book1.setIsbn("0857522418");
				book1.setLanguage("English");
				book1.setPages(464);
				book1.setPrice(14.55);
				book1.setTitle("The Body: A Guide for Occupants");

				System.out.println(book1.toString());
				
				// create another book - using constructor with args
				AmazonBook book2 = new AmazonBook("Ulysses", "James Joyce", 2.25, 736, "1840226358", 5, "English");
				System.out.println(book2.toString());
				
				/*longestBook(book1, book2);
				
				public static void longestBook(AmazonBook b1, AmazonBook b2) {
					if (b1.getPages() > b2.getPages()) {
						System.out.println(b1.getTitle() + " is longer than " + b2.getTitle()); 
						}else {
							System.out.println(b2.getTitle() + " is longer than " + b1.getTitle());
						}
						}*/
		
		
				
	}

}
