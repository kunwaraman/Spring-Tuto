package com.aman.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.beans.Student;

public class Main {
	
	public static void main(String...Amankunwar) {
		
		String resource_file_path="/com/aman/resources/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(resource_file_path);
		
		Student std = (Student)context.getBean("student");
		std.display();
		
	}

}
