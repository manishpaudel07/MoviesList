<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<header  style="height: 30px;background-color: #dae0e5;">
   <b style="margin-left: 50px;">Hello!  ${sessionScope.movies_id}</b>
   <b style="margin-left: 50px;">Favorite Movie:  ${sessionScope.userData.name}</b>
   </header>
   
   <br>
   <br>
    <div  class="container">
         <img src="img/books.jpeg"  style="height: 139px">
         
          <a href="Register.jsp"> 
         <button type="button" class="btn btn-primary">Manage Users</button>
         </a>
         <a href="findMovies"> 
         <button type="button" class="btn btn-secondary">Show Movies</button>
         </a>
   				   <a href="logout"> 
  	        <button type="button" class="btn btn-warning">Logout</button>
   				  	</a>
         <hr/>
         
     
    </div>
   
</body>
</html>