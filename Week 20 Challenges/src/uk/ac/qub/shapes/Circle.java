/**
 * 
 */
package uk.ac.qub.shapes;

/**
 * @author Gerald
 *
 */
public class Circle implements IMyShape {
	
	private double radius;
	private String shapeName;
	
	/**
	 * default constructor
	 */
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.shapeName = "Circle";
	}


	public double calculatePerimeter() {
		double perimeter = 2 * 3.141 * radius;
		return perimeter;
	}

	public double calculateArea() {
		double area = 3.141 * radius * radius;
		return area;
	}

	public String getShapeName() {
		return shapeName;
	}

}
