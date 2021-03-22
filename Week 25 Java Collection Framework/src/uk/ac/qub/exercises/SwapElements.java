package uk.ac.qub.exercises;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapElements {

	public static void main(String[] args) {
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("I");
		linkList.add("dream");
		linkList.add("have");
		linkList.add("a");
		
		System.out.println(linkList.toString());
		
		
		
		swap(linkList, 1, 2);
		swap(linkList, 2, 3);
	}
	
	public static void swap(List<String> list, int position1, int position2) {
		Collections.swap(list, position1, position2);
		System.out.println(list.toString());
		
	}

}
