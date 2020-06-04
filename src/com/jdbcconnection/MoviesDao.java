package com.jdbcconnection;

import java.util.List;
import java.util.Optional;

import com.dao.entity.MoviesEntity;

public interface MoviesDao {

	

	String save(MoviesEntity entity) throws Exception;

	List<MoviesEntity> findAll();

	void deleteMovies(int movies_id) throws Exception;

	void updateMovies(MoviesEntity entity) throws Exception;

	Optional<MoviesEntity> findLoginUser(String email, String password);

	int deleteMoviesByEmailAddress(String emailAddress);


	public MoviesEntity findMoviesById(int  moviesId);

	void forgotPassword(String email, String password) throws Exception;

//	String updateByMoviesId(MoviesEntity entity);

	
}
