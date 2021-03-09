package uk.ac.qub.frameworksdemo;

public class Person {
	private String fname;
	private String surname;
	
	
	/**
	 * @param fname
	 * @param surname
	 */
	public Person(String fname, String surname) {
		this.fname = fname;
		this.surname = surname;
	}
	
	
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", surname=" + surname + "]";
	}


	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
