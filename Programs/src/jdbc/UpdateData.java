package jdbc;
import java.sql.*;
public class UpdateData {

	public static void main(String[] args) 
		throws ClassNotFoundException,SQLException
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		Statement stmt=con.createStatement();
		
		String query="update emp set  id='10'  WHERE name='praveen' ";
		
		int count=stmt.executeUpdate(query);
		
		System.out.println(count+" record updated");
		
		stmt.close();
		con.close();
		}

	}


