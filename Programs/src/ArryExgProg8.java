import java.util.ArrayList;
import java.util.*;
public class ArryExgProg8 {

	public static void main(String[] args) {
		ArrayList<String> S = new ArrayList<String>();
		  S.add("Red");
		 S.add("Green");
		 S.add("Orange");
		 S.add("White");
		  S.add("Black");
		  System.out.println("Original list: " + S);
		 Collections.sort(S);
		  System.out.println("After Sorting : " + S);
	}

}
