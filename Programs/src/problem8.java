import java.util.Scanner;

public class problem8 {
	public static int even(int n,int a[])
    {
		int i,j,sum = 0,flag=0;
    for( i = 0; i < n; i++)
    {
    	for( j=i+1;j<n;j++)
    	{
    		if(a[i]==a[i+1])
    		{
    			a[j]=a[n-1];
    			n--;
    			j--;
    		}
    	}
    }
    for( i = 0; i < n; i++)
    {
    	System.out.println(a[i]);
        
    }
    for(j=0;j<n;j++)
    {
    
        if(a[j]%2 == 0)
        
        {
        	flag=1;
            sum = sum + a[j];
        }
    }
	if(flag==0)
	{
		return -1;
	}
	else
	{
		return sum;
	}
 }
	


	public static void main(String[] args) 
	{
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        problem8 obj =new problem8();
        int r=obj.even(n,a);
        System.out.print("the sum of even numbers in an given array "+r);

	}
}

