package streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class CountExample {

	public static void main(String[] args) {

		Stream s=Stream.of(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> predicate=x->x%2==0;
		long cnt =s.filter(predicate).count();
		System.out.println(cnt);

	}

}
