import java.util.Scanner;

public class Program4 {
	public void sumOfDigits(int n)
	{
		int sum=0;
		while(n>0 || sum >9)
		{
			if (n == 0) 
			{ 
                n = sum; 
                sum = 0; 
            } 
            
			sum=sum+n%10;
			n=n/10;
			
		}
		System.out.println("the sum of the given digits:"+sum);
		
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter ur  value:");
		int n=scan.nextInt();
		
		 Program4 obj =new Program4();
		 obj.sumOfDigits(n);
	       
	}

}
