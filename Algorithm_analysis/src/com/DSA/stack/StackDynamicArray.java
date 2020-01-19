package com.DSA.stack;

import java.util.Arrays;

public class StackDynamicArray<T> {

	private Object[] list;
	private int top;
	
	public StackDynamicArray(int size) {
		list = new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (-1 == top);
	}
	
	public boolean isFull() {
		return (top == list.length-1);
	}
	
	public void push(T item) {
		if (isFull())//list is full 
			list = Arrays.copyOf(list, list.length+2);//if we don't have more space in our stack just resize it by adding 10 item 
		list[++top] = item;	
	}
	
	public T pop() { // pop() will return the removed item
		if (isEmpty()) 
			System.out.println("Stack is empty");
		return (!isEmpty())?(T)list[top--]:null;// return deleted item and decrease 1 from top 			
	}
	
	public T peek() {
		return (isEmpty())?null:(T)list[top];
	}
}
