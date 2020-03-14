package streams;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(1);
		ar.add(66);
		ar.add(13);
		ar.add(7);
		Integer value1= ar.stream().max((a,b)->a<b?-1:1).get();
		System.out.println("max value:"+value1);
		
		Integer value2= ar.stream().min((a,b)->a<b?-1:1).get();
		System.out.println("min value:"+value2);
	}

}
