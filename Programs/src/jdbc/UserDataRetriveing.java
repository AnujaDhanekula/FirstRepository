package jdbc;
import java.sql.*;
import java.util.Scanner;

public class UserDataRetriveing {

	public static void main(String[] args) throws SQLException {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter id no");
			
			int id=sc.nextInt();
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			 Statement statement=connection.createStatement();
			 
			 
			 String query="select * from emp where id="+id;
			 
			 PreparedStatement pst=connection.prepareStatement(query);
			 
			 ResultSet rs=statement.executeQuery(query);
			 
			   if(rs.next())
			   {
			       
			  System.out.println("id :"+rs.getInt(1)+"  name: "+rs.getString(2));
			   }
			   else
			   {
			   System.out.println("Enter valid id");
			   }
			}

	}


