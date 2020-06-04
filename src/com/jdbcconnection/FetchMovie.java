package com.jdbcconnection;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FetchMovie {

	public static void main(String[] args) {
		try {
			  //Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			//Creating connection to the database
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_db","root","Mach0427$");
			if(connection!=null)  {
				System.out.println("Connection is created!!!!!!!!!!!");
			}
			
			String sql="select idmovie_tbl, name, year,rating,budget,teams,createdate from movie_tbl";
			PreparedStatement pstmt=connection.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			List<MoviesEntities> movies=new ArrayList<>();
			while(rs.next()) {
		           int mid= rs.getInt(1);
		           String name= rs.getString(2);
		           int year= rs.getInt(3);
		           int rating= rs.getInt(4);
		           BigDecimal budget= rs.getBigDecimal(5);
		           int teams= rs.getInt(6);
		           Timestamp createDate= rs.getTimestamp(7);
		           MoviesEntities entity=new MoviesEntities(mid, name, year, rating, budget.longValue(), teams, createDate);
		           movies.add(entity);
		}
		    System.out.println(" data is saved into database");
		    
		    movies.forEach(System.out::println);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
