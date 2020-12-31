/**
 * 
 */
package uk.ac.qub.inheritance.example;

/**
 * @author Gerald
 *
 */
public class Doctor extends Staffmember {
	
	private int ward;

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}

	@Override
	public String toString() {
		return "Doctor [ward=" + ward + ", FirstName=" + getFirstName() + ", Lastname=" + getLastname() + "]";
	}
	
	

}
