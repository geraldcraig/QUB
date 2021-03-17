package uk.ac.qub.frameworksdemo;

import java.util.Comparator;

public class CompareEmployeeByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge() - o2.getAge();
	}

}
