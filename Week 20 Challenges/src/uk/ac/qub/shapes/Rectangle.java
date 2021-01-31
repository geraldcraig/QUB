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
	public Rectangle(double length, double width, String shapeName) {
		this.length = length;
		this.width = width;
		this.shapeName = "Rectangle";
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double calculatePerimeter() {
		
		return (length + width) * 2;
	}

	@Override
	public double calculateArea() {
		
		return length * width;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return shapeName;
	}

	/**
	 * @param shapeName the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
