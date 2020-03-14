package employee;
import java.util.*;

class Hike
{

	public static HashMap<Integer, Integer> increaseSalaries(int n,HashMap <Integer, String>hm1,HashMap <Integer, Integer>hm2)
		{
			Set keys=hm1.keySet();
			
		 Iterator itr=keys.iterator();
		 
		 HashMap <Integer,Integer>res =new HashMap <Integer,Integer>();
		 
		 while(itr.hasNext())
		 {
			 
			 
			 int id=(int) itr.next();
			 String s=hm1.get(id);
			 if(s.equals("manager"))
			 {
				 int newsal=hm2.get(id)+5000;
				 res.put(id,newsal);
			 }
			 
			 
		 }
		 return res;
		}
}
public class UserMainCode {

public static void main(String[] args) {

	HashMap <Integer,String> hm1=new HashMap<Integer,String>();
	HashMap <Integer,Integer>hm2=new HashMap<Integer,Integer>();
	int i=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter n value");
	int n=sc.nextInt();
	
	System.out.println("enter key and value");
	for(i=0;i<n;i++) 
	{
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter desgination");
		hm1.put(id,sc.next());
		
		System.out.println("enter salary");
		hm2.put(id,sc.nextInt());
	}
    
    HashMap <Integer,Integer>res=Hike.increaseSalaries(n,hm1, hm2);
	System.out.println("Employee whose desgination is manager there final Salary:"+res);
	

}

}
