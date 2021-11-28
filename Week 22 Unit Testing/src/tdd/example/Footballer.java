/**
 * 
 */
package tdd.example;

/**
 * @author Gerald
 *
 */
public class Footballer {
	
	private int age;
	
	public Footballer() {
		
	}

	public void setAge(int age) throws IllegalArgumentException {
		if ( age >= 16 && age <= 40) {
		this.age = age;
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public int getAge() {
		return age;
	}

}
