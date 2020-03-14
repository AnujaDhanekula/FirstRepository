import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
class TempEmploye
{
	String name;
	double salary;
	public TempEmploye(String name,double salary)
	{
		super();
		
		this.name=name;
		this.salary=salary;
	}
}
public class BiFunctionalInterfaces3Examples {

	public static void main(String[] args) 
	{
		//BiPredicate-Interface
		/*BiPredicate<Integer,Integer> bip=(a,b)->(a+b)%2==0;
		
		System.out.println(bip.test(10, 2));
		System.out.println(bip.test(1, 1));
		System.out.println(bip.test(1, 2));
		
		//BiFunction-Interface
		BiFunction<Integer,Integer,Integer> bifMul =(a,b)->(a*b);
		System.out.println("multiplication :"+bifMul.apply(10, 20));
		
		BiFunction<Integer,Integer,Integer> bifAdd =(a,b)->(a+b);
		System.out.println("Addition :"+bifAdd.apply(10, 2));
		
		BiFunction<Integer,Integer,Integer> bifSub =(a,b)->(a-b);
		System.out.println("Subbtraction:"+bifSub.apply(10, 2));
		                                                                              
		
		BiFunction<String,String,Student> bi =(htno,name)->new Student(htno,name);
		Student s1=bi.apply("123","anuja");
		Student s2=bi.apply("456","dhanekula");
		System.out.println(s1);
		System.out.println(s2);
		
		//BiConsumer-Interface
		BiConsumer<String,String> bic=(str1,str2)->System.out.println(str1+str2);
		bic.accept("Anuja", "Dhanekula");
		*/
		ArrayList<TempEmploye> ar=new ArrayList<TempEmploye>();
		
		ar.add(new TempEmploye("anuja",1000));
		ar.add(new TempEmploye("siri",2000));
		ar.add(new TempEmploye("ruchi",3000));
		ar.add(new TempEmploye("mydhili",4000));
		
		BiConsumer<TempEmploye,Double> bie =(c,d)->c.salary=c.salary+d;
		
		for(TempEmploye c:ar)
		{
			bie.accept(c,500.0);
			System.out.println("Employee Name:"+c.name);
			System.out.println("Employee Salary:"+c.salary);
			System.out.println();
		}
		
		/*for(TempEmploye c:ar)
		{
		System.out.println("Employee Name:"+c.name);
		System.out.println("Employee Salary:"+c.salary);
		System.out.println();
		}*/
		
	}

}
