import java.util.Scanner;
public class Program9 {

	public static void main(String[] args) {
		
		System.out.println("enter your string");
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int flag=0;
		 String ch[]= str.split("\\.");
		 for(int i=0;i<ch.length;i++)
		 {
	int var=Integer.parseInt(ch[i]);
	if(!(var>=0 && var<=255))
	{
		flag=1;
		break;
	}
		 }
		 if(flag==1)
		 {
			 System.out.println("InValid");
		 }
		 else
			 System.out.println("Valid");
	}

}
