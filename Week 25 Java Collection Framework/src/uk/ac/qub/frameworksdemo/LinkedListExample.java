package uk.ac.qub.frameworksdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("I");
		linkList.add("dream");
		linkList.add("have");
		linkList.add("a");
		
		System.out.println("Pre swap: " + linkList.toString());
		
		swap(linkList, 1, 3);
		
		System.out.println("After swap: " + linkList.toString());
		
		swap(linkList, 1, 2);
		
		System.out.println("After 2nd swap: " + linkList.toString());

	}
	
	public static void swap(List<String> list, int pos1, int pos2) {
		String temp = list.get(pos1);
		list.set(pos1, list.get(pos2));
		list.set(pos2, temp);
		
	}

}
