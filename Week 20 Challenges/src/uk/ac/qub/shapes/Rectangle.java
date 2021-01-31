/**
 * 
 */
package uk.ac.qub.shapes;

/**
 * @author Gerald
 *
 */
public class Rectangle implements IMyShape {
	
	private double length;
	private double width;
	private String shapeName;
	
	/**
	 * default constructor
	 */
	public Rectangle() {
		
	}
		
	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.shapeName = "Rectangle";
	}

	public double calculatePerimeter() {
		double perimeter = length + width + length + width;
		return perimeter;
	}

	public double calculateArea() {
		double area = length * width;
		return area;
	}

	public String getShapeName() {
		return shapeName;
	}

}
