package com.DSA.Queue;


public class QueueArray<T> {
	private int front;//start
	private int rear;//end
	private Object[] list;
	
	public QueueArray(int size) {
		list = new Object[size];
		front = 0;
		rear = -1;// -1 because enQueue will make sure
	}
	
	private boolean isFull() {
		return (list.length-1 == rear);
	}
	
	private boolean isEmpty() {
		return ( front == rear || rear == -1);
	}
	
	public void enQueue(T item) {
		if (isFull()) {
			System.out.println("Queue Overflow ! Try to specify big size.");
			return;
		}		
		list[++rear] = item;
	}
	
	public T deQueue() {
		if (isEmpty())
			return null;
		T temp = (T)list[front++];
		if(front == rear) {
			rear = -1;
			front = 0;
		}
		return temp;
	}

	public T peek() {
		return (isEmpty())?null:(T)list[rear];
	}	
	public void showAllItems() {
		if (isEmpty())
			return;
		System.out.println("______ show all items ________ ");
		for(int i=front;i<=rear;i++) {
			System.out.println("The " + i + " 'th item equals :  " + list[i]);
		}
		System.out.println("______ show all items ________ ");
		
	}
	
}
