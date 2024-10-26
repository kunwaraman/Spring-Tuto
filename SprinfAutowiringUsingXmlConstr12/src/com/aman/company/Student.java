package com.aman.company;

public class Student {
	
	private String name;
	
	private int rollno;
	
	private Address address;

	public Student(String name, int rollno, Address address) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Address:"+address);
	}

}