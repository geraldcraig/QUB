package uk.ac.qub.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

	public static void main(String[] args ) {
		Integer[] num1 = {5, 52, 65, 5, 21, 99, 5, 99};
		
		List<Integer> nums1 = Arrays.asList(num1);
		
		System.out.println("Original list : " + nums1.toString());
		
		nums1 = actuallyRemoveDuplicates(nums1);
		
		System.out.println("Original list : " + nums1.toString());
	
	}

	public static List<Integer> actuallyRemoveDuplicates(List<Integer> list) {
		List<Integer> unique = new ArrayList<Integer>();
		for (Integer val : list) {
			if (!unique.contains(val)) {
				unique.add(val);
			}
		}
		
		return unique;
	}

}
