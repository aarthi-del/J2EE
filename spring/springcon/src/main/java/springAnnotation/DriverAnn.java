package springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverAnn {
   public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Annotation.xml");
	  Employee p=(Employee) context.getBean("employee");
	  p.m1();
}
}
