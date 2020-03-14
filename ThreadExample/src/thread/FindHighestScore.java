package thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindHighestScore 
{

	public static void main(String[] args) 
	{
		String Topper=null;
			int total=0,max=0;
		ArrayList ar=new ArrayList();
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter no.of students");
		 
		 int n=sc.nextInt();
		 
		 for(int i=0;i<n;i++)
		 {
		 ar.add(sc.next());
		 }
		 System.out.println(ar);
		 Iterator itr=ar.iterator();
		 while(itr.hasNext())
		 {
			 String temp=(String) itr.next();
			 StringTokenizer stk= new StringTokenizer(temp,"-");
			 String name=stk.nextToken();
			 for(int i=0;i<stk.countTokens();i++)
			 {
				 int m1=Integer.parseInt(stk.nextToken());
				 int m2=Integer.parseInt(stk.nextToken());
				 int m3=Integer.parseInt(stk.nextToken());
				 total=m1+m2+m3;
				 if(total>=max)
				 {
				 max=total;
				 Topper=name;
				 }

			 }
			// System.out.println(temp);
		 }
		 System.out.println("The Topper is"+Topper);
		}
	}


