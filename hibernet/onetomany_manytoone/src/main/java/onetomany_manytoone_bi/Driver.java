package onetomany_manytoone_bi;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Staff s=new Staff();
	s.setSname("malar");
	s.setSub("tamill");
	
	Student std=new Student();
	std.setName("Aarthi");
	std.setAge(21);
	std.setStaff(s);
	std.setMarks(67);
	
	Student std1=new Student();
	std1.setName("Aarthi");
	std1.setAge(21);
	std1.setStaff(s);
	std1.setMarks(67);
	
	Student std2=new Student();
	std2.setName("Aarthi");
	std2.setAge(21);
	std2.setStaff(s);
	std2.setMarks(67);
	
	
	ArrayList<Student> student = new ArrayList<Student>();
	student.add(std);
	student.add(std1);
	student.add(std2);
	
	s.setStd(student);
	
	et.begin();
	em.persist(s);
	em.persist(std);
	em.persist(std1);
	em.persist(std2);
	et.commit();
	System.out.println("data inserted");
	
	
	
     
	
	
	
}
}
