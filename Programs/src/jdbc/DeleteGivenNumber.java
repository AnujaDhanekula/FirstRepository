package jdbc;
import java.sql.*;
import java.util.Scanner;
public class DeleteGivenNumber {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter if to delete");
		int id=sc.nextInt();
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement statement=connection.createStatement();
		String query="delete from customers where id="+id;
		int count=statement.executeUpdate(query);
		System.out.println(count+" record deleted");
		statement.close();
		connection.close();
	}
		
 
}
