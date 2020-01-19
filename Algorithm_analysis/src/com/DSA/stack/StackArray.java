package com.DSA.stack;


public class StackArray<T> {
	
	Object[] list;
	int top;
	
	public StackArray(int size) {
		list = new  Object[size];
		top=-1;
	}
	
	public void push(T item) {
		if (isFull()) {
			System.out.println("Stack is full ! ");
			return;
		}
		list[++top] = item;		
	}

	public T pop() { // pop() will return the removed item
		if (isEmpty()) {
			System.out.println("Stack is empty");//return -1 if we can't remove from stack
		}
		// Stack is not empty
			return (!isEmpty())?(T)list[top--]:null;// return deleted item and decrease 1 from top 			
	}
	
	public boolean isFull() {
		return (top == list.length-1);			
	}
	
	public boolean isEmpty() {
		return (top ==-1);
	}
	
	public T peek() {
		return (!isEmpty())?(T) list[top]:null;//peek last item
	}
	
	public void  showAll() {
		if(isEmpty()) {
			System.out.println("List is empty try to push some items !");
			return;
		}else {
			for(int i=0;i<=top;i++)
				System.out.println("Item : " + i + " equals : " + (T)list[i]);
		}			
	}
}
