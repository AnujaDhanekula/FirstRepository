package javaAssignments10;

import java.util.Scanner;

public class Program5 
{
	public static void main (String[] args)  
    { 

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n=sc.nextInt();
	int rev=0,i=0,c=0;
	while(n!=0)
	{
	int r=n%10;
	rev=rev*10+r;
	if(r==0&&i==0)
	c++;
	else
	i=1;
	n/=10;
	}
	System.out.println("Reverse of the given number:");
	for(int j=0;j<c;j++)
	System.out.print("0");
	System.out.print(rev);
    }
}
	/*static int reversDigits(int num) 
	    { 
	        int rev_num = 0; 
	        while(num > 0) 
	        { 
	            rev_num = rev_num * 10 + num % 10; 
	            num = num / 10; 
	        } 
	        return rev_num; 
	    } 
	      
	    
	    public static void main (String[] args)  
	    { 
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter your number:");
		    int num = sc.nextInt();
	        System.out.println("Reverse of no. is " + reversDigits(num)); 
	    } 

	}

*/
