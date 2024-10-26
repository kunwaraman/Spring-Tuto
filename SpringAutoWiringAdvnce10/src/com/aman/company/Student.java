package com.aman.company;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int rollno;
	
	private String name;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subject;

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
   // we remove from here and we do autowiring for this
//	public void setSubject(Subjects subject) {
//		this.subject = subject;
//	}

	// agar manully karenge to mujhe yaha par set subject ke liye stter method call karna hoga
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Address:"+address);
		System.out.println("subjects:"+subject);
		
	}

}
