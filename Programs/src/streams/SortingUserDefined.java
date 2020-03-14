package streams;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortingUserDefined {

	public static void main(String[] args) 
	{
		product p1=new product("pen","1","2000");
		product p2=new product("pencil","2","3000");
		product p3=new product("box","1","1000");
		product p4=new product("clip","1","2500");
		ArrayList<product> products =new ArrayList<product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		List <product> list =products.stream()
				.sorted((a,b) ->a.name.compareTo(b.name))
				.collect(Collectors.toList());
			list.forEach(System.out::println);
	}

}
