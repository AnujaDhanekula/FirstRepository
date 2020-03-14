package java844334;

import java.util.Scanner;

 class InvalidAgeException extends Exception{

	public InvalidAgeException()
	{
		super("Age cannot be -ve ....!Sorry");
	}

}
 class InsufficientAgeException extends Exception
 {

		public InsufficientAgeException()
		{
		super("Age is not sufficinet:age less than 18");
		}
}

public class ExceptionsAGE 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
	
		System.out.println("Enter your Age To check in Exceptions:");
		int n=scan.nextInt();
		try 
		{
			
				if(n<0)
				{
					throw new InvalidAgeException();
				}
				else if(n<18)
				{
					throw new InsufficientAgeException();
				}
				else
				{
					System.out.println("Your are Eligible for Voting ...! Congrats");
				}
			}

			
			catch(InsufficientAgeException iae)
				{
					System.out.println(iae);
				}
			catch(InvalidAgeException e)
				{
				System.out.println(e);
				}
			
		
	}

}
