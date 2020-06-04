package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
			System.out.println("Connected Successfully:");
			
			Statement st=con.createStatement();
			
			
			Scanner scan=new Scanner(System.in);
			String choice;
			do {
			System.out.println("enter employ id:");
			int eid=scan.nextInt();
			
			System.out.println("enter employ name:");
			String eName=scan.next();
			
			System.out.println("enter employ salary:");
			float eSalary=scan.nextFloat();
			
			int status=st.executeUpdate("insert into employ values("+eid+",'"+eName+"',"+eSalary+")");
			System.out.println("the record inserted: "+status);
			
			System.out.println("enter yes to continue and no to stop the program");
			choice=scan.next();
			}
		while(choice.equalsIgnoreCase("yes"));
			scan.close();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
		e.printStackTrace();
		{
			
		}
	}
	}
}


