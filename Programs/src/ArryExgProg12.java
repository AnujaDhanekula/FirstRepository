import java.util.ArrayList;

public class ArryExgProg12 {

	public static void main(String[] args) 
	{
		
		ArrayList <String> ar=new ArrayList <String>();
	ar.add("oracle");
	ar.add("Dotnet");
	ar.add("selenium");
	ar.add("java");
	System.out.println("Original array list: " + ar);
	
	  System.out.println("Print using index of an element: ");
	  int no_of_elements = ar.size();
	  
	  for (int index = 0; index < no_of_elements; index++)
		  
	   System.out.println(ar.get(index));
	
	}
}
