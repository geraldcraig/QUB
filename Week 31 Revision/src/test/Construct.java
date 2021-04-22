package test;

public class Construct {
	
	private String firstName;
	private String lastname;
	private int age;
	
	public Construct() {
		
	}
	
	public Construct(String firstName, String lastname, int age) {
		this.setFirstName(firstName);
		this.lastname = lastname;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Construct [firstName=" + getFirstName() + ", lastname=" + lastname + ", age=" + age + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
