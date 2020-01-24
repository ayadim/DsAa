package com.Searching;

public class InterpolationSearch { //this type of search is recommanded for phone numbers,dictionary,book index. Note:array should be sorted
	

	public static void main(String[] args) {
		int size = 1000000;
		int numberOfTrys = 1;
		int[] list = new int[size];
		for(int i=0;i<size;i++)
			list[i] = i;
		
		
		int low=0;
		int hight =list.length-1;
		int midle = 0;
		boolean notFounded = true;
		int searchingNumber = 89462; 

		while(notFounded) {
			midle = low + ((hight - low) / (list[hight] - list[low])) * (searchingNumber - list[low]);	// the magic code residces here 		
			if(low > hight) {
				System.out.println("number not founded !");
				break;
			}		
			
			if(searchingNumber == list[midle]) {
				System.out.println("Number founded after : " + numberOfTrys + " trys.");
				break;
			}
			
			if (list[midle] > searchingNumber)
				hight = midle -1;
			
			if (list[midle] < searchingNumber)
				low = midle +1;
			
			numberOfTrys++;
		}
	}

}
