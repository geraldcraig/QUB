/**
 * 
 */
package uk.ac.qub.shapes;

import java.util.Random;

/**
 * @author Gerald
 *
 */
public class MyController {

	private static final int NUMBER_OF_SHAPES = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// array to hold shapes of all three types
		IMyShape myShape[] = new IMyShape[NUMBER_OF_SHAPES];
		
		// create random number generator
		Random generator = new Random();
		
		int temp = 0;
		
		// randomly create the shapes and store in array
		for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
			temp = generator.nextInt(3);
			switch (temp) {
			case 0 : myShape[i] = new Circle(generator.nextDouble() * generator.nextInt(10));
					break;
			case 1 : myShape[i] = new Square(generator.nextDouble() * generator.nextInt(10));
					break;
			case 2 : myShape[i] = new Rectangle(generator.nextDouble() * generator.nextInt(10), 
					generator.nextDouble() * generator.nextInt(10));
			}	
		}
		System.out.println();
		for (IMyShape shape : myShape) {
			System.out.print(shape.getShapeName());
			System.out.printf(" Area : %.2f", shape.calculateArea());
			System.out.printf(" Perimeter : %.2f", shape.calculatePerimeter());
			System.out.println();
		}
	}

}
