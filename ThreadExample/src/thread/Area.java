package thread;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Area {

	public static void main(String[] args) 
	{
		Function <Integer,Double> area=r->(3.14)*r*r;
		Double r=area.apply(5);
		System.out.println(r);
		BiFunction <Integer,Integer,Integer> bignum=(a,b)->
				{
					if(a>b)
						return a;
					else 
						return b;
				};
		System.out.println("Greatest Number:"+bignum.apply(10, 2));
	}

}
