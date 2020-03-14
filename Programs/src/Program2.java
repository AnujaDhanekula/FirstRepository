import  java.util.Scanner;
public class Program2 {
	public void add(int x,int y,int z)
	{
		if(x!=13 && y!=13 && z!=13)
		{
			int r=(x+y+z);
			System.out.println("The sum of 3 numbers :"+r);
		}
		else if(x!=13 && y!=13 && z==13 )
		{
			int t=x+y;
			System.out.println("The sum of 2 numbers :"+t);
		}
		else if(x!=13 && y==13 && z!=13 )
		{
			int s=x;
			System.out.println("The sum of 1 number :"+s);
		}
		else
		{
			System.out.println("The given numbers consists of 13 summation doesnot works");
		}
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter x value:");
		int x=scan.nextInt();
		System.out.println("enter y value:");
		int y=scan.nextInt();
		System.out.println("enter z value:");
		int z=scan.nextInt();
		
		Program2 obj =new Program2();
		obj.add(x, y, z);

	}

}
