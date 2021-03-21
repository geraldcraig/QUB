package uk.ac.qub.frameworksdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemoFromNotes {

	public static void main(String[] args) {
	
		String sentence = "to be or not to be";
		
		//Map<String, Integer> myMap = new HashMap<String, Integer>();
		Map<String, Integer> myMap = new TreeMap<String, Integer>();
		
		String[] tokens = sentence.split(" ");
		
		for (String token: tokens) {
			if (myMap.containsKey(token)) {
				int count = myMap.get(token);
				
				myMap.put(token, count+1);
				
			} else {
				// add a new word and associate it with value 1
				myMap.put(token, 1);
			}
		}
		
		//System.out.println(myMap.toString());
		System.out.println("\nMap Contains: \nkey\t\tValue");
		
		for (String key: myMap.keySet()) {
			System.out.printf("%-10s%10d \n", key,myMap.get(key));
		}
		
	}

}
