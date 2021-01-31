/**
 * 
 */
package uk.ac.qub.car.factory;

/**
 * @author Gerald
 *
 */
public class F1 extends Car {
	
	private double area;
	
	/**
	 * default constructor
	 */
	public F1() {
	}

	/**
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public F1(String make, String model, int horsepower, double area) {
		super(make, model, horsepower);
		this.area = area;
	}

	@Override
	public void displayAll() {
		System.out.println("F1");
		super.displayAll();
		System.out.println("Area \t:" + this.area);
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

}
