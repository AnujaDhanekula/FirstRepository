import java.util.Scanner;
public class TestVoting {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age");
			int a=sc.nextInt();
			Voting v=new Voting();
			try {
				v.testAge(a);
				}
			catch(InsufficientAgeException e)
				{
				System.out.println(e);
				}
			catch(InvalidAgeException e)
				{
				System.out.println(e);
				}
	}
		
	}


