package jdbc;
import java.sql.*;
public class BatchProConcept {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivers loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		System.out.println("connection established");
		con.setAutoCommit(false);
		Statement st=con.createStatement();
		st.addBatch("insert into customers values(2,'ruchi','sliver')");
		st.addBatch("delete from customers where id=3");
		st.addBatch("update customers set name='mydhili' where id=4");
		int res []=st.executeBatch();
		for(int i=0;i<res.length;i++)
		{
		System.out.println("no of rows effeccted "+res[i]);
		}
		con.commit();
		con.rollback();
		con.close();
		}
	
	}


