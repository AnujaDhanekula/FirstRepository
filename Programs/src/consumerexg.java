import java.util.function.Consumer;

public class consumerexg
{

	public static void main(String[] args) 
	{
		Consumer<String> c=s->System.out.println(s);
		c.accept("hello");
		c.accept("anuja");
		
		Consumer<Integer> p=x->{
			if(x>=20)
				System.out.println("greater than 20");
			else
				System.out.println("less than 20");
		};
		
		p.accept(10);
 
	}

}
