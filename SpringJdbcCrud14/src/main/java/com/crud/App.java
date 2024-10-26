package com.crud;

import com.aman.beans.Student;
import com.crud.resources.javaConfigfile;

import java.util.List;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(javaConfigfile.class);
         
    	JdbcTemplate jdbcTemplate=	context.getBean(JdbcTemplate.class);
    	
    	//-------------insert operation----------
    	
//    	 int std_rollno=109;
//        String std_name="himanshu";
//        float std_marks=97.5f;
//    	String insert_Sql_query="INSERT INTO studenttp VALUES(?,?,?)";
//    	int count = jdbcTemplate.update(insert_Sql_query,std_rollno,std_name,std_marks);
//    	if(count>0) {
//    		System.out.println("insertion sucess");
//    	}else {
//    		System.out.println("insertion failed");
//    	}
//    	
    	
    	//----------update operation---------------
    	// we update on marks
    	/*
    	float marks = 98.f;
    	int rollno = 101;
    	
    	String update_sql_query="UPDATE studenttp SET std_marks=? WHERE std_roll=?";
    	int count = jdbcTemplate.update(update_sql_query,marks,rollno);
    	if(count>0) {
    		System.out.println("updation sucess");
    	}else {
    		System.out.println("updation failed");
    	}
    	*/
    	
    	// ----------we do delete operation--------
    	// on rollno we have to delete 
//    	int rollno =103;
//    	String delete_sql_query = "DELETE FROM  studenttp WHERE std_roll=?";
//    	int count = jdbcTemplate.update(delete_sql_query,rollno);
//    	if(count>0) {
//    		System.out.println("deletion sucess");
//    	}else {
//    		System.out.println("deletion failed");
//    	}
    	
    	// -----------we do select operation--------
    	
    	String select_sql_query="SELECT*FROM studenttp";
    	//List<Student> std_list=jdbcTemplate.query(select_sql_query, new StudentRowMapper());
    	//List<Student> std_list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
    	
         
    	
    }
}
