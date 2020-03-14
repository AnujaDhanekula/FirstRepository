package java844334;

import java.util.Scanner;

public class Pan 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome Customer......!");
		System.out.println("Enter Your PAN number:");
		String s1= sc.next();
		getvalues(s1);
	}
	public static void getvalues(String s1) 
	{
		if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
		{
		System.out.println("Valid Number");
		}
		else
		System.out.println("Invalid Number");
		}

	}



