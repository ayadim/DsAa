package com.Sort;

public class BubbleSort {
	public static void main(String[] args) {
		//We have this list 
		int[] list = {8,7,2,9,4,3,6,77,99,2,44,6,3,6,47,77,89};
		int tries = 0;
		//we want to sort this list 
		for(int i=0;i<list.length;i++) { //n time
			for(int j=1;j<list.length-i;j++){// n time
				tries++;
				if(list[j-1] > list[j]) {
					int temp = list[j-1];
					list[j-1] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.print("[");
		for(int i=0;i<list.length;i++)
			System.out.print(list[i] + ",");
		System.out.println("]\nsorted after : " + tries + " times.");// 
		/*
		 * in our case it takes 136 time to sort the list
		 * big O for this method is : O(power(n,2))
		 * same thing with Insertion : O(power(n,2))
		 * same thing with Selection : O(power(n,2))
		 * */
 	}

}
