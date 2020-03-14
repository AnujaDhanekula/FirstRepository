
abstract public class Supermarket {
	abstract public void payment();
	abstract public void implementSecurityforOnline();
	public void selectProducts()
	{
		System.out.println("goods selected as per base company rules");
	}
	public void shipmentofGoods()
	{
		System.out.println("goods delivered as per base company rules");
	}

}
class Market1 extends Supermarket
{
	 public void payment()
	{
		 System.out.println("cash payment only....");
	}
	 public void insuranceonProducts()
	 {
		 System.out.println("insurance also provided...");
	 }
	 public void implementSecurityforOnline()
	 {
		 System.out.println("no online security is required...");
	 }
}
class Market2 extends  Supermarket
{
	 public void payment()
	{
		 System.out.println("debit card only..");
	}
	 
	 public void implementSecurityforOnline()
	 {
		 System.out.println("online security is required...");
	 }
	 
	 public static void main (String [] args)
	 {
		 
	 Market2 obj= new Market2();
	obj.selectProducts();
	obj.payment();
	obj.implementSecurityforOnline();
	obj.shipmentofGoods();
	 }
}