package com.jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dao.entity.MoviesEntity;
import com.sqlconnection.SQLConnection;

public class MovieDabImpl implements MoviesDao {
	
	
	
	@Override
	public String save(MoviesEntity entity) throws Exception {
		
		Connection connection= SQLConnection.getConn();
		String sql="insert into movies_list(email,password,name,year,idmb,category) values(?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, entity.getEmailAddress());
		preparedStatement.setString(2, entity.getPassword());
		preparedStatement.setString(3, entity.getName());
		preparedStatement.setInt(4, entity.getYear());
		preparedStatement.setInt(5, entity.getIdmb());
		preparedStatement.setString(6, entity.getCategory());
		
		preparedStatement.execute();
		return "success";
	}
	
	@Override
	public  List<MoviesEntity> findAll()  {
		
		String sql="select movies_id,email,password,name,year,idmb,category from movies_list";
		List<MoviesEntity>entities=new ArrayList<MoviesEntity>();
		
		
		try {
			Connection connection= SQLConnection.getConn();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet;
			resultSet = preparedStatement.executeQuery(sql);
			while(resultSet.next())
			{
				int moviesId=resultSet.getInt(1);
				String email=resultSet.getString(2);
			String password=resultSet.getString(3);
				
				String name=resultSet.getString(4);
				int year=resultSet.getInt(5);
				int idmb=resultSet.getInt(6);
				String category=resultSet.getString(7);
		
				MoviesEntity entity=new MoviesEntity(moviesId, name, year, idmb, category);
				entity.setEmailAddress(email);
				entity.setPassword(password);
				entities.add(entity);
		} 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
		
	}
	
	@Override
	public Optional<MoviesEntity> findLoginUser(String email, String password) {
		MoviesEntity entity=null;
		String sql="select movies_id,name,year,idmb,category,email,password from movies_list where email=? and password=?";
		Connection connection;
		try {
			connection = SQLConnection.getConn();
		
		
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next())
		{
			entity=new MoviesEntity(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4),resultSet.getString(5));
			entity.setEmailAddress(resultSet.getString(6));
			entity.setPassword(resultSet.getString(7));
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.ofNullable(entity);
		
	}
	
	@Override
	public void deleteMovies(int movies_id) throws Exception
	{
		String sql=" delete from movies_list where movies_id=?";
		Connection connection=SQLConnection.getConn();
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
		preparedStatement.setInt(1, movies_id);
		preparedStatement.execute();
		
		
	}
	
	@Override
	public int deleteMoviesByEmailAddress(String emailAddress) 
	{
		int rowcount=0;
		
		String sql=" delete from movies_list where email=?";
	
		try {
			Connection connection = SQLConnection.getConn();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, emailAddress);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return rowcount;
	}
	
	@Override
	public void updateMovies(MoviesEntity entity) throws Exception
	{
		String sql="update movies_list set idmb=? where movies_id=?";
		Connection connection=SQLConnection.getConn();
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, entity.getIdmb());
		preparedStatement.setInt(2, entity.getMovies_id());
		preparedStatement.execute();	
	}
	
	@Override
	public void forgotPassword(String email, String password) throws Exception
	{
		String sql="update movies_list set password=? where emailAddress=?";
		Connection connection=SQLConnection.getConn();
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		preparedStatement.executeUpdate();	
	}
	
	
	/*@Override
	public String updateByMoviesId(MoviesEntity entity)
	{
		int rowcount = 0;
		String sql="update movies_list set movies_id=?,name=?,year=?,idmb=?,category=?,email=?,password=? where movies_id=?";
		Connection connection;
		try {
			connection = SQLConnection.getConn();
			PreparedStatement preparedStatement= connection.prepareStatement(sql);
			MoviesEntity entity2= findMoviesById(entity.getMovies_id());
			
			boolean status=false;
			
//			if (entity.getMovies_id() != null) 
//			{
//				entity2.setMovies_id(entity.getMovies_id());
//			}else {
//				return "user id not present!";
//			}
//		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
	
	@Override
	public MoviesEntity findMoviesById(int  moviesId)
	{
		MoviesEntity entity=null;
		String sql="select movies_id,name,year,idmb,category,email,password from movies_list where movies_id=?";
		try { 
		Connection connection=SQLConnection.getConn();
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		preparedStatement.setInt(1, moviesId);
		ResultSet resultSet= preparedStatement.executeQuery();
		if (resultSet.next()) {
			entity=new MoviesEntity(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getInt(4), resultSet.getString(5));
			entity.setEmailAddress(resultSet.getString(6));
			entity.setPassword(resultSet.getString(7));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return entity;
	
	}
}
