package uk.ac.qub.frameworksdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

public class QueueExampleDemo {

	public static void main(String[] args) throws InterruptedException {
		 
		int time = 10;
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Matthew");
		names.add("Aidan");
		names.add("Neil");
		names.add("Olga");
		names.add("Janak");
		names.add("John");
				
		Queue<Integer> queueNum = new LinkedList<Integer>();
		
		for (int i = time; i >= 0; i--) {
			queueNum.add(i);
		}
		
		Queue<String> queue = new LinkedList<String>(names);
		Queue<String> pQueue = new PriorityQueue<String>(names);
		
		System.out.println("Queue items: " + queueNum.toString());
		
		while (!queueNum.isEmpty()) {
			System.out.println(queueNum.remove());
			System.out.println("Queue items: " + queueNum.toString());
			Thread.sleep(1000);
		}
		
		System.out.println("Queue items: " + queueNum.toString());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			System.out.println("Queue items: " + queue.toString());
			Thread.sleep(2000);
		}
		
		System.out.println("Queue items: " + pQueue.toString());
		
		while (!pQueue.isEmpty()) {
			System.out.println(pQueue.remove());
			System.out.println("Queue items: " + pQueue.toString());
			Thread.sleep(2000);
		}
	}

}
