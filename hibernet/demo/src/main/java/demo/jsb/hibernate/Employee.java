package demo.jsb.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
 
 @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", Pno=" + Pno + "]";
	}
private int id;
 @Id
 private String name;
 private double sal;
 private Long Pno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public Long getPno() {
	return Pno;
}
public void setPno(Long pno) {
	Pno = pno;
}
 

}
