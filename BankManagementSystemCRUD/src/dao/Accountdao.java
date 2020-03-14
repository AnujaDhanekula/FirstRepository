package dao;
import java.sql.*;
import java.util.*;

public class Accountdao 
{
	private static String jdbcURL;
    private static String jdbcUsername;
    private static String jdbcPassword;
    private static Connection jdbcConnection;
    
    public Accountdao(String jdbcURL, String jdbcUsername, String jdbcPassword)
    {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    public static void connect() throws SQLException 
    {
        if (jdbcConnection == null || jdbcConnection.isClosed()) 
        {
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
            } 
            catch (ClassNotFoundException e) 
            {
                throw new SQLException(e);
            }
            
            jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    public void disconnect() throws SQLException 
    {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) 
        {
            jdbcConnection.close();
        }
    }
    public static void withdraw(String accNumber,float amount) throws SQLException
    {
    	connect();
    	String sql="update accounts set balanve=balance -? where accountNumber= ?";
    	PreparedStatement pst=jdbcConnection.prepareStatement(sql);
    	pst.setFloat(1, amount);
    	pst.setString(2, accNumber);
    	int status=pst.executeUpdate();
    	System.out.println("Amount Withdrawn...... ");
    	
    }
    public static void deposit(String accNumber,float amount) throws SQLException
    {
    	connect();
    	String sql="update accounts set balanve=balance +? where accountNumber= ?";
    	PreparedStatement pst=jdbcConnection.prepareStatement(sql);
    	pst.setFloat(1, amount);
    	pst.setString(2, accNumber);
    	int status=pst.executeUpdate();
    	System.out.println("Amount Deposited...... ");
    	
    	
    	
    }
    public static void getBalance(String accNumber) throws SQLException
    {
    	connect();
    }
}
