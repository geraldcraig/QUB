package uk.ac.qub.jcf.slides;

import java.util.ArrayList;
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

}
