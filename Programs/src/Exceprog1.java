import java.util.Scanner;
import java.util.InputMismatchException;
public class Exceprog1 {

	public static void main(String[] args) {
		
			    try 
			    {
			    	String str="123";
				      int inum = Integer.parseInt(str);
				      Scanner scan=new Scanner(System.in);
				      System.out.println("Enter an integer: ");
				      inum=scan.nextInt();
			      System.out.println("The square value is :"+inum*inum); 
			    } 
			    catch (InputMismatchException e) 
			    {
			      System.out.println("Entered input is not a valid format for an integer.");
			    }
			
	}

}
