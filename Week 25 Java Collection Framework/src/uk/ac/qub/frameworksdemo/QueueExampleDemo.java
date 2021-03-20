package uk.ac.qub.frameworksdemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleDemo {

	public static void main(String[] args) throws InterruptedException {
		 
		int time = 10;
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = time; i >= 0; i--) {
			queue.add(i);
		}
		
		System.out.println("Queue items: " + queue.toString());
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			System.out.println("Queue items: " + queue.toString());
			Thread.sleep(1000);
		}
	}

}
