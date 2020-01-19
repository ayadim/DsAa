package com.DSA;

public class SimpleArray {

	public static void main(String[] args) {
		//Simple One dimension array
		int[] numbers = new int[5];
		numbers[0] = 1 ;
		numbers[1] = 5 ;
		numbers[2] = 4 ;
		numbers[3] = 9 ;
		numbers[4] = 2 ;
		System.out.println("This is a simple number array");
		for(int i=0;i<numbers.length;i++)
			System.out.print(numbers[i] + "\t");
		
		//Simple One dimonsion Object array		
		System.out.println("\nThis is a simple Object Array");
		Student[] students = new Student[2];
		students[0] = new Student(1, "ayadi");
		students[1] = new Student(2, "abadi");
		for(Student std : students) {
			System.out.println("id : " + std.getStudentID() + " , Name : " + std.getStudentName());
		}	
		
		//Array with two dimonsions 
		int[][] data = new int[3][3];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[1][0] = 4;
		data[1][1] = 5;
		data[1][2] = 6;
		data[2][0] = 7;
		data[2][1] = 8;
		data[2][2] = 9;
		
		System.out.println("Show two dimonsion Array");
		for(int row=0;row<data.length;row++) {
			for(int col=0;col<data[row].length;col++)
				System.out.print(data[row][col] + "\t");
			System.out.println("\n");
		}
		
	}

}
