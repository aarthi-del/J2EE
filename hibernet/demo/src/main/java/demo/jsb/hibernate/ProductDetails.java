package demo.jsb.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductDetails {
	
	
  private String Pname;
  private double Price;
 
  private int Pno;
  @Id


  
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
public int getPno() {
	return Pno;
}
public void setPno(int pno) {
	Pno = pno;
}
@Override
public String toString() {
	return "ProductDetails [Pname=" + Pname + ", Price=" + Price + ", Pno=" + Pno + "]";
}
  
  
  
}
