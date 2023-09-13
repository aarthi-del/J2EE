package demo.jsb.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByNameSal {
public static void main(String[] args) {
	EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
	EntityManager em=emf.createEntityManager();
	  Query q=em.createQuery("select e.name,e.sal from  Employee e");
	 List<Object[]> l=q.getResultList();

      for( Object[] o:l) {
    	  System.out.println("Name :"+o[0]);
    	  System.out.println("sal :"+o[1]);

    	  
      }
	 


}
}
