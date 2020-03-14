

import java.util.Scanner;

public class KasperNumber {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n,i,sum=0,rem;
			System.out.println("Enter a Number:");
			n=sc.nextInt();
			int sq=(n*n);
			System.out.println("Square of a Given Number:" +sq);
			
			while(sq!=0)
		    {
			
			sum=sum+sq%10;
			sq=sq/10;
		    }
			if(sum==n)
		    System.out.println("Given Number is a Kaspher Number"+sum);
			else
				System.out.println("Given Number is Not a Kaspher Number"+sum);
	}

}
