package uk.ac.qub.revision;

public class RallyCar extends Car {
	
	private double area;
	
	public RallyCar() {
		
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

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		super.displayAll();
		System.out.println("area : " + getArea());
	}
	
	

}
