<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container padding-bottom-3x mb-2 mt-5">
	    <div class="row justify-content-center">
	        <div class="col-lg-8 col-md-10">
	           <form action="forgetPassword" method="post">
	

    <label for="email" >Enter your email address</label>
    <input type="email" class="form-control" placeholder="Enter email" name="temail">
    <br>
     <label for="password" >Enter your new password</label>
    <input type="password" class="form-control" placeholder="Enter your new password" name="password">
    <br>
    <button type="submit" class=" btn btn-primary" > Submit</button>
 	 <a href="forgotPassword.jsp">
 	 <button type="button" class="btn btn-success">	Forgot password</button>
 	 </a>
 </form>
	        </div>
	    </div>
	</div>
</body>
</html>