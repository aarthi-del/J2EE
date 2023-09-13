package positionalParameter;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import demo.jsb.hibernate.Employee;

public class NamedBetween {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		String query="select e from Employee e where e.sal between :start and :end order by e.sal desc";
		Query q=em.createQuery(query);
		Scanner s= new Scanner(System.in);
		System.out.println("enter then starting");
		double start=s.nextDouble();
		System.out.println("enter the end");
		double end=s.nextDouble();
		q.setParameter("start",start);
		q.setParameter("end", end);
		
		List<Employee>e=q.getResultList();
		System.out.println(e);
		 
		
		
		
		}

}
