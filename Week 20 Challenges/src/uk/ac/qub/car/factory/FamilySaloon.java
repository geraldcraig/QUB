/**
 * 
 */
package uk.ac.qub.car.factory;

/**
 * @author Gerald
 *
 */
public class FamilySaloon extends Car {
	
	private boolean metallicPaint;
	
	/**
	 * default constructor
	 */
	public FamilySaloon () {
		
	}
	
	/**
	 * @param make
	 * @param model
	 * @param horsepower
	 */
	public FamilySaloon(String make, String model, int horsepower, boolean metallicPaint) {
		super(make, model, horsepower);
		this.metallicPaint = metallicPaint;
		
	}

	@Override
	public void displayAll() {
		System.out.println("Family Saloon");
		super.displayAll();
		System.out.println("Metallic paint \t:" + this.metallicPaint);
	}

	/**
	 * @return the metallicPaint
	 */
	public boolean isMetallicPaint() {
		return metallicPaint;
	}

	/**
	 * @param metallicPaint the metallicPaint to set
	 */
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}

}
