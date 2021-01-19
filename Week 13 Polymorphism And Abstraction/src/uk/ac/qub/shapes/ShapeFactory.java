/**
 * 
 */
package uk.ac.qub.shapes;

/**
 * @author geraldcraig
 *
 */
public class ShapeFactory {
	
	public static void calculateArea(Shape s) {
		s.area();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape = new Shape();
		Shape c = new Circle(3.1);
		
		calculateArea(c);
		
		

	}

}
