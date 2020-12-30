/**
 * 
 */
package uk.ac.qub.practical2;

/**
 * @author geraldcraig
 *
 */
public class SimpsonsCharacter {
	
	private String name;
	private String catchPhrase;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCatchPhrase() {
		return catchPhrase;
	}
	
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	
	public void sayCatchPhrase() {
		System.out.println(this.name + " says " + this.catchPhrase);
	}

}
