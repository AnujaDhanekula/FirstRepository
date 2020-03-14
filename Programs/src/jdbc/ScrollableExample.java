package jdbc;
import java.sql.*;
public class ScrollableExample 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		
	      try {
	      DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	      System.out.println("Drivers loaded...");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
	      System.out.println("Connection established..");
	      
	  DatabaseMetaData dmd=con.getMetaData();
	  System.out.println("DB name :"+dmd.getDatabaseProductName());
	  System.out.println("DB version :"+dmd.getDatabaseProductVersion());
	  System.out.println("name of driver :"+dmd.getDriverName());
	  System.out.println("version of driver:"+dmd.getDriverVersion());
	  System.out.println("Major version of driver:"+dmd.getDriverMajorVersion());
	  System.out.println("minor version of driver :"+dmd.getDriverMinorVersion());

	         //user db details
	  Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery("select * from emp");
	  ResultSetMetaData rsmd=rs.getMetaData();
	   //own code
	  while(rs.next())
	   {
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	   }
	  
	  rs.first();
	  System.out.println("first one is:");
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	  
	  rs.last();
	  System.out.println("last one is:");
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	  
	  rs.absolute(3);
	  System.out.println("third from stating  is:");
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	  
	  rs.relative(3);
	  System.out.println("third from relative  is:");
	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	
	      }
	      catch(SQLException e)
	      {
	      System.out.println(e);
	      }
	     

	}

}
