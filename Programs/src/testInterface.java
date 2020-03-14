
interface car
{
	public abstract void color();
	public abstract void speed();
	public abstract void price();
	
	default  void brand()
	{
		System.out.println("Choose ur choice....");
		
	}
	public static void choose()
	{
		System.out.println("1.merchedes   2.jaguar");
	}
	
}
class merchedes implements car
{
	public  void color()
	{
		System.out.println("merchedes :Black");
		
	}
	public void speed()
	{
		System.out.println("speed - 250 km/h (155 mph), 300 km/h");
	}
	public void price()
	{
		System.out.println(" price -Rs. 2.73 crore for the top model Mercedes-Benz S-Class.");
	}
}
class jaguar implements car
{
	public  void color()
	{
		System.out.println("Jagur : Red");
		
	}
	public void speed()
	{
		System.out.println("speed - 200 miles per hour" );
	}
	public void price()
	{
		System.out.println("price - £150,000 pounds in the United Kingdom");
	}
}
public class testInterface {

	public static void main(String[] args) {
		
		
		merchedes obj1 =new merchedes ();
		obj1.brand();
		car.choose();
		obj1.color();
		obj1.speed();
		obj1.price();
		
		jaguar obj2 =new jaguar();
		obj2.color();
		obj2.speed();
		obj2.price();
	}

}
