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
String id=request.getParameter("login");
String pd=request.getParameter("pwd");
int flag=0;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
Statement stmt=con.createStatement();
String query="select * from jsplogin";

ResultSet rs=stmt.executeQuery(query);
while(rs.next())  
{
	String name=rs.getString(1);
	String pwd=rs.getString(2);
 if(id.equals(name)&& pd.equals(pwd)) 
 {
	 flag=1;
 	break;
 }
}
if(flag==1)
{
 out.println("Authorized User");
}
else
{
 	out.println("Un Authorized User");	
}
 rs.close();
stmt.close();
 con.close();
%>
</body>
</html>