package uk.ac.qub.frameworksdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortingDemo {

	public static void main(String[] args) {
	
		String[] suits = new String[] {"Clubs", "Spades", "Diamonds", "Hearts"};
		List<String> list = Arrays.asList(suits);
		
		//Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list);
		System.out.println(list);
		//Collections.shuffle(list);
		
		int index = Collections.binarySearch(list, "Spades");
		int index2 = Collections.binarySearch(list, "Zebra");
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.max(list, Collections.reverseOrder()));
		System.out.println(Collections.min(list));
		
		System.out.println(index);
		System.out.println(index2);

	}
	

}
