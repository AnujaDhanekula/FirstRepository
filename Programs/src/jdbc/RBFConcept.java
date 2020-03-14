package jdbc;
import java.io.*;


import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
public class RBFConcept 
{

	public static void main(String[] args)  throws IOException,SQLException,ClassNotFoundException 
	{
		
		  try
		  {
		  FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Anuja\\ctsdb.properties");
		  Properties p=new Properties();
		  p.load(fis);
		  String dname=(String) p.get("Dname");
		  String url=(String) p.get("URL");
		  String username=(String) p.get("Uname");
		      String password=(String) p.get("Pwd");
		      Scanner sc=new Scanner(System.in);
		System.out.println("enter table name");
		String tablename=sc.next();
		Class.forName(dname);
		System.out.println("Drivers Loaded");
		Connection con=DriverManager.getConnection(url,username,password);
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
		  ResultSet rs=st.executeQuery("select * from "+tablename);
		  ResultSetMetaData rsmd=rs.getMetaData();
		  System.out.println("========================");
		  for(int i=1;i<=rsmd.getColumnCount();i++)
		  System.out.println(rsmd.getColumnName(i)+" ");
		  System.out.println(" ");
		  System.out.println("=====================================");
		  while(rs.next())
		  {
		  for(int j=1;j<=rsmd.getColumnCount();j++)
		  System.out.println(rs.getString(j)+" ");
		  System.out.println(" ");
		 
		  }
		  st.close();
		  con.close();
		  }
		  catch(SQLException e)
		  {
		  System.out.println(e);
		  }
		 
	}
}



