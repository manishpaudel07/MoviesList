package com.dao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbcconnection.MovieDabImpl;
import com.jdbcconnection.MoviesDao;

@WebServlet("/forgetPassword")
public class ForgetPasswordServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				String email=req.getParameter("temail");
				String password=req.getParameter("password");
				MoviesDao dao=new MovieDabImpl();
				try {
					dao.forgotPassword(email, password);
					req.setAttribute("msg","Successfully changed");
					req.getRequestDispatcher("index.jsp").forward(req, resp);
				} catch (Exception e) {
			
					e.printStackTrace();
				}
		
	}
	

}
