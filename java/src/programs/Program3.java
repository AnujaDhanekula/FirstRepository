package programs;

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) 
	{

			int n;
			int[] a = new int[10];

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of the array:");
			n = sc.nextInt();
			
			System.out.println("Enter array elements:");
			for (int i = 0; i < n; i++) 
				{
					a[i] = sc.nextInt();
				}
			
			Program3  obj=new Program3 ();
			
			boolean s=obj.checkTripplets(n,a);
			System.out.println(s);
			
	}
 

		public static boolean checkTripplets(int n,int a[])
		{
				int c=0,flag=0;
				for(int i=0;i<=n-3;i++)
					{
						if((a[i]==a[i+1])&&(a[i]==a[i+2]))
							{
								flag=1;
								break;
							}
					}	
		if(flag==1)
		return true;
		else
		return false;
		}
		
}
 


