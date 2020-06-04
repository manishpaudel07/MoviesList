package com.dao.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;
import com.sqlconnection.SQLConnection;

@WebServlet("/umovies")
public class UpdateMoviesServlet extends HttpServlet{
	

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			
		String moviesId=req.getParameter("moviesId");
		int movieID=Integer.parseInt(moviesId);
		String email=req.getParameter("temail");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		String year=req.getParameter("year");
		String idmb=req.getParameter("idmb");
		String category=req.getParameter("category");
	
		try {
			String sql="update movies_list set email=?,password=?,name=?,year=?,idmb=?,category=? where movies_id=?";
		
		Connection connection=SQLConnection.getConn();
		PreparedStatement preparedStatement= connection.prepareStatement(sql);
		
		preparedStatement.setString(1, email);
		 
			preparedStatement.setString(2, password);
		
		preparedStatement.setString(3, name);
		preparedStatement.setString(4, year);
		preparedStatement.setString(5, idmb);
		preparedStatement.setString(6, category);
		preparedStatement.setInt(7, movieID);
		
		preparedStatement.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		req.setAttribute("message", "successfully updated");
		req.getRequestDispatcher("findMovies").forward(req, resp);
}
}

