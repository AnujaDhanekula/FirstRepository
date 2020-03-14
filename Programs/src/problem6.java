import java.util.Scanner;
public class problem6 {

	public boolean Compare(String str1,String str2,int n)
	{
		StringBuffer sbf = new StringBuffer(str2);
		sbf.reverse().toString();
		if(str1.charAt(n)==sbf.charAt(n))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter 1st string : ");
        String Str1= scanner.nextLine();
        System.out.print("Enter 2nd string : ");
        String Str2= scanner.nextLine();
        int n;
        System.out.print("Enter a number: ");
        n=scanner.nextInt();
        problem6 obj= new problem6();
        boolean r=obj.Compare(Str1, Str2, n);
        System.out.print("Reverse of a string:" +r);
	}

}
