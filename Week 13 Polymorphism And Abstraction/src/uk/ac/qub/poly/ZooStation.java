/**
 * 
 */
package uk.ac.qub.poly;

/**
 * @author Gerald
 *
 */
public class ZooStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Lion lion = new Lion();
		
		animal.makeANoise();
		dog.makeANoise();
		lion.makeANoise();
		
		// Create a polymorphic array - and add animal types
		Animal[] animals = new Animal[3];
		animals[0] = dog;
		animals[1] = lion;
		animals[2] = animal;
		
		// cycle through the array
		for (Animal a : animals) {
			// the correct method is called
			a.makeANoise();
		}
		
		drDoLittle(dog);
		drDoLittle(lion);
		drDoLittle(animal);
	
	}
	
	public static void drDoLittle(Animal animal) {
		animal.makeANoise();
		
	}

}
