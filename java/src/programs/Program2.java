package programs;

import  java.util.Scanner;
public class Program2 {
	public void getLuckySum(int a,int b,int c)
	{
		if(a!=13 && b!=13 && c!=13)
		{
			int r=(a+b+c);
			System.out.println("The sum of 3 numbers :"+r);
		}
		else if(a!=13 && b!=13 && c==13 )
		{
			int t=a+b;
			System.out.println("The sum of 2 numbers :"+t);
		}
		else if(a!=13 && b==13 && c!=13 )
		{
			int s=a;
			System.out.println("The sum of 1 number :"+s);
		}
		else if(a==13 && b!=13 && c!=13)
		{
			int sum=c;
			System.out.println("The Sum of the Number:"+sum);
		}
		else
		{
			
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a value:");
		int a=scan.nextInt();
		System.out.println("enter b value:");
		int b=scan.nextInt();
		System.out.println("enter c value:");
		int c=scan.nextInt();
		
		Program2 obj =new Program2();
		obj.getLuckySum(a, b, c);

	}

}
