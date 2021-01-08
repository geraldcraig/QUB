/**
 * 
 */
package uk.ac.qub.review.exercise;

/**
 * @author Gerald
 *
 */
public class RunLyrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create the dog
		Animal dog = new Animal();
		dog.setName("Dog");
		dog.setNoise("WOOF");
		
		Animal cat = new Animal();
		cat.setName("Cat");
		cat.setNoise("MEOW");
		
		Animal bird = new Animal();
		bird.setName("Bird");
		bird.setNoise("SQUEAK");
		
		Animal mouse = new Animal();
		mouse.setName("Mouse");
		mouse.setNoise("SQUEAK");
		
		Animal fox = new Animal();
		fox.setName("Fox");
		fox.setNoise("Ring-ding-ding-ding-dingeringeding!");
		fox.setEyeColour("BLUE");
		fox.setNoseType("POINTY");
		fox.setPawSize("TINY");
		fox.setFurColour("RED");
				
		// output lyrics
		System.out.print(dog.getName());
		System.out.print(" goes ");
		dog.makeNoise();
		
		System.out.print(cat.getName());
		System.out.print(" goes ");
		cat.makeNoise();
		
		System.out.print(bird.getName());
		System.out.print(" goes ");
		bird.makeNoise();
		
		System.out.print(mouse.getName());
		System.out.print(" goes ");
		mouse.makeNoise();
		
		System.out.println("But there's one sound that no one knows...");
		System.out.println("WHAT DOES THE FOX SAY?");
		fox.makeNoise();
		fox.makeNoise();
		fox.makeNoise();
		System.out.println("Big " + fox.getEyeColour() + " eyes");
		System.out.println(fox.getNoseType() + " nose");
		System.out.println(fox.getPawSize() + " paws");
		System.out.println("your fur is " + fox.getFurColour());
		System.out.println("WHAT DOES THE FOX SAY?");
		fox.makeNoise();
		fox.makeNoise();
		fox.makeNoise();

	}

}
