package streams;
import java.io.*;
import java.util.*;
public class BufferExample {

	public static void main(String[] args) throws IOException
	{
		try(
			InputStreamReader ipr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ipr);)
		{
		System.out.println("Enter your name:");
		String name=br.readLine();
		System.out.println("Enter your city:");
		String city=br.readLine();
		System.out.println("The Name is :"+name);
		System.out.println("The city is :"+city);
		}
	}

}
