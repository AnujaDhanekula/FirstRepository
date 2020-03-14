<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

String login=request.getParameter("login");
String pwd=request.getParameter("pwd");
String actno=request.getParameter("acno");
String actname=request.getParameter("acname");
String acttype=request.getParameter("ackype");
String balance=request.getParameter("balance");

String query="insert into users values(?,?)";
PreparedStatement pst=connection.prepareStatement(query);
pst.setString(1,login);
pst.setString(2,pwd);
int count=pst.executeUpdate();
if(count!=0)
{
String query1="insert into accounts values(?,?,?,?)";
PreparedStatement pst1=connection.prepareStatement(query1);

pst1.setString(1,actname);
pst1.setString(2,actno);
pst1.setString(3,acttype);
pst1.setString(4,balance);
int c1=pst1.executeUpdate();
if(c1!=0)
{
out.println("<h1>User Resigterd Succesfully...</h1>");
out.println("<h3>Login to access Bank Menu</h3>");
%>
<jsp:include page="BankSecond.html"/> 
<%
}
else
out.println("Failed to update");
}
else
{
out.println("Failed to update");
}
//statement.close();
connection.close();
}
catch(Exception e)
{
out.println(e);
}
%>
</body>
</html>