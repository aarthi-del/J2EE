package springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.student;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(ConfigAnno.class);
		Student s=(Student) context.getBean("student");
		System.out.println(s);
		s.name();
		System.out.println("*************************");
		System.out.println(s.getI().getAddress());
		System.out.println(s.getI().getId());
	}

} 
