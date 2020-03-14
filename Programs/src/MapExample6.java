import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class MapExample6 
{

	public static void main(String[] args) 
	{
		ArrayList<String> co1=new ArrayList<String>();
		
		co1.add("java");
		co1.add("Dotnet");
		co1.add("oracle");
		co1.add("selenium");
		
		//System.out.println(co1);
		
		HashSet<String> hs1= new HashSet<String>();
		hs1.add("anu");
		hs1.add("siri");
		hs1.add("ruchi");
		hs1.add("mydhili");
		
		//System.out.println(hs1);
		
		PriorityQueue<String> pq1= new PriorityQueue<String>();
		pq1.add("apple");
		pq1.add("mango");
		pq1.add("grape");
		
		//System.out.println(pq1);
		
		 Map<String,Collection> map =new HashMap<String,Collection>();

		 map.put("List",co1);
		 map.put("Set",hs1);
		 map.put("Queue",pq1);
		 
		Set entries=map.entrySet();
		Iterator itr=entries.iterator();

		while(itr.hasNext())
		{
		Map.Entry me=(Map.Entry)itr.next();
		  System.out.println(me.getKey()+" "+me.getValue());

		}
	}

}
