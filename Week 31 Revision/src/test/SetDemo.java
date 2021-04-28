package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String[] colours = {"red", "white", "blue", "green", "gray", "orange", "red", "blue", "red" };
		List<String> list = Arrays.asList(colours);
		
		System.out.println(list);
		
		printNonDupes(list);
		
		Set<String> newList = printNonDupes(list); 
		
		List<String> setList = new ArrayList<String>(newList);
		
		//Collections.sort(setList);
		
		System.out.println(setList);
		
		Queue<String> queue = new PriorityQueue<String>(setList);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
			System.out.println("Queue items : " + queue.toString());
			Thread.sleep(2000);
			
		}

	}

	public static Set<String> printNonDupes(List<String> list) {
		Set<String> set = new TreeSet<String>(list);
		//System.out.println(set);
		return set;
		
	}

}
