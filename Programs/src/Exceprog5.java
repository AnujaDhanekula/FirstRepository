import java.util.Scanner;
class NegativeValueException extends Exception
{
	NegativeValueException()
	{
		super("Entered value is negitive value");
	}
}
class ValuesOutofRangeException extends Exception
{
	ValuesOutofRangeException()
		{
		super("Entered value is Out of range");
		}
}
public class Exceprog5
{
public static void main(String[] args)  throws NegativeValueException , ValuesOutofRangeException
{

	Scanner sc=new Scanner(System.in);
	int avg=0,s=0;
	String[]  str=new String[3];
	int a[]=new int[3];
	System.out.println("Enter 2 Student names");
	for(int i=0;i<2;i++)
		str[i]=sc.nextLine();
	try 
	{
		for(int j=0;j<2;j++)
		{
			s=0;
			avg=0;
			System.out.println("Enter 3 Subject marks of student "+(j+1));
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();

		for(int i=0;i<3;i++)
		{
			if(a[i]<0)
			{
				throw new NegativeValueException();
			}
			else if(a[i]>100)
			{
				throw new ValuesOutofRangeException();
			}
			else
			{
				s=s+a[i];
			}
		}

		avg=s/3;
		System.out.println("Sum is "+s+" avg is "+avg);
		}
	}
		catch(NumberFormatException e)
			{
				System.out.println("Number format exception");
			}
		catch(NegativeValueException e)
			{
			System.out.println(e);
			}
		catch(ValuesOutofRangeException e)
			{
			System.out.println(e);
			}
}
}
