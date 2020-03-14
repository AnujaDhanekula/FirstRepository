package dao;

import data.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class EmployeeDAO 
{
	public Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			if(con!=null)
				System.out.println("Connected...");
			else
				System.out.println("Not Connected...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
		
	}
	
	public int insertEmployee(Employee emp)
	{
		int result=0;
		try
		{
			Connection con=getConnection();
			
			String sql="insert into employee values(?,?,?,?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getId());
			pst.setString(3, emp.getDept());
			pst.setString(4, emp.getDesg());
			pst.setString(5, emp.getCompany());
			pst.setString(6, emp.getEmail());
			
			result=pst.executeUpdate();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	public List<Employee> showEmployees()
	{
		List<Employee> list= new ArrayList<Employee>();
		
		try
		{
			Connection con=getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next())
			{
			Employee emp=new Employee();
			
			emp.setName(rs.getString(1));
			emp.setId(rs.getString(2));
			emp.setDept(rs.getString(3));
			emp.setDesg(rs.getString(4));
			emp.setCompany(rs.getString(5));
			emp.setEmail(rs.getString(6));
			list.add(emp);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
		
	}
	
	public Employee searchEmp(String id)
	{
		Employee emp=new Employee();
		try
		{
			Connection con=getConnection();
			
			String sql="select * from employee where id=?";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1,id);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				
				emp.setName(rs.getString(1));
				emp.setId(rs.getString(2));
				emp.setDept(rs.getString(3));
				emp.setDesg(rs.getString(4));
				emp.setCompany(rs.getString(5));
				emp.setEmail(rs.getString(6));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(emp);
		return emp;
		
		
	}
	
	
}
