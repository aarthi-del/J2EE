package positionalParameter;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import demo.jsb.hibernate.Employee;

public class Positonal {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
	EntityManager em =emf.createEntityManager();
	 System.out.println("enetr the name");
	 String name=s.next();
	 Query q=em.createQuery("select e from Employee e where e.name=?9//3");
	 q.setParameter(3, name);
	 List<Employee> list=q.getResultList();
	 System.out.println(list);
	  
	}
}
 