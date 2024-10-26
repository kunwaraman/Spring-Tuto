package com.aman.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.company.Student;
public class Main {
	
	public static void main(String...Amankunwar) {
		
		String config_file_loc = "/com/sp/resouces/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config_file_loc);
		Student std = (Student) context.getBean("stdId");
		std.display();
		
	}

}
