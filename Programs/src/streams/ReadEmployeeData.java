package streams;
import java.io.*;

public class ReadEmployeeData {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\Anuja\\emp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		double Total=0.0;
		try
		{
			while(true)
			{
				int eno=dis.readInt();
				String ename=dis.readUTF();
				double sal=dis.readDouble();
				Total =Total+sal;
				System.out.println("Emp no:"+eno);
				System.out.println("Emp name:"+ename);
				System.out.println("Emp salary:"+sal);
			}
		}
		catch(EOFException e)
		{
			System.out.println(Total);
		}
		fis.close();
		bis.close();
		dis.close();
		
	}

}
