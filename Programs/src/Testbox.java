
 class Box2D
{
	int l;
	int b;
	int a;
	Box2D()
	{
		l=2;
		b=3;
		System.out.println("inside Box2D");
	}
	static
	{
		System.out.println("static block in Box2D");
	}
	public void calArea()
	{
		a=l*b;
		System.out.println(" area:" +a);
	}
}
 class Box3D extends Box2D
{
	int h;
	int vol;
	Box3D()
	{
		h=4;
		System.out.println("inside Box3D");
	}
	static
	{
		System.out.println("static block in Box3D");
	}
	public void calVolume()
	{
		calArea();
		vol=l*b*h;
		System.out.println(" volume:" +vol);
	}
}
public class Testbox {
	

	public static void main(String[] args) {
		Box3D   obj =new Box3D();
		obj.calVolume();
	

	}

}
