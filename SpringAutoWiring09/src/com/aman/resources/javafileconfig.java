package com.aman.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aman.company.Address;
import com.aman.company.Student;

@Configuration
public class javafileconfig {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("kanpur");
		addr.setPincode(568973);
		return addr;
	}
	
	
	@Bean
	public Student createstdObj() {
		Student std = new Student();
		std.setName("Lalit");
		std.setRollno(56);
		//std.setAddress(createAddrObj()); // manually dependency injection
		return std;
		
	}
	
	

}
