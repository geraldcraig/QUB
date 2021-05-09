package test;

public class ConstructTest {

	public static void main(String[] args) {
		Construct c1 = new Construct("Gerald", "Craig", 57);
		Construct c2 = new Construct("Alison", "Craig", 53);
		System.out.println(c1);
		System.out.println(c2);
		
		Construct c3 = new Construct();
		
		System.out.println(c3);

	}

}
