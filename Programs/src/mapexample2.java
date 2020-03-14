import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class Students
		{
			
			String name;
			@Override
			public String toString() 
			{
				return "name=" + name + ", m1=" + m1 + ", m2=" + m2 ;
			}
			int m1;
			int m2;
			Students(String name,int m1,int m2)
			 {
				 
				 
				 this.name=name;
				 this.m1=m1;
				 this.m2=m2;
			 }
		}
public class mapexample2 
{

		public static void main(String[] args)
		{
				
				HashMap<Integer,Students> hm=new HashMap<Integer,Students>();
				Students s1=new Students("anuja",50,55);
				Students s2=new Students("siri",60,65);
				Students s3=new Students("ruchi",40,45);
				Students s4=new Students("mydhili",30,35);
				hm.put(111,s1);
				hm.put(222,s2);
				hm.put(333,s3);
				hm.put(444,s4);
				
				System.out.println(hm);
				
				Set entries =hm.entrySet();
				
				Iterator itr1=entries.iterator();
				System.out.println("Students who failed in m2 marks are:");
				while(itr1.hasNext())
				{
					
					Map.Entry  me = (Map.Entry)itr1.next();
					Students s=(Students)me.getValue();
					if(s.m2<=40)
						System.out.println(me.getKey()+"   "+s.name);
				}
				

			}
		
	}


