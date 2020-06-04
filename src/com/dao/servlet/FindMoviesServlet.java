package com.dao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

@WebServlet("/findMovies")
public class FindMoviesServlet extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			MoviesDao dao=new MovieDabImpl();
			List<MoviesEntity> moviesList=dao.findAll();
			req.setAttribute("moviesList", moviesList);
			req.getRequestDispatcher("showMovies.jsp").forward(req, resp);
	
		}
}
