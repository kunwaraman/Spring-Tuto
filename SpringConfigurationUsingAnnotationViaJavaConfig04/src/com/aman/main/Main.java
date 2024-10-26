package com.aman.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.aman.beans.Student;
import com.aman.resources.SpringConfigFile;

public class Main {
	
	public static void main(String...Amankunwar) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("student");
		std.display();
		
	}

}
