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
				
				/*longestBook(book1,book2);
				
				public static void longestBook(AmazonBook bk1, AmazonBook bk2) {
					if (bk1.getPages() > bk2.getPages()) {
						System.out.println("book 1 longer than book 2");
					} else if (bk1.getPages() < bk2.getPages()) {
						System.out.println("book 2 longer than book 1");
					} else {
						System.out.println("books are same length");
					}
					
					
				}*/
							
	}

}
