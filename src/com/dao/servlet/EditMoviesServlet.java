package com.dao.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;
import com.sqlconnection.SQLConnection;

@WebServlet("/editMovies")
public class EditMoviesServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pid=req.getParameter("moviesId");
		MoviesDao dao=new MovieDabImpl();
		MoviesEntity entity=dao.findMoviesById(Integer.parseInt(pid));
			req.setAttribute("entity", entity);
			req.getRequestDispatcher("updateMovie.jsp").forward(req, resp);
		

	
	}
	}


