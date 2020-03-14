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
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
String ID=request.getParameter("id");
String NAME=request.getParameter("name");
String DEPT=request.getParameter("dept");
String DESIG=request.getParameter("desig");
String CMPY=request.getParameter("cmpy");
String EMAIL=request.getParameter("email");

String query="update student set name=?,dept=?,desig=?,cmpy=?,email=? where id=?";

PreparedStatement pst=con.prepareStatement(query);
pst.setString(1,NAME);
pst.setString(2,DEPT);
pst.setString(3,DESIG);
pst.setString(4,CMPY);
pst.setString(5,EMAIL);
pst.setString(6,ID);
int count=pst.executeUpdate();
if(count!=0)
{
		out.println("Data Updated Successfully.....");
}
else
{
	out.println("Failed to update");
}

con.close();
}
catch(Exception e)
{
	out.println(e);
}
%>

</body>
</html>