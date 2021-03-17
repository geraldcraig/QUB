package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercise2 {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(52);
		arrList.add(65);
		arrList.add(5);
		arrList.add(21);
		arrList.add(99);
		arrList.add(5);
		arrList.add(99);

		List<Integer> linkList = new LinkedList<Integer>();
		linkList.add(5);
		linkList.add(21);
		linkList.add(99);
		linkList.add(5);
		linkList.add(80);

		System.out.println("orig list: " + arrList.toString());
		//System.out.println("remove list: " + linkList.toString());
		//removeDuplicates(arrList, linkList);
		
		arrList = actuallyRemoveDuplicates(arrList);
		// removeDupes2(arrList);
		
		System.out.println("list after: " + arrList.toString());


	}
	/**
	 * finds unique values in a given list and updates the list to
	 * only contain those.
	 * @param inputList
	 */
	public static List<Integer> actuallyRemoveDuplicates(List<Integer> inputList) {
		List<Integer> unique = new ArrayList<Integer>();
		for (Integer val: inputList) {
			if (!unique.contains(val)) {
				unique.add(val);
			}
		}
		
		//inputList.clear();
		//inputList.addAll(unique);
		//System.out.println("Unique name in method: " + unique.toString());
		return unique;
	}

	public static void removeDuplicates(List<Integer> origList, List<Integer> toRemove) {
		for (Integer value : toRemove) {
			origList.remove(value);
		}
		// boolean check = origList.removeAll(toRemove);
		origList.removeAll(toRemove);
		// System.out.println("List changed? " + check);
	}

}
