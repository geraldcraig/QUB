package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQComparatorDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Matthew", 35, "FT");
		Employee e2 = new Employee("Alice", 25, "PT");
		Employee e3 = new Employee("Bob", 42, "FT");
		Employee e4 = new Employee("Zach", 18, "PT");
		
		List<Employee> empList = new ArrayList<Employee>();
		
		
		//Queue<Employee> staff = new PriorityQueue<Employee>(new CompareEmployeeByAge());
		//Queue<Employee> staff = new PriorityQueue<Employee>(new CompareEmployeeByName());
		Queue<Employee> staff = new PriorityQueue<Employee>(new CompareEmpStatus());
		
		
		staff.add(e1);
		staff.add(e2);
		staff.add(e3);
		staff.add(e4);
		
		while (!staff.isEmpty()) {
			System.out.println(staff.poll());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
