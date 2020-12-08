/**
 * 
 */
package uk.ac.qub.oop.constructor;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author geraldcraig
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList <String> theList = new ArrayList<String>();
		
		theList.add("Apples");
		theList.add("Orange");
		theList.add(0, "Pear");
		
		System.out.println(theList.toString());
		
		theList.set(1, "Peach");
		
		System.out.println(theList.toString());
		
		
		System.out.println(theList.get(1));
		
		System.out.println(theList.size());
		
		Collections.sort(theList);
		System.out.println(theList.toString());

	}

}
