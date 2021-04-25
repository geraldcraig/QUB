package uk.ac.qub.jcf.slides;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) throws InterruptedException {
		// set the start time
		int time = 10;
		// create an implementation of a queue
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//populate the queue with the times between start and 0
		for (int i = time; i >=0; i--) {
			queue.add(i);
		}
		
		System.out.println("Queue items : " + queue.toString());
		
		// remove each item (from front of queue) and delay next removal
		// by 1 second
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			Thread.sleep(1000);
		}
		
		// create the queue
		Queue<Double> q = new PriorityQueue<Double>();
		// add in any order
		q.add(10.1);
		q.add(3.3);
		q.add(5.2);
		System.out.println("Queue order : " + q.toString());
		int loop = 0;
		while (loop < q.size()) {
			// view and then remove each element (by order)
			System.out.println("Peek " + q.peek());
			q.remove();
		}
	}

}
