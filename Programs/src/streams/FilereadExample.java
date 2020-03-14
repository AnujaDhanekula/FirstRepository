package streams;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
public class FilereadExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream ("C:\\Users\\Admin\\Desktop\\Anuja\\Ctsanu\\src\\Examples\\Programs\\src\\streams\\test.txt");
			FileOutputStream fout=new FileOutputStream("output.txt");
			int i;
			char ch;
			while((i=fis.read())!=-1)
			{
				ch=(char)i;
				System.out.print(ch);
				fout.write(ch);
			}
			fis.close();
			fout.close();
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
