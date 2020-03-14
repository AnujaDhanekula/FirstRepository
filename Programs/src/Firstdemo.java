
public class Firstdemo  extends  Firstinter.one implements  InnerDemo.one
{

	public void greater(int e,int f)
	{
		int h ;
		h=(e>f)?e:f;
		System.out.println("the greater is:"+h);
	}
	public static void main(String[] args) {
		Firstdemo obj = new Firstdemo();
		obj.display();
		obj.greater(22, 55);
	}

}
