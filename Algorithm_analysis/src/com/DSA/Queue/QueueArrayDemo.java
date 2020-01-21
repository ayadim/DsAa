package com.DSA.Queue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Double> listOfDoubles = new QueueArray<Double>(8);
		listOfDoubles.enQueue(5.2);
		listOfDoubles.enQueue(7.8);
		listOfDoubles.enQueue(44.2);
		listOfDoubles.enQueue(8.0);
		listOfDoubles.showAllItems();
		
		System.out.println("after calling deQueue()");
		listOfDoubles.deQueue();
		listOfDoubles.deQueue();

		listOfDoubles.showAllItems();
		
	}

}
