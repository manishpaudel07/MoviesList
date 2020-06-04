package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateInformation {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
			System.out.println("connected successfully ");
			PreparedStatement prt=con.prepareStatement(" update employ set   emp_name=? , emp_salary=? where emp_id=? ");
			
			Scanner scan=new Scanner(System.in);
			String choice;
			do
			{
			System.out.println("enter the employee name: ");
			String emp_Name=scan.next();
			
			System.out.println("enter the employee salary: ");
			float emp_Salary=scan.nextFloat();
			
			System.out.println("enter the employee id");
			int emp_Id=scan.nextInt();
			
			prt.setString(1, emp_Name);
			prt.setFloat(2, emp_Salary);
			prt.setInt(3, emp_Id);
			
			int result=prt.executeUpdate();
			
			if (result>0)
			{
				System.out.println("the data is inserted :"+result);
			}
			else {
				
					System.out.println("the data is not inserted :");
			}
			
			System.out.println("'yes' to continue and 'no' to stop");
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
