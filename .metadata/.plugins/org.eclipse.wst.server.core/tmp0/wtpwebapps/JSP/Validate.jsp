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
	String id=request.getParameter("login");
	String pd=request.getParameter("pwd");
	
	  	if(id.equals("anuja")&& pd.equals("1234")) {%>
			<h1 style-"color:green"> Authorized User </h1>
		<%} else { %>	
				<h1 style-"color:Red"> Un Authorized User </h1>

<% } %>

</body>
</html>