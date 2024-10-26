package com.aman.company;

public class Student {

	private String name;

	private int rollno;

	private Address address;

	public void setName(String name) {
		System.out.println("setter method name");
		this.name = name;
	}

	public void setRollno(int rollno) {
		System.out.println("setter method rollno");
		this.rollno = rollno;
	}

	public void setAddress(Address address) {
		System.out.println("setter method address");
		this.address = address;
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("Rollno:" + rollno);
		System.out.println("Address:" + address);
	}

}
