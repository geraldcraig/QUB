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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(5);
		r1.setWidth(3);
		r1.setShapeName("Rectangle");
		
		System.out.println(r1.calculateArea());
		System.out.println(r1.calculatePerimeter());
		System.out.println(r1.getShapeName());
		
		// array to hold shapes of all three types
		IMyShape myShape[] = new IMyShape[NUMBER_OF_SHAPES];
		
		// create random number generator
		Random generator = new Random();
		
		int temp = 0;
		
		// randomly create the shapes and store in array
		for (int i = 0; i < NUMBER_OF_SHAPES; i++) {
			temp = generator.nextInt(3);
			switch (temp) {
			case 0 : myShape[i] = new MyCircle(generator.nextDouble() * generator.nextInt(10));
					break;
			case 1 : myShape[i] = new MySquare(generator.nextDouble() * generator.nextInt(10));
					break;
			case 2 : myShape[i] = new MyRectangle(generator.nextDouble() * generator.nextInt(10), 
					generator.nextDouble() * generator.nextInt(10));
			}	
		}
		
		for (IMyShape shape : myShape) {
			System.out.println(shape.getShapeName());
		}
	}

}
