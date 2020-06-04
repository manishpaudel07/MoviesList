<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.dao.entity.MoviesEntity"%>
<%@page import="java.util.List"%>
<%@page import="com.jdbcconnection.MovieDabImpl"%>
<%@page import="com.jdbcconnection.MoviesDao"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<title>Movies List</title>
</head>
<body>
<header  style="height: 30px;background-color: #dae0e5;">
   <b style="margin-left: 50px;">Hello!  ${sessionScope.userData.emailAddress}</b>
   </header>
<br>
<br>
		
<div class="container">  
    <img alt="photo" src="img/movies.jpg" style="height: 147px">
    <hr>
    <h1 style="text-align:center;color:hsla(0, 25%, 17%, 0.55);">${message}</h1>
    <br>
  <table class="table table-dark table-striped">
    <thead>
      <tr>
      	<th>MoviesID</th>
      	<th>Email</th>
      	<th>Password</th>
        <th>Name of the movie</th>
        <th>Year</th>
        <th>Idmb</th>
        <th>Category</th>
        <th>Action</th>
        
      </tr>
    </thead>
    <tbody>
    

  		 <c:forEach  items="${moviesList}"  var="entity">
      <tr>
      	<td>${entity.movies_id}</td>
      	  <td>${entity.emailAddress}</td>
      	      <td>${entity.password}</td>
        <td>${entity.name}</td>
        <td>${entity.year}</td>
        <td>${entity.idmb}</td>
        <td>${entity.category}</td>
  		
  		<td>
  		
  		<c:if test="${entity.emailAddress!=sessionScope.userData.emailAddress}">
		<a href="deletePerson?temail=${entity.emailAddress}">
  		 <img src="img/delete.png" style="height:30px">
  		</a>
  		 
  	
        
        <a href="editMovies?moviesId=${entity.movies_id}">
        <img alt="edit" src="img/edit.jpg" style="height:30px">
       </a>
  	</c:if>
        </td>
      </tr>
      </c:forEach>
 
    </tbody>
  </table>
  <a href="Register.jsp">
    <button type="button" class=" btn btn-success" > Register</button>
	</a> 
	<a href="logout"> 
   				  	 <button type="button" class="btn btn-primary">Logout</button>
   				  </a>
</div>

</body>
</html>