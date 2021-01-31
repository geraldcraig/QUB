/**
 * 
 */
package uk.ac.qub.shapes;

/**
 * @author Gerald
 *
 */
public class Square implements IMyShape {
	
	private double length;
	private String shapeName;
	
	public Square() {
	}
	
	public Square(double length) {
		this.length = length;
		this.shapeName = "Square";
	}

	public double calculatePerimeter() {
		double perimeter = length * 4;
		return perimeter;
	}

	public double calculateArea() {
		double area = length * length;
		return area;
	}

	public String getShapeName() {
		return shapeName;
	}

}
