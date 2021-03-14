package uk.ac.qub.frameworksdemo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("I");
		linkList.add("dream");
		linkList.add("have");
		linkList.add("a");
		
		String[] more = {"More", "words", "to", "put", "at", "the", "end"};
		Collections.addAll(linkList, more);
		Collections.addAll(linkList, "even", "more", "words");
		
		System.out.println("Pre swap: " + linkList.toString());
		
		swap(linkList, 1, 3);
		
		System.out.println("After swap: " + linkList.toString());
		
		swap(linkList, 1, 2);
		
		System.out.println("After 2nd swap: " + linkList.toString());
		
		ArrayList<Person> people = new ArrayList<Person>();
		Collections.addAll(people, new Person("Bob", "Jones"), new Person("John", "Smith"));
		System.out.println("orig" +people.toString());
		Collections.reverse(people);
		System.out.println("reverse" + people.toString());
		
		
		
		Integer[] nums = {12, 123, 123123, 456, 456456};
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Collections.addAll(numList, nums);
		
		System.out.println("orig" + numList.toString());
		Collections.reverse(numList);
		System.out.println("reverse" + numList.toString());
		

	}
	
	public static void swap(List<String> list, int pos1, int pos2) {
		String temp = list.get(pos1);
		list.set(pos1, list.get(pos2));
		list.set(pos2, temp);
		
	}

}
