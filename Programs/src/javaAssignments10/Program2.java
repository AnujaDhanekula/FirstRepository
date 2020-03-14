package javaAssignments10;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
	    int n = sc.nextInt();
	    int sum=0,rem;
	    while(n>0)
	    {
	      
	      rem=n%10;
	      
	      if(rem%2!=0)
	      {
	        sum = sum+rem;
	      }
	      n = n/10;
	    }
	    
	    if(sum%2==0)
	    {
	      System.out.println("Sum of odd digits in the given number:"+sum);
	    }
	    else
	    {
	        System.out.println("Sum of odd digits in the given number:"+sum);
	      }

	    

	}

}
