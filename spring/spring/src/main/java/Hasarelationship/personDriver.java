package Hasarelationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class personDriver {
 public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("personconfig.xml");
	 Person p1=(Person) context.getBean("p1");
	      Address a1=p1.getAddress();    
	      System.out.println(a1);
	      System.out.println(p1);
	
}
}
