package uk.ac.qub.librarysearch;

public class BookTest {

	public static void main(String[] args) {
		Book bk1 = new Book("1234567890", "Alison", "Title", 1);
		Book bk2 = new Book("1234567890123", "a", "t", 5);
		
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());

	}

}
