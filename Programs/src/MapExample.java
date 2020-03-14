import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample
{

		public static void main(String[] args)
		{
				
		HashMap hm =new HashMap();
		Object rest=hm.put("k1", "India");
		hm.put("k1", "India");
		hm.put("k2", "china");
		hm.put("k3", "pak");
		hm.put("k4", "uk");
		hm.put("k5", "India");
		Object obj=hm.putIfAbsent("k1", "canada");
		System.out.println(rest);
		System.out.println(obj);
		System.out.println(hm);
		Object obj1=hm.remove("k5");
		System.out.println("after removal..."+obj1);
		System.out.println(hm);
		
		Set keys=hm.keySet();
		
		Iterator itr=keys.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Set entries =hm.entrySet();
		
		Iterator itr1=entries.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry  me = (Map.Entry)itr1.next();
			System.out.println(me.getKey()+"   "+me.getValue());
		}
		System.out.println(keys);
		
		}
		
}	
	
