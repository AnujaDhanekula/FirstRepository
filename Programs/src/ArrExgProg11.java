import java.util.ArrayList;
public class ArrExgProg11 {

	public static void main(String[] args) {
		
		ArrayList <String>  ar = new ArrayList <String>();

		ar.add("Red");
		ar.add("Green");

	 System.out.println("Original array list: " + ar);
		  
		String new_color = "White";
		  
		  ar.set(1,new_color);

		  int num=ar.size();
		  System.out.println("Replace second element with 'White'."); 
		  
		  for(int i=0;i<num;i++)
		  System.out.println(ar.get(i));
	}

}
