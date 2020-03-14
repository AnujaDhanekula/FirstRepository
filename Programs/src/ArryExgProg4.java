import java.util.ArrayList;

public class ArryExgProg4 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  
		  System.out.println("Original list: " + S);
		  
		  String element = S.get(0);
		  System.out.println("First element: "+element);
		  
		  element = S.get(2);
		  System.out.println("Third element: "+element);
	}

}
