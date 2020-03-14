package regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Program3htmlcolor 
{
	public static void validatecolor(String color)
	{
		boolean input=false;
		input=Pattern.matches("(#)[A-Z0-9]{8}",color);
		if(input==true)
		{
			System.out.println("Valid Color");
		}
		else
		{
			System.out.println("In Valid Color");
		}
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String color;
	System.out.println("Enter color name:");
	color=sc.next();
	validatecolor(color);
	
	
}
}
