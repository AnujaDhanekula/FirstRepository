package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exampleforminmax {

	public static void main(String[] args) {
		product p1=new product("pen","1","2000");
		
		product p2=new product("pencil","2","3000");
		
		product p3=new product("box","3","1000");
		
		product p4=new product("clip","4","2500");
		
		product p5=new product("pen","5","2500");
		
		product p6=new product("eraiser","6","3500");
		
		product p7=new product("pen","7","1500");
		
		product p8=new product("pencil","8","2500");
		
		ArrayList<product> products =new ArrayList<product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		
		List <product> list1 =products.stream()
									.filter(p->p.name.equals("pen"))
									.map(p->p)
									.collect(Collectors.toList());
		System.out.println(list1);
		
		List <product> list2 =products.stream()
							.filter(p->p.name.equals("pen"))
							.sorted((a,b) ->a.price.compareTo(b.price))
							.collect(Collectors.toList());
			list2.forEach(System.out::println);
		
		
		product p=products.stream()
				.max((product a,product b)->a.price.compareTo(b.price))
				.get();
		
			System.out.println(p);
	}

}
