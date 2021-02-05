package uk.ac.qub.shapes.solution;

public class MyRectangle implements IMyShape {
	
	/**
	 * The length of one side
	 */
	private double length;
	private double width;
	
	/**
	 * The shape name
	 */
	private String shapeName;
	
	
	/**
	 * Default constructor
	 */
	public MyRectangle(){
	}
	
	/**
	 * Constructor with parameter
	 * @param length of one side
	 */
	public MyRectangle(double length, double width){
		this.length = length;
		this.width = width;
		this.shapeName = "Rectangle";
	}
	
	/**
	 * Calculates the area of the circle 
	 * @return the area
	 */
	public double calculateArea() {
		double area = length * width;
		return area;
	}

	/**
	 * Calculates the perimeter of the circle 
	 * @return the perimeter
	 */
	public double calculatePerimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	/**
	 * Gets the name of the shape
	 * @return the name of the shape
	 */
	public String getShapeName() {
		return shapeName;
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

}
