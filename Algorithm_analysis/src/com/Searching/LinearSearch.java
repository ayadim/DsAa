package com.Searching;

public class LinearSearch {

	public static void main(String[] args) {
		int size = 1000000;
		int[] list = new int[size];
		for(int i=0;i<size;i++)
			list[i] = i;
		
		// Linear Search O(n) ====> c0 + n(c1 + c2)
		int searchingNumber = 89462; //c0
		int numberOfTrys = 0 ;
		for(int i=0;i<list.length;i++) {// n			
			if (searchingNumber == list[i]) {//c1
				System.out.println("Number Founded after : " + numberOfTrys + " trys."); // c2
				break; //c3
			}
			numberOfTrys++;
		}
	}

}
