package demo.jsb.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchName {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
        Query q=em.createQuery("select e from  Employee e where e.name='surya'");	
        Object o=q.getSingleResult();
        Employee e=( Employee)o;
        System.out.println(e);
               
		
		}

}
