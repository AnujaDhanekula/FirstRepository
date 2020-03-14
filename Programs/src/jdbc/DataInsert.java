package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	   //DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement stmt=con.createStatement();
		String query="insert into emp values (5,'SIRI','AMERPET')";
		stmt.executeUpdate(query);
		System.out.println("inserted...");
		stmt.close();
		 con.close();
	}

}
