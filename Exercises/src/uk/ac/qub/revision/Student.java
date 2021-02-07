package uk.ac.qub.revision;

public class Student {
	private int stuNum;
	private String name;
	private String lab;
	
	public Student() {
		
	}

	/**
	 * @param stuNum
	 * @param name
	 * @param lab
	 */
	public Student(int stuNum, String name, String lab) {
		this.stuNum = stuNum;
		this.name = name;
		this.lab = lab;
	}

	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", lab=" + lab + "]";
	}

	/**
	 * @return the stuNum
	 */
	public int getStuNum() {
		return stuNum;
	}

	/**
	 * @param stuNum the stuNum to set
	 */
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lab
	 */
	public String getLab() {
		return lab;
	}

	/**
	 * @param lab the lab to set
	 */
	public void setLab(String lab) {
		this.lab = lab;
	}

	

	
}
