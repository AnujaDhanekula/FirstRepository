package streams;
import java.io.*;
public class Employee implements Serializable
{
	
	
		int empno;
		 String ename;
		 double salary;
		
		public Employee(int empno, String ename, double salary) 
		{
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
		}
		public void printEmployee()
		{
		System.out.println("EmployNum,EmployeName,EmploySalary: "+empno +ename  +salary);
		}
		
	}


