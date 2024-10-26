package com.aman.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// ways to access
//@ComponentScan("com.aman.beans")
//@ComponentScan({"com.aman.beans"})
@ComponentScan(basePackages= {"com.aman.beans"})



public class SpringConfigFile {
	

}
