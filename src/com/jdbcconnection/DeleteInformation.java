package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteInformation {

	public static void main(String[] args) {

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
		
		PreparedStatement prt=con.prepareStatement("delete from employ where emp_id=?");
		
		Scanner scan=new Scanner (System.in);
		System.out.println("enter the employee id: ");
		int emp_id=scan.nextInt();
		prt.setInt(1, emp_id);
		int result=prt.executeUpdate();
		
		scan.close();
		con.close();
		
		if(result>0)
		{	
		System.out.println("the typed " +emp_id+" employee id  has been deleted");
		}
		else 
		{
			System.out.println("the error has occured :");
		}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}

	}

}
