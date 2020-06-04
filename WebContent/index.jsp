<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <title>Movies </title>
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

<img src="img/books.jpeg" style="height:204px">
	<h1>${ message}</h1>
<div class="form-group"  >
	
	
	<form action="auth" method="post">
	
    <label for="email" >Enter your email address</label>
    <input type="email" class="form-control" placeholder="Enter email" name="temail">
    <br>
     <label for="password" >Enter your password</label>
    <input type="password" class="form-control" placeholder="Enter your password" name="password">
    <br>
    <button type="submit" class=" btn btn-primary" > Submit</button>
 	 <a href="forgotPassword.jsp">
 	 <button type="button" class="btn btn-success">	Forgot password</button>
 	 </a>
 </form>
  </div>
</div>
</body>
</html>