package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowCustomer {

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
					
					PreparedStatement pre=conn.prepareStatement("Select * from customer_tbl");
					
					ResultSet rs=pre.executeQuery(); // helps to execute the given query in the pre
					ResultSetMetaData md=rs.getMetaData();// get the data
					
					for (int i=1;i<= md.getColumnCount();i++)
					{
						System.out.print(md.getColumnName(i)+"\t");
					}
					System.out.println("\n==============================================");
					
					while (rs.next())
					{
						for (int i=1;i<= md.getColumnCount();i++)
						{
							System.out.print(rs.getString(i)+"\t");
						}
						System.out.println();
					}
				
				
				}catch (Exception e)
				{
					e.printStackTrace();
				}
		}
		}
