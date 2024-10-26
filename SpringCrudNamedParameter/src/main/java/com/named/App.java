package com.named;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.named.resources.javaconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaconfig.class);
        
        NamedParameterJdbcTemplate npJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key_rollno", 104);
        map.put("key_name", "Rahul");
        map.put("key_marks", 88.8f);
        
        String insert_sql_query = "INSERT INTO studenttp VALUES(:key_rollno,:key_name,:key_marks)";
        
        int count =npJdbcTemplate.update( insert_sql_query, map);
        if(count>0) {
        	System.out.println("insertion sucess");
        }else {
        	System.out.println("insertion failed");
        }
        
    }
}
