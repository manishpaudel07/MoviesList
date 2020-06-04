package com.dao.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;
import com.sqlconnection.SQLConnection;


@WebServlet("/users")
public class MoviesUsersServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=request.getParameter("temail");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String year = (request.getParameter("year"));
		String idmb = (request.getParameter("idmb"));
		String category=request.getParameter("category");
		
	
		int moviesYear=Integer.parseInt(year);
		int idmbMovies=Integer.parseInt(idmb);
		
		MoviesEntity entity=new MoviesEntity(0, name, moviesYear, idmbMovies, category);
		MoviesDao dao=new MovieDabImpl();
		entity.setEmailAddress(email);
		entity.setPassword(password);
		try {
			dao.save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("message", "Successfully registered");
		request.getRequestDispatcher("Register.jsp").forward(request, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			doPost(req,resp);
	}
}
