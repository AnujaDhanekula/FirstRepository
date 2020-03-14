import java.util.*;

public class Main2 {

	public static void main(String[] args) {
	
		
	   Scanner scanner = new Scanner(System.in);  
    System.out.println("Enter first array no:"); 
    int ele1=scanner.nextInt();
    int arr1[]=new int[ele1];
      for ( int x= 0; x< ele1; x++)  
      {
    	  arr1[x] = scanner.nextInt(); 
      }
       
      System.out.println("Enter second array no:"); 
      int ele2=scanner.nextInt();
      int arr2[]=new int[ele2];
        for ( int x= 0; x< ele2; x++)  
        {
      	  arr2[x] = scanner.nextInt(); 
        }

    
  System.out.println(UserMainCode2.matchSum(arr1,arr2,ele1,ele2));


		
	}
}
