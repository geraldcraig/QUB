package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(5);
		arrList.add(99);
		arrList.add(67);
		arrList.add(90);
		arrList.add(90);
		
		
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		linkList.add(90);
		
		System.out.println("orig list: " + arrList.toString());
		System.out.println("remove list: " + linkList.toString());
		removeDup(arrList, linkList);
		System.out.println("list after: " + arrList.toString());
		
		System.out.println("end");
		
		ArrayList<Person> census = new ArrayList<Person>();
		census.add(new Person("Gerald", "Craig"));
		census.add(new Person("Gerald", "Craig"));
		census.add(new Person("Alison", "Craig"));
		census.add(new Person("Gerald", "Craig"));
		census.add(new Person("Shannon", "Craig"));
		census.add(new Person("Gerald", "Craig"));
		//census.add(toRemove);
		
		System.out.println(census.toString());
		System.out.println(census.size());
		
		Person toRemove = new Person("Gerald", "Craig");
		census.remove(toRemove);

	}
	
	public static void removeDup(List<Integer> origList, List<Integer> toRemove) {
		for(Integer value: toRemove) {
			origList.remove(value);
		}
		origList.removeAll(toRemove);
	}

}
