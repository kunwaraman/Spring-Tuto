package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.StudentTp;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String...Amankunwar) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
//		StudentTp std = (StudentTp)context.getBean("stdId1");
//		std.displaying();
		
		// another way
		StudentTp std = context.getBean(StudentTp.class);
		std.displaying();
		
		
		
		
	}

}
