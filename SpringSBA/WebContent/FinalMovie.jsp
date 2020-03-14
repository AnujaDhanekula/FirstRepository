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

String uname=(String)request.getAttribute("name");

int uage=(Integer)request.getAttribute("age");

float uprice=(float)request.getAttribute("price");

response.setContentType("text/html");

out.println("<html><body>");

out.println("Name of the User :"+uname);

out.println("<br>Age of the User :"+uage);

out.println("<br>Movie Ticket Price is:$"+uprice);

out.println("</html></body>");

     %>

</body>

</html>