package employee;
import java.util.*;

 class Employee implements Comparable<Employee> {
	 
    private int id;
    private int marks;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Employee arg0) {
		
		return 0;
	}
	


}   
public class Marks {

	public static void main(String[] args) {
		
		Map<Integer, Integer> hm = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter n value");
		int n=sc.nextInt();
		
		System.out.println("enter key and value");
		for(i=0;i<n;i++) 
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			
			System.out.println("enter Marks");
			hm.put(id,sc.nextInt());;
		}
		Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        
        while(iterator.hasNext()) 
        {
             Map.Entry me = (Map.Entry)iterator.next();
             System.out.print(me.getKey() + ": ");
             System.out.println(me.getValue());
             Collections.sort((List<Integer>) me);
        }
       
	}

}
