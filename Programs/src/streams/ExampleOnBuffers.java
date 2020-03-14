package streams;
import java.io.*;
import java.util.*;
public class ExampleOnBuffers {

	public static void main(String[] args) throws IOException
	{
		try(
			InputStreamReader ipr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ipr);)
			{
			System.out.println("Enter Number of Students");
			int [] number;
			int i;
			for(i=0;i<number;i++)
			{
				
			}
			System.out.println("Enter your students name:");
			String  name=br.readLine();
			System.out.println("Enter your city:");
			String city=br.readLine();
			System.out.println("The Name is :"+name);
			System.out.println("The city is :"+city);
			}

	}

}
