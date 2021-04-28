package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionSetDemo {

	public static void main(String[] args) {
		
		String[] colours = {"red", "blue", "red", "yellow", "green", "blue", "red", "green", "green"};
		List<String> list =  Arrays.asList(colours);
		
		SortedSet<String> tSet = new TreeSet<String>();
		
		for (String val: list) {
			System.out.println("adding " + val);
			System.out.println(tSet.add(val));
		}
		
		for (String element: tSet) {
			System.out.println(element);
		}
		//printNoDuplicates(list);
		
		//List<String> unique = removeDupes(list);
		// System.out.println(unique);
		
	}

	public static List<String> removeDupes(List<String> list) {
		
		return new ArrayList<String>(new HashSet<String>(list));
	}

	public static void printNoDuplicates(List<String> list) {
		
		Set<String> theset = new HashSet<>();
		theset.addAll(list);
		
		for (String val: theset) {
			System.out.println(val);
		}	
	}

}
