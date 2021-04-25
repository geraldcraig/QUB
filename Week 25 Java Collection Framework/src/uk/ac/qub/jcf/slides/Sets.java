package uk.ac.qub.jcf.slides;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		// create and display a List
		String[] colours = { "red", "white", "blue", "red", "white", "blue", "green" };
		List<String> list = Arrays.asList(colours);
		System.out.println("List: " + list);

		// eliminate duplicates then print the unique values
		printNonDuplicates(list);

		// create the sorted set implementation
		Set<String> set2 = new TreeSet<String>();
		set2.add("Zidane");
		set2.add("Messi");
		set2.add("Pele");
		// show all - naturally ordered
		for (String name : set2) {
			System.out.println(name);
		}
	}

	private static void printNonDuplicates(List<String> values) {
		// create a HashSet
		Set<String> set = new HashSet<String>(values);
		System.out.println("Nonduplicates are: ");

		for (String value : set)
			System.out.println(value);
	}

}
