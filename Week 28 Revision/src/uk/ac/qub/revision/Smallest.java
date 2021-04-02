package uk.ac.qub.revision;

public class Smallest {

	public static void main(String[] args) {
		int[] nums = {34, -345, -1, 100};
		
		int smallest = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		System.out.println(smallest);
	}

}
