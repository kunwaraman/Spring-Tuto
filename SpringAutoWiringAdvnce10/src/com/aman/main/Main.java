package com.aman.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aman.company.Student;
import com.aman.resources.javafileconfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javafileconfig.class);
		Student std =context.getBean(Student.class);
		std.display();

	}

}
