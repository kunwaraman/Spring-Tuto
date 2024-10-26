package com.aman.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aman.company.Address;
import com.aman.company.Student;
import com.aman.company.Subjects;

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
	public Subjects createSubobj() {
		
		Subjects subj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("java");
		subjects_list.add("python");
		subjects_list.add("c++");
		subj.setSubjets(subjects_list);
		
		return subj;
	}
	
	
	
	@Bean
	public Student createstdObj() {
		Student std = new Student();
		std.setName("Lalit");
		std.setRollno(56);
		//std.setAddress(createAddrObj()); // manually dependency injection
		//std.setSubject(createSubobj());// manually depency ij
		
		
		return std;
		
	}
	

	

}
