/**
 * 
 */
package uk.ac.qub.exercise3;

/**
 * @author Gerald
 *
 */
public class Student extends Employee {
	
	private int studentNumber;

	/**
	 * @return the studentNumber
	 */
	public int getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public void displayAll() {
		super.displayAll();
		System.out.println("Student number : " + this.studentNumber);
	}

	
}
