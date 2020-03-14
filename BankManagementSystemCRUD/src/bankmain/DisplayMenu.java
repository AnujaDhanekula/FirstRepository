package bankmain;

import java.sql.*;
import java.util.*;

import dao.Accountdao;
import dao.UserDao;
import dto.Accounts;
import dto.Users;


public class DisplayMenu 
{
	public static int existingUser() throws SQLException 
	{
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bank Customer Application");
		
		System.out.println("Enter User name");
		
		String uname = sc.next();
		
		System.out.println("Enter password");
		
		String pwd = sc.next();
		
		Users user = new Users(uname,pwd);
		
		int status = userdao.checkUser(user);
		
		if(status==1)
			
			System.out.println("Valid User...");
		else
			System.out.println("Invalid user...");
		
		userdao.disconnect();
		return status;
	}
	public static void newUser() throws SQLException 
	{
		UserDao userdao = new UserDao("jdbc:mysql://localhost:3306/jdbc","root","root");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("you have to register first...");
		
		System.out.println("Enter username");
		
		String uname = sc.next();
		
		System.out.println("Enter password");
		
		String pwd = sc.next();
		
		Users user = new Users(uname,pwd);
		
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.next();
		
		System.out.println("Enter AccountType");
		String acctType = sc.next();
		
		System.out.println("Enter Customer Name");
		String custName = sc.next();
		
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		
		Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
		UserDao.createCustomer(accounts, user);
		
	}
	public void showMenuOptions() throws SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1: newUser();
				break;
				
		case 2:int status=existingUser();
				if(status==1) 
				{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice::");
			int ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1:
						System.out.println("Enter account number::");
						String acntnum=sc.next();
						System.out.println("Enter amount to deposit::");
						float amnt=sc.nextFloat();
						Accountdao.deposit(acntnum,amnt);
						break;
			case 2:
						System.out.println("Enter account number::");
						String acntnum1=sc.next();
						System.out.println("Enter amount to deposit::");
						float amnt1=sc.nextFloat();
						Accountdao.withdraw(acntnum1,amnt1);
						break;
			case 3:
						System.out.println("Enter account number::");
						String acntnum2=sc.next();
						Accountdao.getBalance(acntnum2);
						break;
			}
			}
			break;
			
		default: System.out.println("Wrong Choice...");
		}
		
	}

}
