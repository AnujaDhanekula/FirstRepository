import java.util.function.Predicate;
/*interface testNumber
{
	public  boolean testStr(int x);
}
interface testPrime
{
	public  boolean isPrime(int x);
}*/
class user
{
	String uid;
	String pwd;
	public user(String uid,String pwd)
	{
		super();
		this.uid=uid;
		this.pwd=pwd;
	}
}
public class PrediExample 
{

	public static void main(String[] args) 
	{
		user user1 =new user("admin","1234");
		user user2 =new user("anuja","dhanekula");
		Predicate<user> tuser=u->u.uid.equals("admin") && u.pwd.equals("1234");
		if(tuser.test(user1))
			System.out.println("Valid User...");
		else
			System.out.println("InValid User...");
	}
		/*int [] x={0,5,10,15,20,25,30};
		Predicate<Integer> p1= I ->(I>10);
		Predicate<Integer> p2= i ->(i%2==0);
		System.out.println("the numbers greater than 10");
		m1(p1,x);
		System.out.println("the even numbers  are");
		m1(p2,x);
		System.out.println("the numbers  not greater than 10");
		m1(p1.negate(),x);
		System.out.println("the numbers greater than 10 and even:");
		m1(p1.and(p2),x);
		System.out.println("the numbers greater than 10 or even :");
		m1(p1.or(p2),x);
	}
		public static void m1(Predicate<Integer>p, int[] x)
		{
			for(int x1:x)
			{
				if(p.test(x1))
					System.out.println(x1);
			}
		}*/
}


/*
		Predicate<String> p2= str->(str.length()>=3);
		Predicate<Integer>*/

/*testPrime p3= i ->{ 
			boolean flag=true;
			for(int x=2;x<i;i++)
			{
				if(i%x==0)
				{
					flag=false;
					break;
				}
						
			}
			return flag;
		};
/*testNumber tn= i->{
			if(i>10)
				return true;
			else
				return false;
		};
		Predicate<String> p4= str->(str.charAt(0)=='k');*/

/*String[] names= {"anu","kavya","kiwi","anuja"};
		Predicate<String> ktest= str->(str.charAt(0)=='k');
		for(String n:names)
		{
			if(ktest.test(n))
			{
				System.out.println(n); 
			}
		}*/
/*Predicate<Integer> p5= I ->(I>20);
		Predicate<Integer> p6= i ->(i%2==0);
		int values[]= {10,23,34,2,5,19};
		
		System.out.println(p5.test(22));
		System.out.println(p6.test(2));
		System.out.println(p5.and(p6).test(22));
		System.out.println(p5.or(p6).test(21));
		
		/*System.out.println(p1.test(11));
		System.out.println(p1.test(2));
		System.out.println(p2.test("abc"));
		System.out.println(p2.test("pqrw"));
		System.out.println(p3.isPrime(6));
		System.out.println(p4.test("anuja"));
		System.out.println(p4.test("kavya"));*/
		
