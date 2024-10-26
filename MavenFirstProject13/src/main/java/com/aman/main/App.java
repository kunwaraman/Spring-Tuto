package com.aman.main;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.entity.Student;
public class App 
{
    public static void main( String[] args )
    {
    	String configLocation = "/com/aman/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
        Student std = (Student) context.getBean(Student.class);
        std.display(); 
        
        
    }
}
