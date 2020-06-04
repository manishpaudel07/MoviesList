package com.dao.servlet;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.entity.MoviesEntity;
import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

@WebServlet("/auth")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		String temail=req.getParameter("temail");
		String password=req.getParameter("password");
		MoviesDao dao=new MovieDabImpl();
	Optional<MoviesEntity> optional = dao.findLoginUser(temail, password);
	if (optional.isPresent())
		{
		HttpSession session = req.getSession();
			session.setAttribute("userData", optional.get());
			session.setMaxInactiveInterval(10);
			req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
		}else
			{
			req.setAttribute("message", "Sorry username or password is incorrect");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
	
			}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doPost(req,resp);
		
	}
    	
		
				
	
}
