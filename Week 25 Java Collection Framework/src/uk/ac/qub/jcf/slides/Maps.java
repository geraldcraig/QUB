package uk.ac.qub.jcf.slides;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		
		String sentence = "to be or not to be";
		// create the HashMap
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		// tokenize the input
		String[] tokens = sentence.split(" ");
		
		// processing input text
		for (String token : tokens) {
			if (myMap.containsKey(token)) {
				int count = myMap.get(token);
				// increase the count for this word
				myMap.put(token,count + 1);
			} else {
				// add new word with a count of 1 to map
				myMap.put(token, 1);
			}	
		}
		
		// display all keys and values
		System.out.println("\nMap contains : \nKey\t\tValue");
		// display all map content
		for (String key : myMap.keySet()) {
			System.out.printf("%-10s%10d \n", key, myMap.get(key));
		}
		
		// display a value based on a key
		if (myMap.containsKey("not")) {
			System.out.println("Value for key \"not\" : " + myMap.get("not"));
		} else {
			System.out.println("Key not found ");
		}
		
		// create a TreeMap (implements the SortedMap interface)
		Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		// add the keys and values
		mySortedMap.put(4, "four");
		mySortedMap.put(1, "one");
		mySortedMap.put(3, "three");
		mySortedMap.put(2, "two");
		
		// get the keyset and output the values
		for (Integer key : mySortedMap.keySet()) {
			System.out.printf("%10d%10s \n", key, mySortedMap.get(key));
		}
		
	}

}
