package uk.ac.qub.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

	public static void main(String[] args ) {
		Integer[] num1 = {2,3,4,5,6};
		Integer[] num2 = {4,5,6,7,8};
		List<Integer> nums = Arrays.asList(num1);
		actuallyRemoveDuplicates(nums);
	
	}

	public static void actuallyRemoveDuplicates(List<Integer> list) {
		List<Integer> unique = new ArrayList<Integer>();
		for (Integer val : list) {
			if (!unique.contains(val)) {
				unique.add(val);
			}
		}

		list.clear();
		list.addAll(unique);
		System.out.println("Unique list in method " + list.toString());
	}

}
