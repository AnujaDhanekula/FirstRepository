package javaAssignments10;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Program1 
{
	public static void main(String[] args)
	{
		String str, rev = "";
	    Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	      int i,k=0;
	      for (  i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	      
	      for(i=0;i<str.length();i++)
	      {
	      if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u'))
	      {
	    	  k++;
	      }
	      } 
	      if (k >= 2)
				System.out.println("valid String:"+str);
			else
				System.out.println("Invalid String:"+str);
	}
}
	      
	      
	      /*
	        public class Program1 
	{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	       
			System.out.println("Enter your String:");
			String s = sc.nextLine();
			Program1 obj= new Program1 ();
			obj.display(s);
	}
}
	/*public static void display(String s) 
	{
		StringBuffer sb = new StringBuffer(s);
		
		int k = 0;
		
		LinkedHashSet<Character> l1 = new LinkedHashSet<Character>();
		
		String s2 = sb.reverse().toString();
		
		if (s2.equals(s))
		{
			String s3 = s2.toLowerCase();
 
			for (int i = 0; i < s3.length(); i++) 
			{
				l1.add(s3.charAt(i));
			}
			
			Iterator<Character> it = l1.iterator();
			while (it.hasNext()) 
			{
				char a = it.next();
 
				if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
					k++;
			}
		}
		if (k >= 2)
			System.out.println("valid String:"+s);
		else
			System.out.println("Invalid String:"+s);
	}
}
 */


