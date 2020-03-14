import java.util.Scanner;
public class Exceprog2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of elements in the array");
		n=scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements in the array:");
		for(i=0;i<n;i++)
		a[i]=scan.nextInt();
		System.out.println("Enter the index of the array element you want to access:" );
		int si=scan.nextInt();
		try
		{
		System.out.println("The array element successfully accessed"+""+a[si]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
	}
	

}
