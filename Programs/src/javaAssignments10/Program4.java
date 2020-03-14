package javaAssignments10;

import java.util.Scanner;

public class Program4 
{

	public static void main(String[] args)
	{
		 
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a string");
		  String str=scan.nextLine();
		  System.out.println("Enter a integer value");
		  int num=scan.nextInt();
		  StringBuffer sb=new StringBuffer();
		  if(num<num/2)
		  {
		  sb.append(str.substring(0,num));
		  sb.append(str.substring(str.length()-num));
		  System.out.println("the first n and last n string is "+sb.toString());
		  }
		  else
		  {
			  System.out.println("Enter valid number ");
		  }
	}
}
		
