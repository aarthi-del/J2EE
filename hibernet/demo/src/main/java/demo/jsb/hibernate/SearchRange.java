package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SearchRange {
	public static void main(String[] args) {
		  EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		  EntityManager em = emf.createEntityManager();
		  
		    Query q1=em.createQuery("select e from ProductDetails e where Price between 100 and 1000") ;
		       List<ProductDetails> r=q1.getResultList();
		       System.out.println(r);
	}

}
