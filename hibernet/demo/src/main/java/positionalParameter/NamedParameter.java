package positionalParameter;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import demo.jsb.hibernate.Employee;

public class NamedParameter {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select e from Employee e where e.sal=:sal");
		Scanner s=new Scanner(System.in);
		System.out.println("enetr the sal");
		double sal=s.nextDouble();
		q.setParameter("sal", sal);
		List<Employee> list=q.getResultList();
		System.out.println(list);
		
		
		
		
		
	}

}


































































