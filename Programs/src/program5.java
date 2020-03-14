import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter no of elements :");
		int  n = scan.nextInt();
        int  arr[] = new int[n];
        System.out.println("Enter all the elements:");
        
        for(int i=0;i<n;i++)
		{
        	arr[i] = scan.nextInt();
		}
        
       
        System.out.println("give a number :");
        int num=scan.nextInt();
        int s=0,reverse=0;
        	 for(int j=0;j<n;j++)
        	 {
        		 int temp;
        		 if(num<arr[j])
        		 {
        			temp=arr[j];
        			 s=s+temp;
        			
        		 }
        		 
        	 }
        	 System.out.println("sum of numbers greater than num :"+s);
		        
        	 while(s != 0)
        	    {
        	      reverse = reverse * 10;
        	      reverse = reverse + s%10;
        	      s = s/10;
        	    }

        	    System.out.println("Reverse of the number is " + reverse);
	}

}
