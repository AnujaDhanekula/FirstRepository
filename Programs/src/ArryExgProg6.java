import java.util.ArrayList;

public class ArryExgProg6 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  
		  System.out.println("Original list: " + S);
		  S.remove(3);
		  
		  System.out.println("After removing third element from the list:\n"+S);
	}

}
