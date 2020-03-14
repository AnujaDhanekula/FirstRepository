package jdbc;
import java.sql.*;
public class Datadisplay 
{
	/*public static void main(String [] args) throws ClassNotFoundException ,SQLException
	
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
   //DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from emp");
	while(rs.next())  
	{
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	}
	rs.close();
	stmt.close();
	 con.close();
		
	
	}
}*/
public static void main(String [] args) throws ClassNotFoundException ,SQLException
	
	{
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	
	Statement stmt=con.createStatement();
	
	String query="insert into employee values ('veena','123','java','PAT','CTS','veena@gmail.com')";
	
	stmt.executeUpdate(query);
	
	System.out.println("inserted....");
	
	stmt.close();
	con.close();
	}
}

