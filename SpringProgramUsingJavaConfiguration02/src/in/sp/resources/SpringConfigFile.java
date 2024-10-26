package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.StudentTp;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public StudentTp stdId1() {
		
		StudentTp std = new StudentTp();
		std.setName("Rahul");
		std.setEmail("rahulhopla@gmail.com");
		std.setRollno(05);;
		return std;
		
	}
	

}
