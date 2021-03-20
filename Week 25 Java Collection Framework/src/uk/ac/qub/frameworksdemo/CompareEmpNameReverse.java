package uk.ac.qub.frameworksdemo;

import java.util.Comparator;

public class CompareEmpNameReverse implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o2.getName().compareToIgnoreCase(o1.getName());
	}
}
