package uk.ac.qub.jcf.slides;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListsExample1 {

	public static void main(String[] args) {

		// create a list (of type ArrayList)
		List<String> arrList = new ArrayList<String>();
		arrList.add("Belfast");
		arrList.add("Dublin");

		// create a list (of type LinkedList)
		List<String> lnkList = new LinkedList<String>();
		lnkList.add("London");
		lnkList.add("Cardiff");

		showAll(arrList);
		showAll(lnkList);
		
		// create a list (of type LinkedList)
		List<String> linkList = new LinkedList<String>();
		linkList.add("I");
		linkList.add("dream");
		linkList.add("have");
		linkList.add("a");
		
		System.out.println(linkList.toString());
		
		swap(linkList, 1, 2);
		swap(linkList, 2, 3);
	}

	/**
	 * Displays all elements of ArrayList or LinkedList
	 * 
	 * @param list
	 */
	public static void showAll(List<String> list) {
		// for each
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	/**
	 * Swaps element positions in List
	 * @param list
	 * @param position1
	 * @param position2
	 */
	public static void swap(List<String> list, int position1, int position2) {
		Collections.swap(list, position1, position2);
		System.out.println(list.toString());	
	}

}
