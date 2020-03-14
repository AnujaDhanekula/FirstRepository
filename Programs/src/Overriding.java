
class base
{
	int l;
	int b;	
	
	base()
	{
		l=2;
		b=2;
	}
	public void show1()
	{	
		
	System.out.println(" l="+l+ ""+ "b="+b);
	}
}
  class derived extends base
{
		int l;
		int b;	
		
	derived()
	{
		l=4;
		b=8;	
	}

	public void show1()
	{
		
			
	System.out.println(" l="+super.l+ " " +"b="+super.b);
	}
}

public class Overriding {

	public static void main(String[] args) {

		derived  obj =new derived();
		obj.show1();
	}
}
