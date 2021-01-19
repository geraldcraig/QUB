/**
 * 
 */
package uk.ac.qub.enumdemo;

import java.util.ArrayList;

/**
 * @author Gerald
 *
 */
public class Bookstore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book b1 = new Book("Little Engine that Could", -8.99, Genre.CHILDRENS);
		Book b2 = new Book("Java Dummies", 17.99, Genre.EDUCATION);
		Book b3 = new Book("Janye Eyre", 5.99, Genre.CLASSIC);
		Book b4 = new Book("very Hungry Caterpiller", 5.99, Genre.CHILDRENS);
		
		ArrayList<Book> bookstock = new ArrayList<Book>();
		
		bookstock.add(b1);
		bookstock.add(b2);
		bookstock.add(b3);
		bookstock.add(b4);
		bookstock.add(new Book("", 9.99, Genre.valueOf("EDUCATION")));
		
		findByCategory(bookstock, Genre.EDUCATION);
		
	}
		
		public static void findByCategory(ArrayList<Book> list, Genre gen) {
			
			for (Book thebook : list) {
				//System.out.println(thebook.getTitle() + " Price: £" + thebook.getPrice());
				if (thebook.getGenre() == gen ) {
				System.out.println(thebook.bookDetails() + " GENRE: " + thebook.getGenre());
				
				}
			}
		
		}
		
		//System.out.println(bookstock.get(3).getTitle() + " Price: £" + bookstock.get(3).getPrice());


	}


