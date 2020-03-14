import  java.util.Scanner;
public class Program3 {
		public void TestString(String str)
		{
			if ((str.charAt(0)!='j')&&( str.charAt(1)!='b'))
			{
				for(int i=2;i<str.length();i++)
				System.out.println(str.charAt(i));
			}
			else
			{
				System.out.println(str);
			}
				
		}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter ur String value:");
		int i;
		 String str=scan.nextLine();
		 Program3 obj =new Program3();
		 obj.TestString(str);
	       
	}

}
