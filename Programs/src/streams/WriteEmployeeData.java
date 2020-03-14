package streams;
import java.io.*;
import java.util.*;

public class WriteEmployeeData 
{

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Anuja\\emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeInt(1);
		dos.writeUTF("Anuja");
		dos.writeDouble(1000.0);
		
		dos.writeInt(2);
		dos.writeUTF("siri");
		dos.writeDouble(2000.0);
		
		dos.writeInt(1);
		dos.writeUTF("ruchi");
		dos.writeDouble(3000.0);
		System.out.println("objects written to file.......");
		
		fos.close();
		
		
	}

}
