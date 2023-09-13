package demo.jsb.hibernate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDriver {
public static void main(String[] args) {
      EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
      EntityManager em= emf.createEntityManager();
      EntityTransaction et =em.getTransaction();
      ProductDetails pd =new ProductDetails();
      
      pd.setPname("apple");
      pd.setPno(6);
      pd.setPrice(50);
      et.begin();
      em.persist(pd);
      et.commit();
      
}
}
