package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class driver {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("configuration.xml");
	Object o=context.getBean("s1");
	Object o1=context.getBean("s2");
	student s1=(student)o1;
	System.out.println(o1);
     student s=(student)o;
	System.out.println(s);
	
}	

}
