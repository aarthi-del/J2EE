package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverSetter {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configuration.xml");
		 Object o=context.getBean("e1");
		 employee e=(employee)o;
		 System.out.println(e);
	}

}
