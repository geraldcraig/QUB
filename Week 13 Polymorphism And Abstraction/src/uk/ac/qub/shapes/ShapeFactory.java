/**
 * 
 */
package uk.ac.qub.shapes;

/**
 * @author geraldcraig
 *
 */
public class ShapeFactory {
	

	public static void main(String[] args) {
		Shape shape = new Shape();
		
		Shape c = new Circle(3.1);
		
		calculateArea(c);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = shape;
		//shapes[1] = r;
		shapes[2] = c;
		
		
		

	}

	public static void calculateArea(Shape c) {
		
		c.area();	
	}
	
	public static void calculateArea(Shape[] shapes) {
		for (Shape c : shapes) {
			if (c != null) {
				c.area();
			}
		}
	}

}
