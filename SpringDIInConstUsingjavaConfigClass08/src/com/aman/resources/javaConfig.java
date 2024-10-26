package com.aman.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.aman.cpny.Address;
import com.aman.cpny.Student;

//@Configuration
@Component
public class javaConfig {
	
	@Bean
	public Address createAddrobj() {
		Address addr = new Address(200,"bhopal",56983);
		return addr;
		
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student(102,"Amit",createAddrobj());
		return std;
	}

}
