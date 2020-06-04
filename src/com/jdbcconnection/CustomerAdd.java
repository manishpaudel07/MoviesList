package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CustomerAdd {
public static void main(String[] args) {
		
		//JDBC Programming
		try {
			//1.... loading the driver
			//every database has it;s own driver
			Class.forName("com.mysql.jdbc.Driver");
			//Making connection to the driver
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
			if(conn!=null){
				System.out.println("Db connection is established!!!!!!!!");
			}
			
			//Taking input from the user
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("enter the id ");
			int id=scanner.nextInt();
			System.out.println("Enter name ");
			String name=scanner.next();
			System.out.println("Enter email ");
			String email=scanner.next();
			System.out.println("Enter age ");
			int age=scanner.nextInt();
			System.out.println("Enter address ");
			String address=scanner.next();
			
			System.out.println("Enter marks ");
			int marks=scanner.nextInt();

			//Writting query
			String sql="insert into customer_tbl(cutomerid,name,email,age,address,marks) values(?,?,?,?,?,?)";
			//Compiling query and creating object of PreparedStatement
			
			PreparedStatement pstmt=conn.prepareStatement(sql);
			//setting values insid the compiled query
			pstmt.setInt(1, id);
			pstmt.setString(2,name);
			pstmt.setString(3,email);
			pstmt.setInt(4,age);
			pstmt.setString(5,address);
			pstmt.setInt(6,marks);
			//Fire the query
			int rows=pstmt.executeUpdate();
			System.out.println("Rows = "+rows);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
}
}
