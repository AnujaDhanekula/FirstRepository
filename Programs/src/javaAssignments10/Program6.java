package javaAssignments10;

import java.util.Scanner;
public class Program6 
{
	 public  int display(int n, int[] a)
	 {
		    
		      int sum = 0;
		      for (int i = 0; i < n; i++)
		        sum = (int) (sum + Math.pow(a[i], i));
		      return sum;
	}
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    for (int i = 0; i < n; i++) 
	    {
	      a[i] = sc.nextInt();
	    }
	    Program6 obj=new Program6 ();
	    obj.display(n, a);
	  }
	
}
