package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample
{

	public static void main(String[] args) 
	{
		ArrayList <Integer>ar=new ArrayList<Integer>();
		Function<Integer,Integer> f= x->x*2;
		ar.add(0);
		ar.add(10);
		ar.add(15);
		ar.add(12);
		ar.add(20);
		ar.stream().map(x->x*2).forEach(System.out::println);
		List list =ar.stream().map(x->x*3).collect(Collectors.toList());
		System.out.println(list);
	}

}
