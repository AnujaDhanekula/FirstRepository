import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
 class MapExample4
{

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		ArrayList<String> ar = new ArrayList<String>();
		hm.put("111", "india");
		hm.put("222", "anujaA");
		hm.put("333", "dhannekulaA");
		hm.put("444", "goodgirL");
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry= (Map.Entry)itr.next();
			
			String str =(String) entry.getValue();
			 if((str.charAt(0)>=97) && (str.charAt(0)<=123) && (str.charAt(str.length()-1)>=65)  && (str.charAt(str.length()-1)<=90))
				{
				 ar.add(str);
				}
			 
		}
		System.out.println("The names which are satisfying the condition:");
		 for(String c:ar)
		 {
			 System.out.println(c);
		 }
	}

}
