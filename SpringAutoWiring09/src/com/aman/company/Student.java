package com.aman.company;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int rollno;
	
	private String name;
	
	@Autowired
	private Address address;

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Address:"+address);
		
	}

}
