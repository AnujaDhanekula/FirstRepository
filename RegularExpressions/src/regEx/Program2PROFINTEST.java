package regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program2PROFINTEST 
{
	public static void compare(String input)
	{
		boolean in=false;
		
		 if((Pattern.matches("PRO[A-Za-z]{4}[0-9]{3}",input))||
				 (Pattern.matches("FIN[A-Za-z]{4}[0-9]{3}",input))||
				 (Pattern.matches("Test[A-Za-z]{4}[0-9]{3}",input)))
		{
			System.out.println("Valid input");
		}
		else
		{
			System.out.println("In Valid input");
		}
	}
	public static void main(String[] args) 
	{
	

	Scanner sc=new Scanner(System.in);
	String input;
	System.out.println("Enter input:");
	input=sc.next();
	compare(input);
	}

}
