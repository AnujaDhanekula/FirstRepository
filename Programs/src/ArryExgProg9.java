import java.util.ArrayList;
import java.util.List;

public class ArryExgProg9 {

	public static void main(String[] args) {
		
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  System.out.println("Original list: " + S);
		  
		  List<String> sub_S = S.subList(0, 2);
		  System.out.println("List of first three elements: " + sub_S);
	}

}
