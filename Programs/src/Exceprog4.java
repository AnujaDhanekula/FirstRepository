import java.util.Scanner;

public class Exceprog4 {

		public void divisionMethod(int a,int b)
		{
			Scanner scan=new Scanner(System.in);
		      System.out.println("Enter a n b values: ");
		      a=scan.nextInt();
		      b=scan.nextInt();
	      System.out.println("The division of a n b :"+(a/b)); 
		}
	public static void main(String[] args) {
		try
		{
			Exceprog4 obj=new Exceprog4();
			int a=0,b=0;
			obj.divisionMethod(a,b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
	}

}
