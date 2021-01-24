/**
 * 
 */
package uk.ac.qub.exercise3;

/**
 * @author Gerald
 *
 */
public class Reader extends Employee implements IPayable {
	
	private String researchArea;

	/**
	 * @return the resaerchArea
	 */
	public String getResaerchArea() {
		return researchArea;
	}

	/**
	 * @param resaerchArea the resaerchArea to set
	 */
	public void setResaerchArea(String resaerchArea) {
		this.researchArea = resaerchArea;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Reasearch area : " + this.researchArea);
	}

	@Override
	public double payWage(double hrs, double rate)  {
		return hrs * rate;
	}

	
}
