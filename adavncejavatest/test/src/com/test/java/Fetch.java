package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Fetch {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement st=c.prepareStatement("insert into student values(?,?,?,?)");
			System.out.println("enter the count :");
			int count =sc.nextInt();
			for(int i=1;i<=count;i++) {
				System.out.println("enter the Student name:");
			     String sn=sc.next();
				System.out.println("enter the Student sid:");
				int sid=sc.nextInt();
				System.out.println("enter the Student marks:");
				double marks=sc.nextDouble();
				System.out.println("enter the Student phno:");
				long phno=sc.nextLong();
			    st.setString(1, sn);
			    st.setInt(2, sid);
			    st.setDouble(3,marks);
				st.setLong(4, phno);
				
				st.addBatch();
				
			}
			
				
				
				
			int[] arr=st.executeBatch();
     		System.out.println(Arrays.asList(Arrays.toString(arr)));
			
			c.close();
		

	}catch(ClassNotFoundException| SQLException e)
	{
			
			e.printStackTrace();
		}
}

}
