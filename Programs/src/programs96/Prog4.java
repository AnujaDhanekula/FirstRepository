package programs96;
import java.util.Scanner;
public class Prog4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("enter ur string:");
				String s=sc.nextLine();
				
				StringBuffer sb=new StringBuffer();
				
				if(s.length()%2==0)
				{
			      sb.append(s.substring(s.length()/2-1,s.length()/2+1));
			      //System.out.println(sb.toString());
					
				}
				System.out.println(sb.toString());
			}

		

	}


