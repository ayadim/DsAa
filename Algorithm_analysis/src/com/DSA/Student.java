package com.DSA;

public class Student {
	private String name;
	private int id;
	
	public Student(int id,String name) {
		this.id = id;
		this.name = name;
	}
	public String getStudentName() {
		return this.name;
	}
	
	public int getStudentID() {
		return this.id;
	}
}
