package com.DSA.stack;

public class StackDemo {

	public static void main(String[] args) {
		StackArray stack = new StackArray<Integer>(6);
		//stack.showAll();
		stack.push(5);
		stack.push(8);
		stack.push(6);
		stack.push(7);
		stack.push(9);
		//stack.push(1);
		//stack.push(77);//test is we can add more than the size of Stack
		System.out.println(stack.peek());
		stack.showAll();
		
		
	}

}
