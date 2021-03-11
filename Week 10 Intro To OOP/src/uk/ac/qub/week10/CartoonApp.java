/**
 * 
 */
package uk.ac.qub.week10;

/**
 * @author geraldcraig
 *
 */
public class CartoonApp {

	/**m
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpsonsCharacter bart = new SimpsonsCharacter();
		bart.setName("Bart");
		bart.setCatchPhrase("eat my shorts !");
		bart.sayCatchPhrase();
		
		SimpsonsCharacter homer = new SimpsonsCharacter();
		homer.setName("Homer");
		homer.setCatchPhrase("D'Oh !");
		homer.sayCatchPhrase();
		
		SimpsonsCharacter lisa = new SimpsonsCharacter();
		lisa.setName("Lisa");
		lisa.setCatchPhrase("I'll be in my room");
		lisa.sayCatchPhrase();
		
		SimpsonsCharacter nelson = new SimpsonsCharacter();
		nelson.setName("Nelson");
		nelson.setCatchPhrase("HaHa");
		nelson.sayCatchPhrase();
	}
	

}
