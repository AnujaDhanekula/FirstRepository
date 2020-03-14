import java.util.Scanner;
public class program10 { 
  static boolean isPalindrome(String str) 
    { 
 int i = 0, j = str.length() - 1; 
  while (i < j) { 
  if (str.charAt(i) != str.charAt(j)) 
                return false; 
  i++; 
  j--; 
        } 
 return true; 
    } 
  
  public static void main(String[] args) 
    { 
        System.out.println("Enter your String:");
        Scanner scanner = new Scanner(System. in);
        String str= scanner. nextLine();
        System.out.println("string given  is :"+str);
  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 

	
