package com.DSA;

public class DemoDynamicArray {

	public static void main(String[] args) {
		
		DynamicArray<Integer> dataOfInt = new DynamicArray<>(2);
		dataOfInt.add(2);
		dataOfInt.add(5);
		dataOfInt.add(3);
		dataOfInt.add(8);
		dataOfInt.add(9);
		dataOfInt.add(0);
		dataOfInt.add(4);
		System.out.println("arraylist Length 1 "+dataOfInt.getArrayLength());
		dataOfInt.removeItemByIndex(2);
		System.out.println("arraylist Length 2 "+dataOfInt.getArrayLength());
		dataOfInt.add(3);
		dataOfInt.add(8);
		dataOfInt.add(3);
		dataOfInt.add(8);
		dataOfInt.add(3);
		dataOfInt.add(8);
		System.out.println("arraylist Length 3 "+dataOfInt.getArrayLength());
		int i=0;
		System.out.println("i = " + i++);
		System.out.println("i = " + i);
	}

}
