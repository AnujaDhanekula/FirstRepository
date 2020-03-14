package streams;
import java.util.*;
import java.util.function.Function;
public class SortedExample {

	public static void main(String[] args)
	{
		ArrayList <Integer>ar=new ArrayList<Integer>();
		
		ar.add(8);
		ar.add(10);
		ar.add(1);
		ar.add(12);
		ar.add(2);
		ar.add(8);
		ar.add(10);
		ar.add(1);
		ar.add(12);
		ar.add(2);
		//ar.stream().sorted().forEach(System.out::println);
		//ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		long cnt =ar.stream().distinct().count();
		System.out.println(cnt);
	}

}
