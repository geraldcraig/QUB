package uk.ac.qub.frameworksdemo;

import java.util.Comparator;

public class CompareEmpStatus implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o1.getEmployeeStatus().equalsIgnoreCase("FT") && o2.getEmployeeStatus().equalsIgnoreCase("PT")) {
			return -1;
		} else if (o1.getEmployeeStatus().equalsIgnoreCase("PT") && o2.getEmployeeStatus().equalsIgnoreCase("FT")) {
			return 1;
		} else {
			return 0;
		}
	}
}
