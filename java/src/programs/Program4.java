package programs;

import java.util.Scanner;

public class Program4 
{
	public static String repeatFirstThreeCharacters(String str,int n)
	{

		int len=str.length();
			if(len<=3)
				{
				String r="";
				for(int i=0;i<n;i++)
					{
					r=str.concat(r);
					}
				return r;
				}
			else
				{
					String r="";
					String str2=str.substring(0,3);
					int len1=str2.length();
					for(int i=0;i<n;i++)
						{
							r=str2.concat(r);
						}
					return r;
				}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String str=sc.next();
		
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		Program4  r=new Program4 ();
		
		String result=r.repeatFirstThreeCharacters(str, n);
		System.out.println(result);
		

	}

}
