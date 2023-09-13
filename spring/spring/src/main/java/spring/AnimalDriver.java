package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalDriver {
	public static void main(String[] args) {
		 ApplicationContext   context= new ClassPathXmlApplicationContext("animalconfig.xml");
		     Animal a=(Animal) context.getBean("A1");
		     System.out.println(a);
	}
  
   
}
  
