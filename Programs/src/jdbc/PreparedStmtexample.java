package jdbc;
import java.sql.*;
import java.util.Scanner;
public class PreparedStmtexample{

	public static void main(String[] args) throws SQLException{
			
			 try {
			 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			 
			 Statement statement=connection.createStatement();
			 
			 String query="insert into customers values(?,?,?)";
			 
			PreparedStatement pst=connection.prepareStatement(query);
			
			  Scanner sc=new Scanner(System.in);
			  
			  System.out.println("enter customer id");
			  String id=sc.nextLine();
			  
			  System.out.println("enter customer name");
			  String name=sc.nextLine();
			  
			  System.out.println("enter customer ctype");
			  String ctype=sc.nextLine();
			  
			  pst.setString(1, id);
			  pst.setString(2, name);
			  pst.setString(3, ctype);
			  
			  int x=pst.executeUpdate();
			  System.out.println(x+" Record inserted");
			  }
			catch(SQLException e)
			 {
			  System.out.println(e);
			 }
			 }
			
	}


