package thread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Read2n 
{

	public static void main(String[] args) 
	{
		int sum=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Enter Number of key Value Pairs:");
		HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			hm.put(sc.nextInt(),sc.nextInt());
		}
		
		Set keys=hm.entrySet();
		
			Iterator itr=keys.iterator();
		
			while(itr.hasNext())
				{
					Map.Entry me = (Map.Entry)itr.next();
					int k = (int)me.getKey();
					if(k%2!=0) {
						int val=(int)me.getValue();
						sum=sum+val;
						
						count++;
					}
				}
			System.out.println("Sum of odd keys:"+sum);
			int avg = sum/count;
			System.out.println("Average of odd values "+avg);
		
		}
		
	}


