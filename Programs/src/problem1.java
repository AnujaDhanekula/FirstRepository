import java.util.Scanner;

public class problem1 {

			
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
	        	for(int j=0;j<n;j++)
	        	{
	        		
	        		if(arr[j]==10)
	        		{
	        		int temp=0;
	        		arr[j]=temp;
	        		}	
				}
	        	for(int j=0;j<n;j++)
					System.out.println(arr[j]);
			}
			 
			

			
	}


