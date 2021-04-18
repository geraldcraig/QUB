package uk.ac.qub.jcf.slides;

import java.util.LinkedList;
import java.util.List;

public class SwapElements {

	public static void main(String[] args) {
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("I");
		linkList.add("dream");
		linkList.add("have");
		linkList.add("a");
		
		// not quite right?
		System.out.println(linkList.toString());
		
		swap(linkList, 1, 2);
		System.out.println(linkList.toString());
		swap(linkList, 2, 3);
		System.out.println(linkList.toString());
	}
	
	public static void swap(List<String> list, int position1, int position2) {
		String tmp = list.get(position1);
		list.set(position1, list.get(position2));
		list.set(position2, tmp);
		
	}

}
