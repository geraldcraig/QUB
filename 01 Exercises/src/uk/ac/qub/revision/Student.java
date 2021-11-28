package uk.ac.qub.revision;

public abstract class Student {
	
	private int sNum;
	private String fname;
	private String lname;
	
	public Student() {
		
	}

	public Student(int sNum, String fname, String lname) {
		this.sNum = sNum;
		this.fname = fname;
		this.lname = lname;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
