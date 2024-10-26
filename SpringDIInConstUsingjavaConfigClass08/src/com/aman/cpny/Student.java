package com.aman.cpny;

public class Student {
	
	private int rollno;
	
	private String name;
	
	private Address address;

    
	
	public Student(int rollno, String name, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}



	public void display() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}

}
