<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
Statement statement=connection.createStatement();
String query="select * from CS_book";
ResultSet rs=statement.executeQuery(query);
while(rs.next())
{
String title = rs.getString(1);
String author = rs.getString(2);
String publisher = rs.getString(3);
String year_of_publication = rs.getString(4);
String price= rs.getString(5);
}


statement.close();
connection.close();
%>
</body>
</html>