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
String name=request.getParameter("login");
String pwd=request.getParameter("pwd");
int flag=0;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
Statement statement=connection.createStatement();
String query="select * from users";
ResultSet rs=statement.executeQuery(query);
while(rs.next())
{
String uname = rs.getString(1);
String password = rs.getString(2);
if((name.equals(uname))&&(pwd.equals(password)))
{
flag=1;
 break;
}
}
if(flag==1)
{
%>
<jsp:include page="BankTransactionMenu.html"/>
<%
}
else
out.println("UnAuthorised Users");
statement.close();
connection.close();
%>
</body>
</html>