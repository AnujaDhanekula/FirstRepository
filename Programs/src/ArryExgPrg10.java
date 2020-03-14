import java.util.ArrayList;
		import java.util.List;
public class ArryExgPrg10 {

	public static void main(String[] args) {
		
		
		        ArrayList<String> list1 = new ArrayList<String>();
		        list1.add("a");
		        
		        ArrayList<String> list2 = new ArrayList<String>();
		        list2.add("b");
		        
		        ArrayList<String> joined = new ArrayList<String>();
		        
		        joined.addAll(list1);
		        
		        joined.addAll(list2);
		        
		        System.out.println("list1: " + list1);
		        System.out.println("list2: " + list2);
		        System.out.println("joined: " + joined);
		    }
		
	}


