package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NameLike {
	public static void main(String[] args) {
		  EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		  EntityManager em = emf.createEntityManager();
		  
		    Query q1=em.createQuery("select e from ProductDetails e where pname like '%a%a%'") ;
		   List<ProductDetails>l =q1.getResultList();
		   System.out.println(l);
	}

}
