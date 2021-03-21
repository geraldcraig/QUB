package uk.ac.qub.frameworksdemo;

import java.util.HashMap;
import java.util.Map;

public class ContactsListDemo {

	public static void main(String[] args) {
		
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		phoneBook.put("Aidan", "07773939393");
		phoneBook.put("Una", "07778888888");
		phoneBook.put("Annie", "07772222222");
		
		System.out.println("\nMap Contains: \nkey\t\tValue");
		
		for (String key: phoneBook.keySet()) {
			System.out.printf("%-10s%10s \n", key, phoneBook.get(key));
		}

	}

}
