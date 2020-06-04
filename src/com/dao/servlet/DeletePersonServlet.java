package com.dao.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;
import com.sqlconnection.SQLConnection;

@WebServlet("/deletePerson")
public class DeletePersonServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	  String emailAddress=req.getParameter("temail");
		try {
			String sql=" delete from movies_list where email=?";
			Connection 	connection = SQLConnection.getConn();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
		  	
			preparedStatement.setString(1, emailAddress);
		    preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.getRequestDispatcher("findMovies").forward(req, resp);
}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
}