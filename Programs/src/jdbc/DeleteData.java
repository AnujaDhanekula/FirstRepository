package jdbc;
import java.sql.*;
public class DeleteData {
	public static void main(String[] args) 
		throws ClassNotFoundException,SQLException
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		Statement stmt=con.createStatement();
		
		String query="delete from emp where id=1";
		
		int count=stmt.executeUpdate(query);
		
		System.out.println(count+" record deleted");
		
		stmt.close();
		con.close();
		}
		
	}


