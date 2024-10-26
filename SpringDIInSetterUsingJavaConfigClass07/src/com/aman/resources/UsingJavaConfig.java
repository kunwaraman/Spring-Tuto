package com.aman.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aman.cpny.Address;
import com.aman.cpny.Student;

@Configuration
public class UsingJavaConfig {
	
	@Bean 
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("Manipal");
		addr.setPincode(568930);
		
		return addr;
		
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(101);
		std.setName("Monga");
		std.setAddress(createAddrObj());
		
		return std;
	}
	

}
