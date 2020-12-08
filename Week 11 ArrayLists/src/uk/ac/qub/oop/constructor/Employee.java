/**
 * 
 */
package uk.ac.qub.oop.constructor;

import java.util.Arrays;
import java.util.Random;

/**
 * @author geraldcraig
 *
 */
public class Employee {


	
	
		@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", surname=" + surname + ", employeeNum=" + employeeNum
				+ ", salary=" + salary + ", projectIDs=" + Arrays.toString(projectIDs) + "]";
	}
		//instance vars
		private String firstname;
		private String surname;
		private int employeeNum;
		private double salary;
		private int[] projectIDs = new int[] {111, 347, 568};
		
		private static Random rand =new Random();
		
		/**
		 * @param firstname
		 * @param surname
		 */
		public Employee(String firstname, String surname) {
			this.firstname = firstname;
			this.surname = surname;
			this.employeeNum = rand.nextInt(2000);
		}

		//constructors
		/**
		 * 
		 */
		public Employee() {
			System.out.println("employee object created");
			
		}
		
		public Employee(String firstname, String surname, int employeeNum, double salary, int[] projectIDs) {
			this.firstname = firstname;
			this.surname = surname;
			this.employeeNum = employeeNum;
			this.salary = salary;
			this.projectIDs = projectIDs;
		}
		//methods
		/**
		 * 
		 * @return
		 */
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public int getEmployeeNum() {
			return employeeNum;
		}
		public void setEmployeeNum(int employeeNum) {
			this.employeeNum = employeeNum;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		

	

}
