  package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RetrieveInformation {

	public static void main(String[] args) {

		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_solutions","root","Mach0427$");
		
		PreparedStatement pst=con.prepareStatement("select * from employ");
		
		//to display database
			ResultSet rs=pst.executeQuery();
			ResultSetMetaData md=rs.getMetaData();
			
			for (int i=1;i<= md.getColumnCount();i++)
			{
				System.out.print(md.getColumnName(i)+"\t");
			}
			System.out.println("\n==============================================");
			
			while (rs.next())
			{
				for (int i=1;i<= md.getColumnCount();i++)
				{
					System.out.print(rs.getString(i)+"\t"+"\t");
				}
				System.out.println();
			}
		
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		{
			
		}
	}

}
}
