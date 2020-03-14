package streams;
import java.io.*;
import java.util.*;
public class FileWrite {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		char ch;
		int x;
		try(FileReader fin=new FileReader("C:\\Users\\Admin\\Desktop\\Anuja\\fileresult.txt");
				FileWriter fout =new FileWriter("C:\\Users\\Admin\\Desktop\\Anuja\\file.txt"))
		{
			x=fin.read();
			while(x!=-1)
			{
				ch=(char)x;
				fout.write(ch);
				System.out.print(ch);
				x=fin.read();
				
			}
		}
	}

}
