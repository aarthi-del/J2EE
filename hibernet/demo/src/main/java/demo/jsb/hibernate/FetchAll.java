package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	
	public static void main(String[] args) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		 EntityManager em=emf.createEntityManager();
		 Query q=em.createQuery("select e from  Employee e");
		 //System.out.println(q);//address will be printed
		  List<Employee> l=q.getResultList();
		  System.out.println(l);
	}

}

