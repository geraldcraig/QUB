package uk.ac.qub.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RemoveElements {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(4);
		arrList.add(2);
		arrList.add(9);
		arrList.add(7);
		System.out.println("ArrayList: " + arrList.toString());

		List<Integer> linkList = new LinkedList<Integer>();
		linkList.add(3);
		linkList.add(9);
		linkList.add(2);
		linkList.add(5);
		linkList.add(1);
		System.out.println("LinkedList: " + linkList.toString());

		removeElements(arrList, linkList);
		addLists(arrList, linkList);
		
		Collections.addAll(arrList, 10);
		System.out.println(arrList);

	}

	public static void removeElements(List<Integer> originalList, List<Integer> listToRemove) {

		originalList.removeAll(listToRemove);
		System.out.println("Remove list: " + originalList.toString());

	}

	public static void addLists(List<Integer> originalList, List<Integer> listToAdd) {

		originalList.addAll(listToAdd);
		System.out.println("Joined lists: " + originalList.toString());
	}

}
