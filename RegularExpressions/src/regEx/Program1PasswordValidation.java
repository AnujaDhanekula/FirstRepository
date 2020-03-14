package regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program1PasswordValidation 
{
	public static void validatePassword(String password)
	{
		boolean b=false; 
		
		b=Pattern.matches("(?=.*\\d)(?=.*[@#$])(?=.*[a-zA-Z]).{6,20}",password);
		
		if(b==true)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	 
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String name,password;
		System.out.println("Enter your Name");
		name=sc.next();
		System.out.println("Enter your Password:");
		password=sc.next();
		Program1PasswordValidation obj=new Program1PasswordValidation ();
		obj.validatePassword(password);
		
	}

}
