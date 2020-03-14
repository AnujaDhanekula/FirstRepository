package thread;

public class Add 
{

	public static void main(String[] args) 
	{
		Mathematics m=(a,b)->a+b;
		System.out.println(m.add(10,20));
		System.out.println(m.add(100,200));
	}

}
