<%@page import="com.jdbcconnection.MovieDabImpl"%>
<%@page import="com.jdbcconnection.MoviesDao"%>
<%@page import="com.dao.entity.MoviesEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email=request.getParameter("temail");
String password=request.getParameter("password");
String name=request.getParameter("name");
String year=request.getParameter("year");
int yearMovies=Integer.parseInt(year);
String idmb=request.getParameter("idmb");
int idmbMovies=Integer.parseInt(idmb);
String category=request.getParameter("category");
MoviesEntity entity=new MoviesEntity(0, name, yearMovies, idmbMovies, category);
	entity.setEmailAddress(email);
	entity.setPassword(password);
MoviesDao dao=new MovieDabImpl(); 
dao.save(entity);

// setting message inside request scope
request.setAttribute("message", "Successfully registered");
%>

<jsp:forward page="Register.jsp"></jsp:forward>
</body>
</html>