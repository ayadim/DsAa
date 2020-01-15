package com.DSA;
import java.util.Arrays;

public class DynamicArray <T>{

	private Object[] arrayList;
	private int size;
	
	public DynamicArray(int length) {
		this.size=0;
		arrayList = new Object[length];
		
	}
	
	public T get(int index) {
		//return null if the index is between 0 and size -1
		if (index >= 0 && index < arrayList.length)
			return (T) arrayList[index];
		else 
			return null;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public int getArrayLength() {
		return arrayList.length;
	}
	public void add(T item) {
		resizeArray();
		arrayList[size]=item;
		size+=1;
	}
	
	public void removeItemByIndex(int index) {
		if (index >=0 && index<size) {
			// create two concatenate array 
			Object[] leftArray = Arrays.copyOfRange(arrayList, 0, index);
			Object[] rightArray = Arrays.copyOfRange(arrayList, index, size);
			arrayList = Arrays.copyOf(arrayList, leftArray.length+rightArray.length);
			System.arraycopy(leftArray, 0, arrayList, 0, leftArray.length);
			System.arraycopy(rightArray, 0, arrayList, leftArray.length, rightArray.length);			
			for(int i=0;i<arrayList.length;i++) {
				System.out.println(arrayList[i]);
			}
			size-=1;
			

			
		}else {
			System.out.println("index not int Range");
		}
	}
	
	private void resizeArray() {
		if (!isArrayEmpty()) {
//			System.out.println("we are resizing the array list , length of array before resizing is : " + arrayList.length);
			arrayList = Arrays.copyOf(arrayList, size*2);
//			System.out.println("after resizing the arraylist the length is : " + arrayList.length);
		}
	}
	
	private boolean isArrayEmpty() {
			if (arrayList.length > size) {
				return true;
			}	
			return false;
	}


	
	

}
