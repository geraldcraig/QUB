package uk.ac.qub.jcf.slides;

import java.util.Comparator;

public class CompareEmployeeNameReversed implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
