package com.test.java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
	  Scanner s =new Scanner(System.in);
	  
	  System.out.println("enter the count ");
	  int count =s.nextInt();
	 	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_table","root","root");
			PreparedStatement st=c.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
			for(int i=1;i<=count;i++) {
				 
				  System.out.println("enter the empid");
				  int eid =s.nextInt() ;
				  System.out.println("enter the employee name");
				  String ename =s.next();
				  System.out.println("enetr the salary");
				  double sal =s.nextDouble();
				  System.out.println("enter thr job");
				  String job=s.next();
				  
				  System.out.println("enter the company name ");
				  String company =s.next();
				  
				  System.out.println("enetr the email id");
				  String email=s.next();
				  
				  System.out.println("enter the password");
				  String password =s.next();
				  
				  System.out.println("enter the phone number");
				  long pno=s.nextLong();
				  
			     st.setInt(1, eid);
			     st.setString(2,ename);
			     st.setDouble(3,sal);
			     st.setString(4, job);
			     st.setString(5,company);
			     st.setString(6, email);
			     st.setString(7, password);
			     st.setLong(8, pno);
			     st.executeUpdate();
			     st.addBatch();
			     
			    
			     c.close();
			     }
	 }
	 catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
}
} 
   