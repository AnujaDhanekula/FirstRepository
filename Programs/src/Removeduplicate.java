import java.util.Scanner;
public class Removeduplicate 
{
public static int removeDuplicateElements(int arr[], int n)
{  
		  if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++)
	        {  
	            if (arr[i] != arr[i+1])
	            {  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  


			public static void main(String[] args)
			{
	   
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:"+n);
        for(int i = 0; i < n; i++)
        {
        	if (i % 2 == 0) 
			{
				sum = sum + i;
			}
        }
        System.out.println("Sum of even numbers:"+sum);
        int arr[] = {2,5,6,4,2,8,9,1,0,0,0};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");
	}

}
