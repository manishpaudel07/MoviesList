package com.main;

import java.util.Scanner;

import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

public class DeleteMovies {
	public static void main(String[] args) {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the movie id: ");
			int mid=scanner.nextInt();
			MoviesDao dao=new MovieDabImpl();
			dao.deleteMovies(mid);
			System.out.println("movies_id "+mid+ " has been deleted");
			
			System.out.println("the database record after deletion");
			dao.findAll().forEach(System.out::println);
		
			scanner.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
