import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		int e ,f,h;
		Scanner cin =new Scanner(System.in);
		System.out.println("enter e f");
		e=cin.nextInt();
		f=cin.nextInt();
		try
		{
			h=e/f;
			System.out.println("The Quotient is:"+h);
			
		}
		catch(java.lang.ArithmeticException obj)
		{
			System.out.println("the error is" +obj);
		}
		System.out.println("Hello java");
		System.out.println("Exception Handling");
	}

}
