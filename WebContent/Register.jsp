<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <title>Email </title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>

<body>

<header style="height: 30px;background-color:#dae0e5" >

</header>
<br>

<div class="container" style="width:50%">
<a href="showMovies.jsp">
<img src="img/books.jpeg" style="height:204px">
</a>
<div class="form-group"  >
	
	<h1>${ message}</h1>
	<form action="users" >
	
	
	
      <label for="email" >Enter your email</label>
    <input type="email" class="form-control"  name="temail">
    
      <label for="password" >Enter your password</label>
    <input type="password" class="form-control"  name="password">
    
     <label for="name" >Enter a movie name</label>
    <input type="name" class="form-control"  name="name">
  
     <label for="year" >Enter the year made</label>
    <input type="number" class="form-control"  name="year">
    
     <label for="idmb" >Enter your idmb ratings</label>
    <input type="number" class="form-control"  name="idmb">
    
  	 <label for="category" >Enter your movies' category</label>
    <select class="form-control"  name="category">
    <option> drama</option>
    <option> romantic</option>
    <option>documentary</option>
    <option> thriller</option>
    <option> dark</option>
    <option> suspense </option>
    <option> action </option>
    </select>
    <br>
     <a href="Register.jsp">
    <button type="submit" class=" btn btn-success" > Register</button>
    </a>
      
    <a href="findMovies">
    <button type="button" class=" btn btn-secondary" > Show Movies</button>
	</a> 
	<a href="logout">
    <button type="button" class=" btn btn-danger" > logout</button>
    </a>
	
 </form>
  </div>
</div>
</body>
</html>