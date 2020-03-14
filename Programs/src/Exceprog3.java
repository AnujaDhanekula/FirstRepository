import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceprog3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n,i;
		int sum=0,average=0;
		try
		{
			
			n=args.length;
			int a[] = new int[n];
			for(i=0;i<n;i++)
			a[i]=Integer.parseInt(args[i]);
		
			
			for(i=0;i<n;i++)
			{
				sum=sum+a[i];
				average=sum/n;
			}
		System.out.println("the sum of the given elements:" +""+sum);
		System.out.println("the average of the given elements:" +""+average);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
	}

}
