import java.util.ArrayList;

public class ArryExgProg5 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  
		  System.out.println("Original list: " + S);
		  	S.set(2, "Yellow");
		 
		  System.out.println(S);
	}

}
