package demo.jsb.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SearchName {
public static void main(String[] args) {
	  EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
	  EntityManager em = emf.createEntityManager();
	  
	    Query q1=em.createQuery("select e from ProductDetails e where pname='phone'") ;
	         Object o =q1.getSingleResult();
	         ProductDetails p=(ProductDetails)o;
	         System.out.println(p);
	         
}
}
