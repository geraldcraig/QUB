package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparisionsDriver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Matthew", 35, "FT");
		Employee e2 = new Employee("Alice", 25, "PT");
		Employee e3 = new Employee("Bob", 42, "FT");
		Employee e4 = new Employee("Zach", 18, "PT");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		//System.out.println(empList);
		viewAll(empList);
		
		
		Collections.sort(empList, new CompareEmployeeByName());
		
		viewAll(empList);
		//Comparator<Employee> c_age = new CompareEmployeeByAge();
		//System.out.println(c_age.compare(e3, e4));
		
		Collections.sort(empList, new CompareEmpNameReverse());
		
		viewAll(empList);

	}

	public static void viewAll(List<Employee> inputList) {
		
		for (Employee e: inputList) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

}
