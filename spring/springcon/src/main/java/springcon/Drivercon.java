package springcon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drivercon {
       public static void main(String[] args) {
		ApplicationContext context= new  ClassPathXmlApplicationContext("config.xml");
		Person p=(Person) context.getBean("p");
		System.out.println(p);
	}
}
