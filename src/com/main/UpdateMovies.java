package com.main;

import java.util.Scanner;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

public class UpdateMovies {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter an Idmb of the movies: ");
		int idmb=scanner.nextInt();
		System.out.println("enter the id of the movies: ");
		int movies_id=scanner.nextInt();
		
		MoviesDao dao= new MovieDabImpl();
		MoviesEntity entity =new MoviesEntity(movies_id, null, 0, idmb, null);
		dao.updateMovies(entity);
		System.out.println("the database has been updated");

	}

}
