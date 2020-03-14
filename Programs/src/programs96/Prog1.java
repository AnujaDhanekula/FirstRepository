package programs96;

import java.util.Scanner;

public class Prog1 {
			
	public static void main(String[] args) 
    {
				 int n, sumE = 0, sumO = 0;
				 
			     Scanner s = new Scanner(System.in);
			     
			     System.out.print("Enter the number:");
			        
			     n = s.nextInt();
			        
				 for(int i = 0; i < n; i++)
			        {
			            if(n % 2 == 0)
			            {
			                sumE = sumE + n;
			            }
			            else
			            {
			                sumO = sumO + n;
			            }
			        }
			        System.out.println("Sum of Even Numbers:"+sumE);
			        System.out.println("Sum of Odd Numbers:"+sumO);
			}
	
	}
