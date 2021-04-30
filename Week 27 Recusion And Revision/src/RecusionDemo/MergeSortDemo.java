package RecusionDemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeSortDemo {

	public static void main(String[] args) {

		Integer[] nums = new Integer[] { 45, 23, -1, 8, 4, 22, 99, 200, 2, 4, 10, -77 };
		List<Integer> toSort = new LinkedList<Integer>(Arrays.asList(nums));

		System.out.println("Pre sorting: " + toSort);

		List<Integer> sorted = mergeSort(toSort);

		System.out.println("Sorted: " + sorted);

	}

	private static List<Integer> mergeSort(List<Integer> toSort) {
		// base case
		if (toSort.size() == 1) {
			// already sorted
			return toSort;
		}

		// split the list in 2
		List<Integer> list1 = toSort.subList(0, toSort.size() / 2);
		List<Integer> list2 = toSort.subList(toSort.size() / 2, toSort.size());

		// sort both lists
		list1 = mergeSort(list1);
		list2 = mergeSort(list2);

		// combine 2 sorted lists
		List<Integer> combined = mergeSortedLists(list1, list2);

		return combined;
	}

	private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
		System.out.println("Merging");
		List<Integer> merged = new LinkedList<Integer>();

		Queue<Integer> q1 = new LinkedList<Integer>(list1);
		Queue<Integer> q2 = new LinkedList<Integer>(list2);

		while (q1.size() > 0 && q2.size() > 0) {
			// compare smallest value in each list and take the smallest of those
			if (q1.peek() < q2.peek()) {
				merged.add(q1.poll());
			} else {
				merged.add(q2.poll());
			}
		}
		// one list is empty

		//
		merged.addAll(q1);
		merged.addAll(q2);

		System.out.println("Combined");

		return merged;
	}
}
