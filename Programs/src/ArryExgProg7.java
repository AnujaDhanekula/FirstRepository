import java.util.ArrayList;

public class ArryExgProg7 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  System.out.println("Original list: " + S);
		  
		if (S.contains("R")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
	}

}
