package com.jdbcconnection;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparest {

	public static void main(String[] args) {


		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
		
		PreparedStatement pst=con.prepareStatement("insert into employ (emp_id,emp_name,emp_salary) values(?,?,?)");
		
		Scanner scan=new Scanner(System.in);
		
		
		String choice;
		do {
		System.out.println("enter employ id:");
		int eid=scan.nextInt();
		
		System.out.println("enter employ name:");
		String eName=scan.next();
		
		System.out.println("enter employ salary:");
		float eSalary=scan.nextFloat();
		
		
		
		pst.setInt(1,eid);
		pst.setString(2, eName);
		pst.setFloat(3, eSalary);
		int result=pst.executeUpdate();
		System.out.println("the data inserted"+result);
		
		System.out.println("yes to add more and no to stop");
		choice=scan.next();
		
		
		}
			while(choice.equalsIgnoreCase("yes"));
		scan.close();
		con.close();
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		
	}

}
}
