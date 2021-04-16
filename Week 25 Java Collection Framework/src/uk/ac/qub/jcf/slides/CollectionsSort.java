package uk.ac.qub.jcf.slides;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsSort {

	public static void main(String[] args) {

		int searchIndex = 0;
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String[] pets = { "cat", "dog", "rabbit", "goldfish"};

		// Create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); // create List
		List<String> list2 = Arrays.asList(pets); // create List
		System.out.println("Unsorted array elements: " + list);

		// sort ArrayList
		Collections.sort(list);
		System.out.println("Sorted array elements: " + list);

		// sort in descending order using a comparator
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sorted array elements: " + list);
		
		// shuffle array elements
		Collections.shuffle(list, new Random());
		System.out.println("Shuffle sorted array elements: " + list);
		
		// search for element in list, returns -1 if element not in list
		searchIndex = Collections.binarySearch(list, "Hearts");
		System.out.println("Index position: " + searchIndex);
		
		// counts number of times specified element occurs in list
		System.out.println("Frequency: " + Collections.frequency(list, "Hearts"));
		
		// determines whether two lists have no elements in common
		System.out.println("Disjoint: " + Collections.disjoint(list, list2));

	}

}
