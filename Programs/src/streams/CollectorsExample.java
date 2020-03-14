package streams;
import java.util.*;
import java.util.stream.Collectors;
public class CollectorsExample {
	class product
	{
		String name;
		int id;
		double price;
		@Override
		public String toString() {
			return "product [name=" + name + ", id=" + id + ", price=" + price + "]";
		}
		public product(String name,int id, double price) {
			super();
			this.name = name;
			this.id = id;
			this.price = price;
		}
		
	}
	public static void main(String[] args)
	{
		product p1=new product("pen",1,2000);
		product p2=new product("pencil",2,3000);
		product p3=new product("box",1,1000);
		product p4=new product("clip",1,2500);
		ArrayList<product> products =new ArrayList<product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		
		List<Double> productpricelist=products.stream()
				.map(x->x.price)
				.collect(Collectors.toList());
		
		Set<Double> productpricelist1=products.stream()
				.map(x->x.price)
				.collect(Collectors.toSet());
		
		Double sumPrices=products.stream()
				.collect(Collectors.summingDouble(x->x.price));
		
		Integer sumId=products.stream()
				.collect(Collectors.summingInt(x->x.id));
		
		Double averages=products.stream()
				.collect(Collectors.summingDouble(x->x.price));
	}

}
