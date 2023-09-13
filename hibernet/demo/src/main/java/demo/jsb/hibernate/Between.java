package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Between {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
	EntityManager em=emf.createEntityManager();
	Query q=em.createQuery("select e from  Employee e order by e.sal desc" );
    List< Employee> l= q.getResultList();
    System.out.println(l);
   }
}
