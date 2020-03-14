package jdbc;
import java.sql.*;
public class TableCreation {

	public static void main(String[] args) 
		throws ClassNotFoundException,SQLException
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		Statement stmt=con.createStatement();
		
		String query="create table student(id integer(10),name varchar(25))";
		
		int count=stmt.executeUpdate(query);
		
		System.out.println(count+" table created");
		
		stmt.close();
		con.close();
		}

	}


