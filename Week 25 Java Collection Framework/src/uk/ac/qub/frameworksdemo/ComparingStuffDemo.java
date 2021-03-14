package uk.ac.qub.frameworksdemo;

public class ComparingStuffDemo {

	public static void main(String[] args) {
		
		Integer myInt = 6;
		Integer myOtherInt = 16;
		
		System.out.println(myInt.compareTo(myOtherInt));
		System.out.println(myOtherInt.compareTo(myInt));
		System.out.println(myInt.compareTo(myInt));
		
		String fname = "Gerald";
		String surname = "Craig";
		
		System.out.println(fname.compareTo(surname));
		System.out.println(surname.compareTo(fname));
		System.out.println(fname.compareTo(fname));
		
		Person p1 = new Person("Alison", "Craig");
		Person p2 = new Person("Alison", "Smyth");
		
		System.out.println("Compring name (of Person objects): " + p1.compareTo(p2));
		
		
		


	}

}
