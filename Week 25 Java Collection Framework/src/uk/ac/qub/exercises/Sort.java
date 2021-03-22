package uk.ac.qub.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		List<String> list = Arrays.asList(suits);
		System.out.println("Unsorted: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted: " + list.toString());
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sort: " + list.toString());
		
		Collections.shuffle(list);
		System.out.println("Shuffled: " + list);
		
		Collections.addAll(list, "Hearts");
		

	}

}
