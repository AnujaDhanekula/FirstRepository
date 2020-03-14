import java.util.function.Function;

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
public class prefuncexam {

	public static void main(String[] args) 
	{
		/*
		Function<String,Integer> f1=s->s.length();
		System.out.println("The lenght of a string :"+f1.apply("india"));
				
		Function<Integer,Integer> f2=n->n*n;
		System.out.println("The square of a number :"+f2.apply(4));
		
		Function<Integer,Integer> fact=x->{
			int f=1;
			for(int i=2;i<=x;i++)
				f=f*i;
			return f;
			
		};
		System.out.println("The Factorial of given num is:"+fact.apply(5));
		
		Function<String,Integer> f3=s->{
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
				{
					c++;
				}
			}
			return c;
		};
	System.out.println("no of vowels in a given string :"+f3.apply("anuja"));
		
		Function<String,Integer> strcount=s->{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					count++;
				}
			}
			return count;
			
		};
		System.out.println("the num of characters in a given string:"+strcount.apply("I am Anuja"));
		*/
		
		user user1 =new user("admin","1234");
		user user2 =new user("anuja","dhanekula");
		Function<user,Boolean> tuser=u->u.uid.equals("admin") && u.pwd.equals("1234");
		if(tuser.apply(user2))
			System.out.println("Valid User...");
		else
			System.out.println("InValid User...");
		
		Function<user,String> ts=u->
		{
			if(u.uid.equals("admin") && u.pwd.equals("1234"))
			return "Valid User...";
			
			else
			return "InValid User...";
		};
		System.out.println(ts.apply(user1));
		
	}

}
