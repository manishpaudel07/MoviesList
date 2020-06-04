package com.main;

import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

public class FetchMovies {

	public static void main(String[] args) {
		try {
			
		MoviesDao dao=new MovieDabImpl();
		dao.findAll().forEach(System.out::println);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
