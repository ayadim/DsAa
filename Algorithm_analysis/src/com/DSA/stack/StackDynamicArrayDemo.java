package com.DSA.stack;

public class StackDynamicArrayDemo {

	public static void main(String[] args) {
		StackDynamicArray<String> listOfStack = new StackDynamicArray<String>(5);
		listOfStack.push("AAA");
		listOfStack.push("BBB");
		listOfStack.push("CCC");
		listOfStack.push("DDD");
		listOfStack.push("EEE");
		listOfStack.push("FFF");
		listOfStack.push("JJJ");
		listOfStack.push("XXX");
		System.out.println("delete  : " + listOfStack.pop());
		System.out.println(listOfStack.peek());
	}

}
