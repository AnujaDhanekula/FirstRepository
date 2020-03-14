package streams;
import java.util.*;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		Consumer<Integer> consumer=x->{
			if(x%2==0)
				System.out.println(x+" is even number");
			else
				System.out.println(x+" is odd number");	
		};
			ar.add(0);
			ar.add(10);
			ar.add(5);
			ar.add(6);
			ar.add(7);
			ar.stream().forEach(consumer);
	}

}
