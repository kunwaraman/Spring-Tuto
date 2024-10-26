package com.aman.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aman.cpny.Student;
import com.aman.resources.javaConfig;
public class Main {
	
	public static void main(String...Amankunwar) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		
		Student std =context.getBean(Student.class);
		std.display();
	}

}
