package test;

public class Construct {
	
	String firstName;
	String lastname;
	int age;
	
	
	public Construct(String firstName, String lastname, int age) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Construct [firstName=" + firstName + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	

}
