import java.util.ArrayList;

public class ArryExgProg3 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  
		  System.out.println("Original list: " + S);
		  S.add(0, "Pink");
		  S.add(5, "Yellow");
		 
		  System.out.println(S);
	}

}
