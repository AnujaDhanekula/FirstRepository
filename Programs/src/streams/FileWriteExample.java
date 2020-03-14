package streams;
import java.io.*;
import java.util.*;
public class FileWriteExample {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		
		
		try(InputStreamReader cin=new InputStreamReader(System.in);
				FileOutputStream fout=new FileOutputStream ("C:\\Users\\Admin\\Desktop\\Anuja\\fileresult.txt");)
		{
			
			System.out.println("Enter Charaters :q ...for Quit");
			char c;
			do {
				c=(char)cin.read();
				fout.write(c);
				
			}while(c!='q');
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("file does not exist");
		}
		catch(IOException e)
		{
			System.out.println("");
		}
		
	}

}
