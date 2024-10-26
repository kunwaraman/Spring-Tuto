package com.aman.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.company.Student;


public class Main {
	public static void main(String...Amankunwar) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/aman/resources/applicationContext.xml");
		
		Student std = (Student)context.getBean("stdId");
		std.display();
		
		
	}

}
