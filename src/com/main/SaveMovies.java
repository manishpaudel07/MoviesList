package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

public class SaveMovies {

	public static void main(String[] args) {
		
	
		String choice;
		try {
			
		
			do {
				
			
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your email:");
		String email=scanner.next();
		System.out.println("enter your password");
		String password=scanner.next();
		System.out.println("Enter the name of the movie: ");
		String name=scanner.next();
		System.out.println("Enter the year made: ");
		int year= scanner.nextInt();
		System.out.println("Enter the idmb: ");
		int idmb=scanner.nextInt();
		System.out.println("Enter the Category of the movie: ");
		String category=scanner.next();
		MoviesEntity entity=new MoviesEntity(0, name, year, idmb, category);
			entity.setEmailAddress(email);
			entity.setPassword(password);


		
		MoviesDao dao=new MovieDabImpl(); 
		dao.save(entity);
		System.out.println("Enter 'yes' to continue and 'no' to stop");
		choice=scanner.next();		
	
			}
			while(choice.equalsIgnoreCase("yes"));
			System.out.println("Data is saved into database");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
}
}
