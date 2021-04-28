package uk.ac.qub.jcf.slides;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Niamh");
		e1.setAge(30);
		
		Employee e2 = new Employee();
		e2.setName("Claire");
		e2.setAge(40);
		
		Employee e3 = new Employee();
		e3.setName("Una");
		e3.setAge(20);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Unsorted list");
		viewAll(list);
		
		System.out.println();
		
		Collections.sort(list, new CompareEmployeeName());
		System.out.println("Sorted by name");
		viewAll(list);
		
		System.out.println();
		
		Collections.sort(list, new CompareEmployeeNameReversed());
		System.out.println("Reverse sorted by name");
		viewAll(list);
		
	}

	public static void viewAll(List<Employee> list) {
		for (Employee e : list) {
			System.out.print(e.getName() + " ");
			System.out.println(e.getAge());
		}	
	}

}
