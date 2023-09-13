package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchOnlyName {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
	EntityManager em=emf.createEntityManager();
	   Query q=em.createQuery("select e.name from  Employee e");//we can all sql in that that will show the result
	           List<String> e=   q.getResultList();
	           System.out.println(e);
	           
	           
	           
	    
} 
}
