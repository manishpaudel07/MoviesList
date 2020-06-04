<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style= "background-color:skyblue">

<h1></h1>
<%
	String getEmail=request.getParameter("Email");
	String getPassword=request.getParameter("Password");
		//getValue=getValue.toUpperCase();
		StringBuilder builder= new StringBuilder(getEmail);
		 String reverse=builder.reverse().toString();
		 String result="";
		 int flag=0;
		 if ( getEmail.equalsIgnoreCase("anish@gmail.com") && getPassword.equalsIgnoreCase("1234"))
{
	result="You are successfully logged in";
	flag=1;
}
		 else
			 result="You enter the wrong password or email";
%>	


<h1>  <%= result %></h1>
<h2>  reversing the email: <%=reverse %></h2>
<%
	if (flag==1)
	{%>
		<img src="img/books.jpeg" style="height:204px">
	<% }%>

 
</body>
</html>