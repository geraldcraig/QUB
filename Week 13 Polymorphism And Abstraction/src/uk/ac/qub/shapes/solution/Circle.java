/**
 * 
 */
package uk.ac.qub.shapes.solution;

/**
 * @author geraldcraig
 *
 */
public class Circle extends Shape {

	private double radius;
	
	/**
	 * Constructor
	 */
	public Circle() {
		
	}
	
	
	/**
	 * Constructor with args
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void area(){
		System.out.println("Circle "+ (3.14 * this.radius * 2));
	}
	
}
