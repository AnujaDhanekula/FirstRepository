package thread;

import java.util.function.Predicate;

public class EvenOROdd {

	public static void main(String[] args)
	{
		Predicate<Integer> p1=n->(n%2)!=0;
		System.out.println("Odd number:"+p1.test(10));
		System.out.println("Odd number:"+p1.test(5));

	}

}
