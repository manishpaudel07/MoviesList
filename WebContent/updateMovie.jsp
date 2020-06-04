<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>Update Movies</title>
</head>
<body>
<header style="height: 30px;background-color:#dae0e5" >

</header>
<br>
<br>
<div class="container" style="width:50%">
<a >
<img src="img/moviesupdate.jpg" style="height:204px">
</a>
<div class="form-group">
	
	
	<form action="umovies" >

  <input type="hidden" class="form-control"  name="moviesId" value="${entity.movies_id}">
      <label for="email"> Email</label>
    <input type="email" class="form-control"  name="temail" value = "${entity.emailAddress}">
    
     <label for="password" >Password</label>
    <input type="password" class="form-control"  name="password" value="${entity.password}">
    
     <label for="name" > Movie name</label>
    <input type="name" class="form-control"  name="name" value="${entity.name}" >
  
     <label for="year" >Released Date</label>
    <input type="number" class="form-control"  name="year" value="${entity.year}" >
    
     <label for="idmb" >Idmb ratings</label>
    <input type="number" class="form-control"  name="idmb" value="${entity.idmb}" >
    
  	 <label for="category" >Movies' category</label>
    <select class="form-control"  name="category">
     <option ${entity.category=='drama'?'selected':''}>drama</option>
   
      <option ${entity.category=='romantic'?'selected':''}>romantic</option>
      <option ${entity.category=='documentary'?'selected':''}>documentary</option>
     <option ${entity.category=='thriller'?'selected':''}>thriller</option>
      <option ${entity.category=='comedy'?'selected':''}>comedy</option>
      <option ${entity.category=='suspense'?'selected':''}>suspense</option>
      <option ${entity.category=='action'?'selected':''}>action</option>
    </select>
    <br>
    
    <a>
    <button type="submit" class=" btn btn-primary" > update</button>
  	</a>
    <a href="logout">
    <button type="button" class=" btn btn-secondary" > logout</button>
	</a> 

 </form>
  </div>
</div>

</body>
</html>