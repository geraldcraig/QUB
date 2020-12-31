/**
 * 
 */
package uk.ac.qub.poly;

/**
 * @author Gerald
 *
 */
public class Dog extends Animal {
	
	private int licenseNumber;
	
	

	/**
	 * @return the licenseNumber
	 */
	public int getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	@Override
	public void makeANoise() {
		System.out.println("Dog makes a Bark !");
	}

}
