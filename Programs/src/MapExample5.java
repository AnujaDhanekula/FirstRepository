import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample5 
{

	public static void main(String[] args)
	{
		
		HashMap<Integer,Integer> stats= new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entities......");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the year....");
			int year=sc.nextInt();
			System.out.println("enter the admissions....");
			int noa= sc.nextInt();
			stats.put(year, noa);
			
		}
		Set set=stats.entrySet();
		Iterator itr=set.iterator();
		int max=0;
		Integer tyear=0,temp=0;
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			 temp=(Integer) entry.getValue();
			if(temp>max)
			{
				max=temp;
				tyear= (Integer)entry.getKey();
				
			}
		}
		System.out.println("The details of maximum admission are:");
		System.out.println("year:  " +tyear+ "number of admissions  "+max);

	}

}
